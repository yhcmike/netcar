package org.netCar.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.netCar.dao.VehiclepositionDao;
import org.netCar.domain.VehicleAccessFenceRecordEntity;
import org.netCar.dto.VehiclepositionJMS;
import org.netCar.service.VehicleAccessFenceService;
import org.netCar.service.VehiclepositionService;
import org.netCar.service.cache.AbnormalagCache;
import org.netCar.service.cache.FenceDataCache;
import org.netCar.service.cache.GetOutEntryRecordCache;
import org.netCar.service.cache.PositionCache;
import org.netCar.util.AlarmUtil;
import org.netCar.util.JsonUtil;
import org.netCar.vo.FenceVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by lyq on 2017/4/19.
 */
@Service
public class VehiclepositionServiceImpl implements VehiclepositionService {

	private static Logger logger = LoggerFactory.getLogger(VehiclepositionServiceImpl.class);

	@Autowired
	VehiclepositionDao vehiclepositionDao;

	@Autowired
	private PositionCache positionCache;

	@Autowired
	private AbnormalagCache abnormalagCache;

	@Autowired
	private GetOutEntryRecordCache getOutEntryRecordCache;

	@Autowired
	private MongoTemplate mongoTemplate;

	@Autowired
	private FenceDataCache fenceDataCache;

	@Autowired
	private VehicleAccessFenceService vehicleAccessFenceService;

	@Override
	public void operationPostion(VehiclepositionJMS position) {

		// 1:查询位置所在区域和上次所在区域比较
		String vehicleNo = position.getVehicleNo();
		String lastCode = positionCache.getCodeByVehicleNo(vehicleNo);

		// 判断当前在哪个区围栏
		String nowCode = whereAreaFence(1, position.getLongitude(), position.getLatitude());
		/** 根据车辆经纬度 设置地图的集合信息、车辆的最新位置。并保存轨迹信息 start */
		if (StringUtils.isBlank(lastCode)) {
			positionCache.setVehicleNoCode(vehicleNo, nowCode);
		} else if (!lastCode.equals(nowCode)) {
			positionCache.deletePosition(lastCode, vehicleNo);
			positionCache.setVehicleNoCode(vehicleNo, nowCode);
		}

		if (!StringUtils.isBlank(nowCode)) {
			Map<String, String> map = new HashMap<String, String>();
			String str = JsonUtil.obj2Str(position);
			map.put(vehicleNo, str);
			positionCache.deletePosition(lastCode, vehicleNo);
			positionCache.setPosition(nowCode, map);
			logger.info("redis insert success nowCode:" + nowCode);
		} else {// 如果 nowCode == null 说明：经纬度不在合肥市，需要删除车辆的位置和聚合信息
			positionCache.deletePosition(lastCode, vehicleNo);
		}

		// 存mongdb
		mongoTemplate.insert(position);
		logger.info("operationPostion end");
		/** 根据车辆经纬度 设置地图的集合信息、车辆的最新位置。并保存轨迹信息 end */

		/** 根据车辆经纬度 生成出入围栏记录 start */
		String nowFenceId = whereAreaFence(2, position.getLongitude(), position.getLatitude());
		String lastFencetId = getOutEntryRecordCache.getIdByVehicleNo(vehicleNo);
		if (StringUtils.isBlank(nowFenceId)) {
			if (!StringUtils.isBlank(lastFencetId)) {
				getOutEntryRecordCache.deleteVehicleNoCode(vehicleNo);// 出围栏删掉记录
				// 出围栏记录入库
				VehicleAccessFenceRecordEntity entity = new VehicleAccessFenceRecordEntity();
				entity.setFenceId(Integer.parseInt(lastFencetId));
				entity.setVehicleNo(vehicleNo);
				entity.setPositionTime(position.getPositionTime());
				entity.setLongitude(position.getLongitude());
				entity.setLatitude(position.getLatitude());
				entity.setOrderId(position.getOrderId());
				entity.setType(0);
				vehicleAccessFenceService.save(entity);
			}
		} else {
			if (StringUtils.isBlank(lastFencetId)) {
				getOutEntryRecordCache.setVehicleNoCode(vehicleNo, nowFenceId);
				// 入围栏记录入库
				VehicleAccessFenceRecordEntity entity = new VehicleAccessFenceRecordEntity();
				entity.setFenceId(Integer.parseInt(nowFenceId));
				entity.setVehicleNo(vehicleNo);
				entity.setPositionTime(position.getPositionTime());
				entity.setLongitude(position.getLongitude());
				entity.setLatitude(position.getLatitude());
				entity.setOrderId(position.getOrderId());
				entity.setType(1);
				vehicleAccessFenceService.save(entity);

			} else if (!nowFenceId.equals(lastFencetId)) {
				getOutEntryRecordCache.setVehicleNoCode(vehicleNo, nowFenceId);
				// 出lasFencetId围栏， 入nowFenceId围栏

				VehicleAccessFenceRecordEntity accessEntity = new VehicleAccessFenceRecordEntity();
				accessEntity.setFenceId(Integer.parseInt(nowFenceId));
				accessEntity.setVehicleNo(vehicleNo);
				accessEntity.setPositionTime(position.getPositionTime());
				accessEntity.setLongitude(position.getLongitude());
				accessEntity.setLatitude(position.getLatitude());
				accessEntity.setOrderId(position.getOrderId());
				accessEntity.setType(1);
				vehicleAccessFenceService.save(accessEntity);

				VehicleAccessFenceRecordEntity getOutEntity = new VehicleAccessFenceRecordEntity();
				getOutEntity.setFenceId(Integer.parseInt(lastFencetId));
				getOutEntity.setVehicleNo(vehicleNo);
				getOutEntity.setPositionTime(position.getPositionTime());
				getOutEntity.setLongitude(position.getLongitude());
				getOutEntity.setLatitude(position.getLatitude());
				getOutEntity.setOrderId(position.getOrderId());
				getOutEntity.setType(0);
				vehicleAccessFenceService.save(getOutEntity);
			}

		}

		/** 根据车辆经纬度 生成出入围栏记录 end */

		/** 根据车辆经纬度 统计每个异常聚集内车辆数量 start */
		String nowId = whereAreaFence(3, position.getLongitude(), position.getLatitude());
		String lastId = abnormalagCache.getIdByVehicleNo(vehicleNo);
		if (StringUtils.isBlank(lastId)) {
			if (!StringUtils.isBlank(nowId)) {
				abnormalagCache.incrementNum(nowId, 1);
				abnormalagCache.setVehicleNoCode(vehicleNo, nowId);
			}
		} else {
			if (!StringUtils.isBlank(nowId) && !nowId.equals(lastId)) {
				abnormalagCache.incrementNum(lastId, -1);
				abnormalagCache.incrementNum(nowId, 1);
				abnormalagCache.setVehicleNoCode(vehicleNo, nowId);
			}
		}
		/** 根据车辆经纬度 统计每个异常聚集内车辆数量 end */

	}

	private String whereAreaFence(Integer type, double longitude, double latitude) {
		Map<String, String> map = fenceDataCache.getAllFencesData(type);
		for (String key : map.keySet()) {
			String value = map.get(key);
			FenceVo fenceVo = JsonUtil.json2Obj(value, FenceVo.class);
			boolean flag = AlarmUtil.withinRangeFence(longitude, latitude, fenceVo);
			if (flag) {
				return key;
			}
		}
		return null;
	}
}

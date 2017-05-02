package org.netCar.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.netCar.dao.VehiclepositionDao;
import org.netCar.dto.VehiclepositionJMS;
import org.netCar.service.VehiclepositionService;
import org.netCar.service.cache.FenceDataCache;
import org.netCar.service.cache.PositionCache;
import org.netCar.util.AlarmUtil;
import org.netCar.util.JsonUtil;
import org.netCar.vo.SpotVo;
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
	private MongoTemplate mongoTemplate;

	@Autowired
	private FenceDataCache fenceDataCache;

	@Override
	public void operationPostion(VehiclepositionJMS position) {

		// 1:查询位置所在区域和上次所在区域比较
		String vehicleNo = position.getVehicleNo();
		String lastCode = positionCache.getCodeByVehicleNo(vehicleNo);

		// 判断当前在哪个区围栏
		String nowCode = whereAreaFence(position.getLongitude(), position.getLatitude());

		if (StringUtils.isBlank(lastCode)) {
			positionCache.setVehicleNoCode(vehicleNo, nowCode);
		} else if (StringUtils.isBlank(nowCode)) {
			positionCache.deletePosition(lastCode, vehicleNo);
		} else if (!lastCode.equals(nowCode)) {
			positionCache.deletePosition(lastCode, vehicleNo);
			positionCache.setVehicleNoCode(vehicleNo, nowCode);
		}

		Map<String, String> map = new HashMap<String, String>();
		String str = JsonUtil.obj2Str(position);
		map.put(vehicleNo, str);
		positionCache.setPosition(nowCode, map);
		logger.info("redis insert success nowCode:" + nowCode);

		// 存mongdb
		mongoTemplate.insert(position);
		logger.info("operationPostion end");
	}

	private String whereAreaFence(double longitude, double latitude) {
		Map<String, String> map = fenceDataCache.getAllFencesData(1);
		for (String key : map.keySet()) {
			String value = map.get(key);
			List<SpotVo> spotVoList = JsonUtil.extractList(value, SpotVo.class);
			SpotVo[] spotVoArr = new SpotVo[spotVoList.size()];
			spotVoList.toArray(spotVoArr);

			boolean flag = AlarmUtil.isPtInPoly(longitude, latitude, spotVoArr);
			if (flag) {
				return key;
			}
		}
		return null;
	}

}

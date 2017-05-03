package org.netCar.service.impl.init;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.netCar.domain.AbnormalAggregationEntity;
import org.netCar.service.AbnormalAggregationService;
import org.netCar.service.FenceService;
import org.netCar.service.cache.FenceDataCache;
import org.netCar.util.JsonUtil;
import org.netCar.vo.FenceVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("initFenceData")
public class InitFenceData {
	private static Logger LOG = LoggerFactory.getLogger(InitFenceData.class);
	@Autowired
	private FenceService fenceService;
	
	@Autowired
	private AbnormalAggregationService abnormalAggregationService;

	@Autowired
	private FenceDataCache fenceDataCache;

	public void initFence() {
		//初始化区围栏数据（地图聚合显示的时候用到）
		List<FenceVo> datas1 = fenceService.listFencesByCounty(1, 1);
		LOG.info("init area fence data,total:" + datas1.size());
		Map<String, String> map1 = new HashMap<String, String>();
		for (FenceVo fenceVo : datas1) {
			String str = JsonUtil.obj2Str(fenceVo);
			map1.put(fenceVo.getName(), str);
		}
		fenceDataCache.setFencesData(1, map1);
		
		//初始化出入记录围栏
		List<FenceVo> datas2 = fenceService.listFencesByCounty(2, 1);
		LOG.info("init Common fence data,total:" + datas2.size());
		Map<String, String> map2 = new HashMap<String, String>();
		for (FenceVo fenceVo : datas2) {
			String str = JsonUtil.obj2Str(fenceVo);
			map2.put(fenceVo.getId().toString(), str);
		}
		fenceDataCache.setFencesData(2, map2);
		
		//初始化异常聚集围栏数据
		List<AbnormalAggregationEntity> entityList = abnormalAggregationService.listFencesByCounty(1);
		LOG.info("init abnormal aggregation fence data,total:" + entityList.size());
		Map<String, String> map3 = new HashMap<String, String>();
		for(AbnormalAggregationEntity entity : entityList){
			FenceVo fenceVo = new FenceVo();
			fenceVo.setId(entity.getId());
			fenceVo.setName(entity.getName());
			fenceVo.setRadius(entity.getRadius());
			fenceVo.setShape(0);
			fenceVo.setSpots("["+entity.getLng()+","+entity.getLat()+"]");
			String str = JsonUtil.obj2Str(fenceVo);
			map3.put(fenceVo.getId().toString(), str);
			fenceDataCache.setFencesData(3, map3);
		}
		
	}

}

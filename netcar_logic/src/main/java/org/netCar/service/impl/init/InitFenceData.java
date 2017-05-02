package org.netCar.service.impl.init;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.netCar.domain.FenceEntity;
import org.netCar.service.FenceService;
import org.netCar.service.cache.FenceDataCache;
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
	private FenceDataCache fenceDataCache;

	public void initFence() {
		List<FenceEntity> datas1 = fenceService.listFencesByCounty(1, 1);
		LOG.info("init area fence data,total:" + datas1.size());
		Map<String, String> map1 = new HashMap<String, String>();
		for (FenceEntity entity : datas1) {
			map1.put(entity.getName(), entity.getSpots());
		}
		fenceDataCache.setFencesData(1, map1);
		
		List<FenceEntity> datas2 = fenceService.listFencesByCounty(2, 1);
		LOG.info("init Common fence data,total:" + datas2.size());
		Map<String, String> map2 = new HashMap<String, String>();
		for (FenceEntity entity : datas2) {
			map2.put(entity.getName(), entity.getSpots());
		}
		fenceDataCache.setFencesData(2, map2);
	}

}

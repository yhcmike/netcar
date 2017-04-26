package org.netCar.service.init;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.netCar.domain.FenceEntity;
import org.netCar.service.FenceService;
import org.netCar.service.cache.FenceDataCache;
import org.netCar.util.JsonUtil;
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
	
	public void initFence(){
		List<FenceEntity> datas = fenceService.listFencesByCounty("区围栏", 1);
		LOG.info("init fences data,total:"+datas.size());
		Map<String,String> map = new HashMap<String,String>();
		for(FenceEntity entity : datas){
			String str = JsonUtil.obj2Str(entity);
	        map.put(entity.getName(),str);
		}
		fenceDataCache.setFencesData(map);
	}

}

package org.netCar.service.cache;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * 驾驶员实时定位信息
 */
@Component
public class FenceDataCache {

	private static Logger LOG = LoggerFactory.getLogger(FenceDataCache.class);

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	/**
	 * 区域围栏：地图聚合时用到
	 */
	private static final String FENCEDATA1 = "fence_data_type1";

	/**	
	 * 出入记录围栏
	 */
	private static final String FENCEDATA2 = "fence_data_type2";

	/**
	 * code 行政区域编码 map key-- String: 行政区域编码 var---String:驾驶员定位信息
	 */
	public void setFencesData(Integer type, Map<String, String> map) {
		if (type == 1) {
			redisTemplate.opsForHash().putAll(FENCEDATA1, map);
		} else if (type == 2) {
			redisTemplate.opsForHash().putAll(FENCEDATA2, map);
		} else {
			LOG.error(" add fence data,type:{} error ", type);
		}
	}

	public Map<String, String> getAllFencesData(Integer type) {
		Map<String, String> map = new HashMap<String, String>();
		String tempKey = type == 1 ? FENCEDATA1 : FENCEDATA2;
		Iterator<Object> iter = redisTemplate.opsForHash().keys(tempKey).iterator();
		while (iter.hasNext()) {
			String key = (String) iter.next();
			String val = (String) redisTemplate.opsForHash().get(tempKey, key);
			map.put(key, val);
		}
		return map;
	}

}

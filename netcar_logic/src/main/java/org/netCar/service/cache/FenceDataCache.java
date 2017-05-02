package org.netCar.service.cache;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * 驾驶员实时定位信息
 */
@Component
public class FenceDataCache {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    private static final String FENCEDATA = "fence_data";

    /**
     * code  行政区域编码
     * map key-- String: 行政区域编码
     *     var---String:驾驶员定位信息
     */
    public void setFencesData(Map<String, String> map) {
        redisTemplate.opsForHash().putAll(FENCEDATA,map);
    }

}

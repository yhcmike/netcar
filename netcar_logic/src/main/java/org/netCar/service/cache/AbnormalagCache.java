package org.netCar.service.cache;

/**
 * Created by zhangfei on 2017/4/27.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * 异常聚集缓存类
 */
@Component
public class AbnormalagCache {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    
    private static final String ABNORMALAG = "abnormalag_";
    
    private static final String ABNORMALAG_ID_VEHICLENO = "abnormalag_id_vehicleno";

    /**
     * id-- 异常围栏ID
     * num---进入围栏车辆数
     */
    public void incrementNum(String id, int num){
		redisTemplate.opsForHash().increment(ABNORMALAG,id,num);
	}

    /**
	 * 车辆位置与异常聚集围栏关系表
	 *
	 *  vehicleNo  机动车牌号
	 *  id 异常聚集围栏id
	 */
	public void setVehicleNoCode(String vehicleNo , String id ) {
		redisTemplate.opsForHash().put(ABNORMALAG_ID_VEHICLENO, vehicleNo,id);
	}

	/**
	 * vehicleNo  机动车牌号
	 */
	public  String  getIdByVehicleNo(String vehicleNo){
		return (String) redisTemplate.opsForHash().get(ABNORMALAG_ID_VEHICLENO,vehicleNo);
	}

}

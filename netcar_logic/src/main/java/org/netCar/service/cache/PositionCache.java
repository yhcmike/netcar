package org.netCar.service.cache;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * 车辆实时定位信息
 */
@Component
public class PositionCache {

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	
	private static final String CAR = "car_";

	private static final String CARCODE = "car_code";

	/**
	 * 
	 * code  行政区域编码
	 * map key-- String: vehicleNo  车牌号
	 *     var---VehiclePosition:车辆实时定位信息
	 */
	public void setPosition(String code , Map<String, String> map ) {
		redisTemplate.opsForHash().putAll(CAR+code,map);
	}

	public void deletePosition(String code,String vehicleNo){
		redisTemplate.opsForHash().delete(CAR+code,vehicleNo);
	}

	/**
	 * 车辆位置与区域关系表
	 * 用来解决跨域车辆删除上次所在区域信息
	 *  vehicleNo  机动车牌号
	 *  code 行政区域编码
	 */
	public void setVehicleNoCode(String vehicleNo , String code ) {
		redisTemplate.opsForHash().put(CARCODE, vehicleNo,code);
	}

	/**
	 * vehicleNo  机动车牌号
	 */
	public  String  getCodeByVehicleNo(String vehicleNo){
		return (String) redisTemplate.opsForHash().get(CARCODE,vehicleNo);
	}
}


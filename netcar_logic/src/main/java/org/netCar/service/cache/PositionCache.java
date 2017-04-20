package org.netCar.service.cache;

import org.netCar.domain.VehiclePositionEntity;
import org.netCar.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 车辆实时定位信息
 */
@Component
public class PositionCache {

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	
	private static final String POSITION = "position";

	private static final String CAR = "car_";

	private static final String CARCODE = "car_code";

//	private static final String CODENUM = "codeNum";


	//行政区域统计  +1 -1 ---暂时不用
//	public void incrementNum(String code, int num){
//		redisTemplate.opsForHash().increment(CODENUM, code, num);
//	}

	/**
	 * code  行政区域编码
	 * map key-- String: vehicleNo  车牌号
	 *     var---VehiclePosition:车辆实时定位信息
	 */
	public void setPosition(String code , Map<String, String> map ) {
		redisTemplate.opsForHash().putAll(CAR+code,map);
	}

	/**
	 * 获取该行政区域下面的所有车辆信息--实时信息，接收到位置信息时判断车辆是否在该区域。车辆状态：1：载客 2：接单 3：空驶 4：停运
	 * @param code  行政区域编码
	 * return
	 */
	public Map<String, VehiclePositionEntity> getPositionByCode(String code) {
		Map<String, VehiclePositionEntity> result = new HashMap<String, VehiclePositionEntity>();
		Map<Object, Object> map = (Map<Object, Object>)redisTemplate.opsForHash().entries(CAR+code);
		for (Map.Entry<Object, Object> entry : map.entrySet()) {
			result.put((String)entry.getKey(), JsonUtil.json2Obj((String) entry.getValue(), VehiclePositionEntity.class));
		}
		return result;
	}


	/**
	 * 车辆位置与区域关系表
	 * 用来解决跨域车辆删除上次所在区域信息
	 *  LicenseId  机动车驾驶证号
	 *  code 行政区域编码
	 */
	public void setDriverCode(String vehicleNo , Integer code ) {
		redisTemplate.opsForHash().put(CARCODE, vehicleNo,code);
	}

	/**
	 * LicenseId  机动车驾驶证号
	 */
	public  String  getDriverbyVehicleNo(String vehicleNo){
		return (String) redisTemplate.opsForHash().get(CARCODE,vehicleNo);
	}


	/**
	 * @param code  行政区域编码
	 * @param vehicleNo   车牌号
	 *  return
	 */
	public VehiclePositionEntity getPosition(String code,String vehicleNo) {
		String json = (String)redisTemplate.opsForHash().get(CAR+code, vehicleNo);
		if(json != null && !"".equals(json)){
			return JsonUtil.json2Obj(json, VehiclePositionEntity.class);
		}
		return null;
	}

}


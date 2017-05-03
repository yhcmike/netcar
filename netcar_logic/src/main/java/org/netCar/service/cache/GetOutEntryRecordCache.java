package org.netCar.service.cache;


/**
 * 出入记录缓存
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;


@Component
public class GetOutEntryRecordCache {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    
    private static final String VEHICLE_ID_RECORD = "vehicle_id_record";


    /**
	 * 车辆位置与围栏关系表
	 *
	 *  vehicleNo  机动车牌号
	 *  id 围栏id
	 */
	public void setVehicleNoCode(String vehicleNo , String id ) {
		redisTemplate.opsForHash().put(VEHICLE_ID_RECORD, vehicleNo,id);
	}
	
	/**
	 * 
	 * @param vehicleNo
	 */
	public void deleteVehicleNoCode(String vehicleNo) {
		redisTemplate.opsForHash().delete(VEHICLE_ID_RECORD, vehicleNo);
	}

	/**
	 * vehicleNo  机动车牌号
	 */
	public  String  getIdByVehicleNo(String vehicleNo){
		return (String) redisTemplate.opsForHash().get(VEHICLE_ID_RECORD,vehicleNo);
	}

}

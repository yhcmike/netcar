package org.netCar.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.netCar.domain.TestVehiclePosition;
import org.springframework.stereotype.Repository;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Repository
public class TestVehiclePositionDao extends BaseHBDao<TestVehiclePosition, Integer> {

	public List<TestVehiclePosition> listAllByOrderId(String orderId) {
	   StringBuffer sql = new StringBuffer("");
	   sql.append(" select                                     ");
	   sql.append(" 	`id` id,                                ");
	   sql.append(" 	`company_id` companyId,                 ");
	   sql.append(" 	`address` address,                      ");
	   sql.append(" 	`vehicle_no` vehicleNo,                 ");
	   sql.append(" 	`plate_color` plateColor,               ");
	   sql.append(" 	`vehicle_region_code` vehicleRegionCode,");
	   sql.append(" 	`position_time` positionTime,           ");
	   sql.append(" 	`longitude` longitude,                  ");
	   sql.append(" 	`latitude` latitude,                    ");
	   sql.append(" 	`speed`,                                ");
	   sql.append(" 	`direction`,                            ");
	   sql.append(" 	`elevation`,                            ");
	   sql.append(" 	`mileage`,                              ");
	   sql.append(" 	`encrypt`,                              ");
	   sql.append(" 	`warn_status` warnStatus,               ");
	   sql.append(" 	`veh_status` vehStatus,                 ");
	   sql.append(" 	`biz_status` bizStatus,                 ");
	   sql.append(" 	`order_id` orderId                      ");
	   sql.append(" from sc_vehicle_position                   ");
	   Map<String,Object> params = new HashMap<String,Object>();
        if(StringUtils.isBlank(orderId)){
        	sql.append(" and orderId = :orderId ");
        	params.put("orderId", orderId);
        }
        return listAll(sql.toString(), TestVehiclePosition.class, params) ;
	}
}

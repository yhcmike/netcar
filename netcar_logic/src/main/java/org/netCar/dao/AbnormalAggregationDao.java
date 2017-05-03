package org.netCar.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.netCar.domain.AbnormalAggregationEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Repository
public class AbnormalAggregationDao extends BaseHBDao<AbnormalAggregationEntity, Integer> {

	public List<AbnormalAggregationEntity> listAllByStatus( Integer status) {
	   StringBuffer sql = new StringBuffer(" SELECT * FROM abnormalaggregation where 1=1 ");
	   Map<String,Object> params = new HashMap<String,Object>();
        
        if(status != 0){
        	sql.append(" and status = :status ");
        	params.put("status", status);
        }
	        
		return listAll(sql.toString(), AbnormalAggregationEntity.class, params) ;
	}
}

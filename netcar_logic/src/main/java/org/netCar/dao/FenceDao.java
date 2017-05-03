package org.netCar.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.netCar.domain.FenceEntity;
import org.netCar.vo.FenceVo;
import org.springframework.stereotype.Repository;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Repository
public class FenceDao extends BaseHBDao<FenceEntity, Integer> {

	public List<FenceVo> listAllByCounty(Integer type, Integer status) {
	   StringBuffer sql = new StringBuffer(" SELECT id,name,shape,radius,type,spots FROM fence where 1=1 ");
	   Map<String,Object> params = new HashMap<String,Object>();
        if(type != 0){
        	sql.append(" and type = :type ");
        	params.put("type", type);
        }
        if(status != 0){
        	sql.append(" and status = :status ");
        	params.put("status", status);
        }
	        
		return listAll(sql.toString(), FenceVo.class, params) ;
	}
}

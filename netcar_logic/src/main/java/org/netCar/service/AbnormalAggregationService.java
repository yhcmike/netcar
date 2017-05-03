package org.netCar.service;

import java.util.List;

import org.netCar.domain.AbnormalAggregationEntity;

/**
 * Created by lyq on 2017/5/3.
 */
public interface AbnormalAggregationService {

	public List<AbnormalAggregationEntity> listFencesByCounty(Integer status);
	
}

package org.netCar.service.impl;

import java.util.List;

import org.netCar.dao.AbnormalAggregationDao;
import org.netCar.domain.AbnormalAggregationEntity;
import org.netCar.service.AbnormalAggregationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AbnormalAggregationServiceImpl implements AbnormalAggregationService{
	
	@Autowired
	private AbnormalAggregationDao abnormalAggregationDao;
	
	@Override
	public List<AbnormalAggregationEntity> listFencesByCounty(Integer status) {
		return abnormalAggregationDao.listAllByStatus(status);
	}

}

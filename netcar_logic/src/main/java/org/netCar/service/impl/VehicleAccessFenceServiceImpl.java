package org.netCar.service.impl;

import org.netCar.dao.VehicleAccessFenceDao;
import org.netCar.domain.VehicleAccessFenceRecordEntity;
import org.netCar.service.VehicleAccessFenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleAccessFenceServiceImpl implements VehicleAccessFenceService {
	
	@Autowired
	private VehicleAccessFenceDao vehicleAccessFenceDao;
	
	@Override
	public void save(VehicleAccessFenceRecordEntity entity) {
		vehicleAccessFenceDao.save(entity);
		
	}

	@Override
	public void update(VehicleAccessFenceRecordEntity entity) {
		vehicleAccessFenceDao.update(entity);
		
	}

	@Override
	public void delete(VehicleAccessFenceRecordEntity entity) {
		vehicleAccessFenceDao.deleteObject(entity);
	}

}

package org.netCar.service.impl;

import org.netCar.dao.DriverPositionDao;
import org.netCar.domain.DriverPositionEntity;
import org.netCar.dto.DriverPositionJMS;
import org.netCar.service.DriverPositionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DriverPositionServiceImpl implements DriverPositionService {
    
	private static Logger logger = LoggerFactory.getLogger(DriverPositionService.class);
	@Autowired
	private DriverPositionDao dao;
	@Override
	public void operationPostion(DriverPositionJMS position) {
		DriverPositionEntity entity = new DriverPositionEntity();
		entity.setBizStatus(position.getBizStatus());
		entity.setCompanyId(position.getCompanyId());
		entity.setDirection(position.getDirection());
		entity.setDriverRegionCode(position.getDriverRegionCode());
		entity.setElevation(position.getElevation());
		entity.setEncrypt(position.getEncrypt());
		entity.setLatitude(position.getLatitude());
		entity.setLicenseId(position.getLicenseId());
		entity.setLongitude(position.getLongitude());
		entity.setOrderId(position.getOrderId());
		entity.setPositionTime(position.getPositionTime());
		entity.setSpeed(position.getSpeed());
		entity.setVehicleNo(position.getVehicleNo());
		
		dao.save(entity);

	}

}

package org.netCar.service.impl;

import java.util.List;

import org.netCar.dao.TestVehiclePositionDao;
import org.netCar.domain.TestVehiclePosition;
import org.netCar.service.TestVehiclePositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class TestVehiclePostionServiceImpl implements TestVehiclePositionService {
	@Autowired
	private TestVehiclePositionDao dao;

	@Override
	public List<TestVehiclePosition> listAllByOrderId(String orderId) {
		return dao.listAllByOrderId(orderId);
	}

	
}

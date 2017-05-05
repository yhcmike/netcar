package org.netCar.service;

import java.util.List;

import org.netCar.domain.TestVehiclePosition;

public interface TestVehiclePositionService {
	public List<TestVehiclePosition> listAllByOrderId(String orderId);
}

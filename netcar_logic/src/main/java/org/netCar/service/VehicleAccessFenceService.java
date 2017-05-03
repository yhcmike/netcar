package org.netCar.service;

import org.netCar.domain.VehicleAccessFenceRecordEntity;

/**
 * Created by lyq on 2017/5/3.
 */
public interface VehicleAccessFenceService {

	public void save(VehicleAccessFenceRecordEntity entity);

	public void update(VehicleAccessFenceRecordEntity entity);

	public void delete(VehicleAccessFenceRecordEntity entity);

}

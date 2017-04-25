package org.netCar.service;

import org.netCar.domain.VehiclePositionEntity;

/**
 * Created by lyq on 2017/4/19.
 */
public interface VehiclepositionService {

    public void save(VehiclePositionEntity vehicleposition);

    public void update(VehiclePositionEntity vehicleposition);

    public void delete(VehiclePositionEntity vehicleposition);

    public void operationPostion(Integer id);
}

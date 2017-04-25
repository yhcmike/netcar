package org.netCar.service;

import org.netCar.domain.VehicleInfoEntity;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface VehicleinfoService {
    public void save(VehicleInfoEntity vehicleInfoEntity);
    public void update(VehicleInfoEntity vehicleInfoEntity);
    public void delete(VehicleInfoEntity vehicleInfoEntity);
}

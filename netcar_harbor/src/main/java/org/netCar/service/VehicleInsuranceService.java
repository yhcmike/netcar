package org.netCar.service;

import org.netCar.domain.VehicleInsuranceEntity;
import org.netCar.vo.OTIpcDef;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface VehicleInsuranceService {
    public void save(VehicleInsuranceEntity vehicleInsuranceEntity);
    public void update(VehicleInsuranceEntity vehicleInsuranceEntity);
    public void delete(VehicleInsuranceEntity vehicleInsuranceEntity);
    public void opreate(OTIpcDef.BaseInfoVehicleInsurance entity);
}

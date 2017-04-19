package org.netCar.service.impl;

import org.netCar.dao.VehicleInsuranceDao;
import org.netCar.domain.VehicleInsuranceEntity;
import org.netCar.service.VehicleInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class VehicleInsuranceServiceImpl implements VehicleInsuranceService{
    @Autowired
    private VehicleInsuranceDao dao;

    @Override
    public void save(VehicleInsuranceEntity vehicleInsuranceEntity) {
        dao.save(vehicleInsuranceEntity);
    }

    @Override
    public void update(VehicleInsuranceEntity vehicleInsuranceEntity) {
        dao.update(vehicleInsuranceEntity);
    }

    @Override
    public void delete(VehicleInsuranceEntity vehicleInsuranceEntity) {
        dao.deleteObject(vehicleInsuranceEntity);
    }
}

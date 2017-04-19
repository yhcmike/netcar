package org.netCar.service.impl;

import org.netCar.dao.VehicleInfoDao;
import org.netCar.domain.VehicleInfoEntity;
import org.netCar.service.VehicleinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class VehicleinfoServiceImpl implements VehicleinfoService {

    @Autowired
    private VehicleInfoDao dao;
    @Override
    public void save(VehicleInfoEntity vehicleInfoEntity) {
        dao.save(vehicleInfoEntity);
    }

    @Override
    public void update(VehicleInfoEntity vehicleInfoEntity) {
        dao.update(vehicleInfoEntity);
    }

    @Override
    public void delete(VehicleInfoEntity vehicleInfoEntity) {
       dao.deleteObject(vehicleInfoEntity);
    }
}

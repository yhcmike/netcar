package org.netCar.service.impl;

import org.netCar.dao.VehiclepositionDao;
import org.netCar.domain.VehiclePositionEntity;
import org.netCar.service.VehiclepositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lyq on 2017/4/19.
 */
@Service
public class VehiclepositionServiceImpl implements VehiclepositionService {

    @Autowired
    VehiclepositionDao vehiclepositionDao;

    @Override
    public void save(VehiclePositionEntity vehicleposition) {
        vehiclepositionDao.save(vehicleposition);
    }

    @Override
    public void update(VehiclePositionEntity vehicleposition) {
        vehiclepositionDao.update(vehicleposition);
    }

    @Override
    public void delete(VehiclePositionEntity vehicleposition) {
        vehiclepositionDao.deleteObject(vehicleposition);
    }
}

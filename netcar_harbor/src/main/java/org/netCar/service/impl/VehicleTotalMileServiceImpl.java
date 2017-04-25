package org.netCar.service.impl;

import org.netCar.dao.VehicleTotalMileDao;
import org.netCar.domain.VehicleTotalMileEntity;
import org.netCar.service.VehicleTotalMileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class VehicleTotalMileServiceImpl implements VehicleTotalMileService {
    @Autowired
    private VehicleTotalMileDao dao;
    @Override
    public void save(VehicleTotalMileEntity entity) {
       dao.save(entity);
    }

    @Override
    public void update(VehicleTotalMileEntity entity) {
      dao.update(entity);
    }

    @Override
    public void delete(VehicleTotalMileEntity entity) {
      dao.deleteObject(entity);
    }
}

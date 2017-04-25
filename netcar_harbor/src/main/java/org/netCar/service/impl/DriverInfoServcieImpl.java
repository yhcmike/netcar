package org.netCar.service.impl;

import org.netCar.dao.DirverInfoDao;
import org.netCar.domain.DriverInfoEntity;
import org.netCar.service.DirverInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class DriverInfoServcieImpl implements DirverInfoService {

    @Autowired
    DirverInfoDao driverInfoDao;

    @Override
    public void save(DriverInfoEntity driverInfoEntity) {
        driverInfoDao.save(driverInfoEntity);
    }

    @Override
    public void update(DriverInfoEntity driverInfoEntity) {
        driverInfoDao.update(driverInfoEntity);
    }

    @Override
    public void delete(DriverInfoEntity driverInfoEntity) {
        driverInfoDao.deleteObject(driverInfoEntity);
    }
}

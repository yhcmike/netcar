package org.netCar.service.impl;

import org.netCar.dao.DriverStatInfoDao;
import org.netCar.domain.DriverStatInfoEntity;
import org.netCar.service.DriverStatInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class DriverStatInfoServiceImpl implements DriverStatInfoService {
    @Autowired
    private DriverStatInfoDao dao;
    @Override
    public void save(DriverStatInfoEntity entity) {
         dao.save(entity);
    }

    @Override
    public void update(DriverStatInfoEntity entity) {
         dao.update(entity);
    }

    @Override
    public void delete(DriverStatInfoEntity entity) {
         dao.deleteObject(entity);
    }
}

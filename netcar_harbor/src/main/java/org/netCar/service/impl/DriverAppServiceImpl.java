package org.netCar.service.impl;

import org.netCar.dao.DriverAppDao;
import org.netCar.domain.DriverAppEntity;
import org.netCar.service.DriverAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class DriverAppServiceImpl implements DriverAppService {
    @Autowired
    private DriverAppDao dao;
    @Override
    public void save(DriverAppEntity entity) {
        dao.save(entity);
    }

    @Override
    public void update(DriverAppEntity entity) {
        dao.update(entity);
    }

    @Override
    public void delete(DriverAppEntity entity) {
        dao.deleteObject(entity);
    }
}

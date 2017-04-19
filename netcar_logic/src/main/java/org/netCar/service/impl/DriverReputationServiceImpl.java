package org.netCar.service.impl;

import org.netCar.dao.DriverReputationDao;
import org.netCar.domain.DriverReputationEntity;
import org.netCar.service.DriverReputationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class DriverReputationServiceImpl implements DriverReputationService {
    @Autowired
    private DriverReputationDao dao;

    @Override
    public void save(DriverReputationEntity entity) {
        dao.save(entity);
    }

    @Override
    public void update(DriverReputationEntity entity) {
        dao.update(entity);
    }

    @Override
    public void delete(DriverReputationEntity entity) {
        dao.deleteObject(entity);
    }
}

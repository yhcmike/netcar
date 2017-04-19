package org.netCar.service.impl;

import org.netCar.dao.DriverPunishDao;
import org.netCar.domain.DriverPunishEntity;
import org.netCar.service.DriverPunishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class DriverPunishServiceImpl implements DriverPunishService {

    @Autowired
    private DriverPunishDao dao;

    @Override
    public void save(DriverPunishEntity entity) {
       dao.save(entity);
    }

    @Override
    public void update(DriverPunishEntity entity) {
       dao.update(entity);
    }

    @Override
    public void delete(DriverPunishEntity entity) {
       dao.deleteObject(entity);
    }
}

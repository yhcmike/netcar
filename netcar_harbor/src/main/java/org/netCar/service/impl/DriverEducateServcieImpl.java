package org.netCar.service.impl;

import org.netCar.dao.DriverEducateDao;
import org.netCar.domain.DriverEducateEntity;
import org.netCar.service.DriverEducateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class DriverEducateServcieImpl implements DriverEducateService {

    @Autowired
    private DriverEducateDao dao;
    @Override
    public void save(DriverEducateEntity entity) {
        dao.save(entity);
    }

    @Override
    public void update(DriverEducateEntity entity) {
        dao.update(entity);
    }

    @Override
    public void delete(DriverEducateEntity entity) {
        dao.deleteObject(entity);
    }
}

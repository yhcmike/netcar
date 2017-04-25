package org.netCar.service.impl;

import org.netCar.dao.Jtt808EntityDao;
import org.netCar.domain.Jtt808Entity;
import org.netCar.service.Jtt808Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lyq on 2017/4/19.
 */
@Service
public class Jtt808ServiceImpl implements Jtt808Service {

    @Autowired
    private Jtt808EntityDao jtt808EntityDao;

    @Override
    public void save(Jtt808Entity jtt808Entity) {
        jtt808EntityDao.save(jtt808Entity);
    }

    @Override
    public void update(Jtt808Entity jtt808Entity) {
        jtt808EntityDao.update(jtt808Entity);
    }

    @Override
    public void delete(Jtt808Entity jtt808Entity) {
        jtt808EntityDao.deleteObject(jtt808Entity);
    }
}

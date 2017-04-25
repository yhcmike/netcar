package org.netCar.service.impl;

import org.netCar.dao.Jtt697EntityDao;
import org.netCar.domain.Jtt697Entity;
import org.netCar.service.Jtt697Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lyq on 2017/4/19.
 */
@Service
public class Jtt697ServiceImpl implements Jtt697Service {

    @Autowired
    private Jtt697EntityDao jtt697EntityDao;

    @Override
    public void save(Jtt697Entity jtt697Entity) {
        jtt697EntityDao.save(jtt697Entity);
    }

    @Override
    public void update(Jtt697Entity jtt697Entity) {
        jtt697EntityDao.update(jtt697Entity);
    }

    @Override
    public void delete(Jtt697Entity jtt697Entity) {
        jtt697EntityDao.deleteObject(jtt697Entity);
    }
}

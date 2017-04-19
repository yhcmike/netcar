package org.netCar.service.impl;

import org.netCar.dao.Jtt415EntityDao;
import org.netCar.domain.Jtt415Entity;
import org.netCar.service.Jtt415Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lyq on 2017/4/19.
 */
@Service
public class Jtt415ServiceImpl implements Jtt415Service {

    @Autowired
    private Jtt415EntityDao jtt415EntityDao;

    @Override
    public void save(Jtt415Entity jtt415Entity) {
        jtt415EntityDao.save(jtt415Entity);
    }

    @Override
    public void update(Jtt415Entity jtt415Entity) {
        jtt415EntityDao.update(jtt415Entity);
    }

    @Override
    public void delete(Jtt415Entity jtt415Entity) {
        jtt415EntityDao.deleteObject(jtt415Entity);
    }
}

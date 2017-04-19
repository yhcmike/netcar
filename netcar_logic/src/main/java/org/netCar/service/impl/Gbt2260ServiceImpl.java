package org.netCar.service.impl;

import org.netCar.dao.Gbt2260EntityDao;
import org.netCar.domain.Gbt2260Entity;
import org.netCar.service.Gbt2260Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lyq on 2017/4/19.
 */
@Service
public class Gbt2260ServiceImpl implements Gbt2260Service {

    @Autowired
    private Gbt2260EntityDao gbt2260EntityDao;

    @Override
    public void save(Gbt2260Entity gbt2260Entity) {
        gbt2260EntityDao.save(gbt2260Entity);
    }

    @Override
    public void update(Gbt2260Entity gbt2260Entity) {
        gbt2260EntityDao.update(gbt2260Entity);
    }

    @Override
    public void delete(Gbt2260Entity gbt2260Entity) {
        gbt2260EntityDao.deleteObject(gbt2260Entity);
    }
}

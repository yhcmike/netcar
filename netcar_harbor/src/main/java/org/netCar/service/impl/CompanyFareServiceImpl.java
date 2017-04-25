package org.netCar.service.impl;

import org.netCar.dao.CompanyFareDao;
import org.netCar.domain.CompanyFareEntity;
import org.netCar.service.CompanyFareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class CompanyFareServiceImpl implements CompanyFareService {
    @Autowired
    private CompanyFareDao dao;
    @Override
    public void save(CompanyFareEntity entity) {
        dao.save(entity);
    }

    @Override
    public void update(CompanyFareEntity entity) {
        dao.update(entity);
    }

    @Override
    public void delete(CompanyFareEntity entity) {
        dao.deleteObject(entity);
    }
}

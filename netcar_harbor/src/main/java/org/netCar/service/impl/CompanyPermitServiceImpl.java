package org.netCar.service.impl;

import org.netCar.dao.CompanyPermitDao;
import org.netCar.domain.CompanyFareEntity;
import org.netCar.domain.CompanyPermitEntity;
import org.netCar.service.CompanyFareService;
import org.netCar.service.CompanyPermitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class CompanyPermitServiceImpl implements CompanyPermitService {
    @Autowired
    private CompanyPermitDao dao;

    @Override
    public void save(CompanyPermitEntity entity) {
        dao.save(entity);
    }

    @Override
    public void update(CompanyPermitEntity entity) {
        dao.update(entity);
    }

    @Override
    public void delete(CompanyPermitEntity entity) {
        dao.deleteObject(entity);
    }
}

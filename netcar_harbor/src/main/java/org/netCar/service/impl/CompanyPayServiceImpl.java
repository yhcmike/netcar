package org.netCar.service.impl;

import org.netCar.dao.CompanyPayDao;
import org.netCar.domain.CompanyPayEntity;
import org.netCar.service.CompanyPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class CompanyPayServiceImpl implements CompanyPayService {

    @Autowired
    private CompanyPayDao dao;
    @Override
    public void save(CompanyPayEntity companyPayEntity) {
        dao.save(companyPayEntity);
    }

    @Override
    public void update(CompanyPayEntity companyPayEntity) {
        dao.update(companyPayEntity);
    }

    @Override
    public void delete(CompanyPayEntity companyPayEntity) {
        dao.deleteObject(companyPayEntity);
    }
}

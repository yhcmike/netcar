package org.netCar.service.impl;

import org.netCar.dao.CompanyPriceDao;
import org.netCar.domain.CompanyPriceEntity;
import org.netCar.service.CompanyPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class CompanyPriceServiceImpl implements CompanyPriceService{
    @Autowired
    private CompanyPriceDao dao;
    @Override
    public void save(CompanyPriceEntity companyPriceEntity) {
        dao.save(companyPriceEntity);
    }

    @Override
    public void update(CompanyPriceEntity companyPriceEntity) {
        dao.update(companyPriceEntity);
    }

    @Override
    public void delete(CompanyPriceEntity companyPriceEntity) {
        dao.deleteObject(companyPriceEntity);
    }
}

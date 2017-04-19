package org.netCar.service.impl;

import org.netCar.dao.CompanyBusinessLicenseDao;
import org.netCar.domain.CompanyBusinessLicenseEntity;
import org.netCar.service.CompanyBusinessLicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class CompanyBusinessLicenseServiceImpl implements CompanyBusinessLicenseService{
    @Autowired
    private CompanyBusinessLicenseDao dao;
    @Override
    public void save(CompanyBusinessLicenseEntity companyBusinessLicenseEntity) {
        dao.save(companyBusinessLicenseEntity);
    }
}

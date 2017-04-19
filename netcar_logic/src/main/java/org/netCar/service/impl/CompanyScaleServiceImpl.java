package org.netCar.service.impl;

import org.netCar.dao.CompanyInfoDao;
import org.netCar.dao.CompanyScaleDao;
import org.netCar.domain.CompanyscaleEntity;
import org.netCar.service.CompanyScaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by menxin on 2017/4/19.
 */
@Service
public class CompanyScaleServiceImpl implements CompanyScaleService {
    @Autowired
    CompanyScaleDao dao;
    @Override
    public void save(CompanyscaleEntity companyscaleEntity) {
        dao.save(companyscaleEntity);
    }
}

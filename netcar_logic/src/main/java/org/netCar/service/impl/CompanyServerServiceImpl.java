package org.netCar.service.impl;

import org.netCar.dao.CompanyServerDao;
import org.netCar.domain.CompanyServerEntity;
import org.netCar.service.CompanyServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class CompanyServerServiceImpl implements CompanyServerService {
    @Autowired
    private CompanyServerDao dao;
    @Override
    public void save(CompanyServerEntity companyServerEntity) {
        dao.save(companyServerEntity);
    }

    @Override
    public void update(CompanyServerEntity companyServerEntity) {
        dao.update(companyServerEntity);
    }

    @Override
    public void delete(CompanyServerEntity companyServerEntity) {
        dao.deleteObject(companyServerEntity);
    }

}

package org.netCar.service.impl;

import org.netCar.dao.CompanyServiceDao;
import org.netCar.domain.CompanyServiceEntity;
import org.netCar.service.CompanyServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class CompanyServiceServiceImpl implements CompanyServiceService {
    @Autowired
    private CompanyServiceDao dao;
    @Override
    public void save(CompanyServiceEntity entity) {
        dao.save(entity);
    }

    @Override
    public void update(CompanyServiceEntity entity) {
        dao.update(entity);
    }

    @Override
    public void delete(CompanyServiceEntity entity) {
        dao.deleteObject(entity);
    }

}

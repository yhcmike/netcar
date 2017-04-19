package org.netCar.service.impl;

import org.netCar.dao.DirverMileageDao;
import org.netCar.domain.DirverMileageEntity;
import org.netCar.service.DirverMileageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class DirverMileageServiceImpl implements DirverMileageService{
    @Autowired
    private DirverMileageDao dao;
    @Override
    public void save(DirverMileageEntity dirverMileageEntity) {
       dao.save(dirverMileageEntity);
    }

    @Override
    public void update(DirverMileageEntity dirverMileageEntity) {
      dao.update(dirverMileageEntity);
    }

    @Override
    public void delete(DirverMileageEntity dirverMileageEntity) {
      dao.deleteObject(dirverMileageEntity);
    }
}

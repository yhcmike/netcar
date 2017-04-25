package org.netCar.service.impl;

import org.netCar.dao.OperateLogInOutDao;
import org.netCar.domain.OperateLogInOutEntity;
import org.netCar.service.OperateLogInOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lyq on 2017/4/19.
 */
@Service
public class OperateLogInOutServiceImpl implements OperateLogInOutService {

    @Autowired
    private OperateLogInOutDao operateLogInOutDao;

    @Override
    public void save(OperateLogInOutEntity operateLogInOutEntity) {
        operateLogInOutDao.save(operateLogInOutEntity);
    }

    @Override
    public void update(OperateLogInOutEntity operateLogInOutEntity) {
        operateLogInOutDao.update(operateLogInOutEntity);
    }

    @Override
    public void delete(OperateLogInOutEntity operateLogInOutEntity) {
        operateLogInOutDao.deleteObject(operateLogInOutEntity);
    }
}

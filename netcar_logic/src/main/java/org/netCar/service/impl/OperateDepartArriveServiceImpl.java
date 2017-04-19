package org.netCar.service.impl;

import org.netCar.dao.OperateDepartArriveDao;
import org.netCar.domain.OperateDepartArriveEntity;
import org.netCar.service.OperateDepartArriveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lyq on 2017/4/19.
 */
@Service
public class OperateDepartArriveServiceImpl implements OperateDepartArriveService {

    @Autowired
    private OperateDepartArriveDao operateDepartArriveDao;

    @Override
    public void save(OperateDepartArriveEntity operateDepartArriveEntity) {
        operateDepartArriveDao.save(operateDepartArriveEntity);
    }

    @Override
    public void update(OperateDepartArriveEntity operateDepartArriveEntity) {
        operateDepartArriveDao.update(operateDepartArriveEntity);
    }

    @Override
    public void delete(OperateDepartArriveEntity operateDepartArriveEntity) {
        operateDepartArriveDao.deleteObject(operateDepartArriveEntity);
    }
}

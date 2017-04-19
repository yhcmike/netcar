package org.netCar.service.impl;

import org.netCar.dao.OrderInfoDao;
import org.netCar.domain.OrderInfoEntity;
import org.netCar.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lyq on 2017/4/19.
 */
@Service
public class OrderInfoServiceImpl implements OrderInfoService {

    @Autowired
    private OrderInfoDao orderInfoDao;

    @Override
    public void save(OrderInfoEntity orderInfoEntity) {
        orderInfoDao.save(orderInfoEntity);
    }

    @Override
    public void update(OrderInfoEntity orderInfoEntity) {
        orderInfoDao.update(orderInfoEntity);
    }

    @Override
    public void delete(OrderInfoEntity orderInfoEntity) {
        orderInfoDao.deleteObject(orderInfoEntity);
    }
}

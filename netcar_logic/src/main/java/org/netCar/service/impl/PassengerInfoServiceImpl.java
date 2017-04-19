package org.netCar.service.impl;

import org.netCar.dao.PassengerInfoDao;
import org.netCar.domain.PassengerInfoEntity;
import org.netCar.service.PassengerInfoService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lyq on 2017/4/19.
 */
public class PassengerInfoServiceImpl implements PassengerInfoService {

    @Autowired
    PassengerInfoDao passengerInfoDao;

    @Override
    public void save(PassengerInfoEntity passengerInfoEntity) {
        passengerInfoDao.save(passengerInfoEntity);
    }

    @Override
    public void update(PassengerInfoEntity passengerInfoEntity) {
        passengerInfoDao.update(passengerInfoEntity);
    }

    @Override
    public void delete(PassengerInfoEntity passengerInfoEntity) {
        passengerInfoDao.deleteObject(passengerInfoEntity);
    }
}

package org.netCar.service.impl;

import org.netCar.dao.PassengerEvaluationDao;
import org.netCar.domain.PassengerEvaluationEntity;
import org.netCar.service.PassengerEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lyq on 2017/4/19.
 */
public class PassengerEvaluationServiceImpl implements PassengerEvaluationService {

    @Autowired
    private PassengerEvaluationDao passengerEvaluationDao;

    @Override
    public void save(PassengerEvaluationEntity passengerEvaluationEntity) {
        passengerEvaluationDao.save(passengerEvaluationEntity);
    }

    @Override
    public void update(PassengerEvaluationEntity passengerEvaluationEntity) {
        passengerEvaluationDao.update(passengerEvaluationEntity);
    }

    @Override
    public void delete(PassengerEvaluationEntity passengerEvaluationEntity) {
        passengerEvaluationDao.deleteObject(passengerEvaluationEntity);
    }
}

package org.netCar.service;

import org.netCar.domain.PassengerEvaluationEntity;

/**
 * Created by lyq on 2017/4/19.
 */
public interface PassengerEvaluationService {
    public void save(PassengerEvaluationEntity passengerEvaluationEntity);
    public void update(PassengerEvaluationEntity passengerEvaluationEntity);
    public void delete(PassengerEvaluationEntity passengerEvaluationEntity);
}

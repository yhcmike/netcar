package org.netCar.service;

import org.netCar.domain.PassengerInfoEntity;

/**
 * Created by lyq on 2017/4/19.
 */
public interface PassengerInfoService {
    public void save(PassengerInfoEntity passengerInfoEntity);
    public void update(PassengerInfoEntity passengerInfoEntity);
    public void delete(PassengerInfoEntity passengerInfoEntity);
}

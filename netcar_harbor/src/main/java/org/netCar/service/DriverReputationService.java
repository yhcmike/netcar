package org.netCar.service;

import org.netCar.domain.DriverReputationEntity;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface DriverReputationService {
    public void save(DriverReputationEntity entity);
    public void update(DriverReputationEntity entity);
    public void delete(DriverReputationEntity entity);
}

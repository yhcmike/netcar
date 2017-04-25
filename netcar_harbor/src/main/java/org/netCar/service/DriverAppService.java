package org.netCar.service;

import org.netCar.domain.DriverAppEntity;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface DriverAppService {
    public void save(DriverAppEntity entity);
    public void update(DriverAppEntity entity);
    public void delete(DriverAppEntity entity);
}

package org.netCar.service;

import org.netCar.domain.DriverStatInfoEntity;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface DriverStatInfoService {
    public void save(DriverStatInfoEntity entity);
    public void update(DriverStatInfoEntity entity);
    public void delete(DriverStatInfoEntity entity);
}

package org.netCar.service;

import org.netCar.domain.DriverInfoEntity;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface DirverInfoService {
    public void save(DriverInfoEntity driverInfoEntity);
    public void update(DriverInfoEntity driverInfoEntity);
    public void delete(DriverInfoEntity driverInfoEntity);
}

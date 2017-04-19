package org.netCar.service;

import org.netCar.domain.DriverPunishEntity;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface DriverPunishService {
    public void save(DriverPunishEntity entity);
    public void update(DriverPunishEntity entity);
    public void delete(DriverPunishEntity entity);
}

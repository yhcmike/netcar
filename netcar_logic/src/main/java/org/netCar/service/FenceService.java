package org.netCar.service;

import org.netCar.domain.FenceEntity;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface FenceService {
    public void save(FenceEntity entity);
    public void update(FenceEntity entity);
    public void delete(FenceEntity entity);
}

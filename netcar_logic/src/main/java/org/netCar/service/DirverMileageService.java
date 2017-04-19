package org.netCar.service;

import org.netCar.domain.DirverMileageEntity;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface DirverMileageService {

    void save(DirverMileageEntity dirverMileageEntity);
    void update(DirverMileageEntity dirverMileageEntity);
    void delete(DirverMileageEntity dirverMileageEntity);
}

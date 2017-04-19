package org.netCar.service;

import org.netCar.domain.CompanyFareEntity;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface CompanyFareService {
    public void save(CompanyFareEntity entity);
    public void update(CompanyFareEntity entity);
    public void delete(CompanyFareEntity entity);
}

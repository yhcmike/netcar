package org.netCar.service;

import org.netCar.domain.CompanyPermitEntity;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface CompanyPermitService {
    public void save(CompanyPermitEntity entity);
    public void update(CompanyPermitEntity entity);
    public void delete(CompanyPermitEntity entity);
}

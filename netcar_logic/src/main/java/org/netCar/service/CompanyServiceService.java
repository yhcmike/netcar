package org.netCar.service;

import org.netCar.domain.CompanyServiceEntity;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface CompanyServiceService {
    public void save(CompanyServiceEntity entity);
    public void update(CompanyServiceEntity entity);
    public void delete(CompanyServiceEntity entity);
}

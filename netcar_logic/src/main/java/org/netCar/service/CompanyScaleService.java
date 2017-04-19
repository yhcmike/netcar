package org.netCar.service;

import org.netCar.domain.CompanyScaleEntity;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface CompanyScaleService {
    public void save(CompanyScaleEntity companyScaleEntity);
    public void update(CompanyScaleEntity companyScaleEntity);
    public void delete(CompanyScaleEntity companyScaleEntity);
}

package org.netCar.service;

import org.netCar.domain.CompanyPriceEntity;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface CompanyPriceService {
    public void save(CompanyPriceEntity companyPriceEntity);
    public void update(CompanyPriceEntity companyPriceEntity);
    public void delete(CompanyPriceEntity companyPriceEntity);
}

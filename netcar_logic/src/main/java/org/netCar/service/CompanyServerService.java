package org.netCar.service;

import org.netCar.domain.CompanyServerEntity;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface CompanyServerService {
    public void save(CompanyServerEntity companyServerEntity);
    public void update(CompanyServerEntity companyServerEntity);
    public void delete(CompanyServerEntity companyServerEntity);
}

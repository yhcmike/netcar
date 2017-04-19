package org.netCar.service;

import org.netCar.domain.OperateLogInOutEntity;

/**
 * Created by lyq on 2017/4/19.
 */
public interface OperateLogInOutService {
    public void save(OperateLogInOutEntity operateLogInOutEntity);
    public void update(OperateLogInOutEntity operateLogInOutEntity);
    public void delete(OperateLogInOutEntity operateLogInOutEntity);
}

package org.netCar.service;

import org.netCar.domain.OrderInfoEntity;

/**
 * Created by lyq on 2017/4/19.
 */
public interface OrderInfoService {
    public void save(OrderInfoEntity orderInfoEntity);
    public void update(OrderInfoEntity orderInfoEntity);
    public void delete(OrderInfoEntity orderInfoEntity);
}

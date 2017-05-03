package org.netCar.service;

import java.util.List;

import org.netCar.domain.FenceEntity;
import org.netCar.vo.FenceVo;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface FenceService {
	public void save(FenceEntity entity);

	public void update(FenceEntity entity);

	public void delete(FenceEntity entity);

	public List<FenceVo> listFencesByCounty(Integer type, Integer status);
}

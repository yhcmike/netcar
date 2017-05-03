package org.netCar.service.impl;

import java.util.List;

import org.netCar.dao.FenceDao;
import org.netCar.domain.FenceEntity;
import org.netCar.service.FenceService;
import org.netCar.vo.FenceVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class FenceServiceImpl implements FenceService {
	@Autowired
	private FenceDao dao;

	@Override
	public void save(FenceEntity entity) {
		dao.save(entity);
	}

	@Override
	public void update(FenceEntity entity) {
		dao.update(entity);
	}

	@Override
	public void delete(FenceEntity entity) {
		dao.deleteObject(entity);
	}

	@Override
	public List<FenceVo> listFencesByCounty(Integer type, Integer status) {
		return dao.listAllByCounty(type, status);
	}
}

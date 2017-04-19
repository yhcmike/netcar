package org.netCar.service.impl;

import org.netCar.dao.CompanyInfoDao;
import org.netCar.domain.CompanyinfoEntity;
import org.netCar.service.CompanyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyInfoServiceImpl implements CompanyInfoService {

	
	@Autowired
	CompanyInfoDao companyInfoDao;
	
	@Override
	public void save(CompanyinfoEntity companyInfo) {
		companyInfoDao.save(companyInfo);
	}
	

	@Override
	public void update(CompanyinfoEntity companyInfo) {

	}

	@Override
	public void changeStatus(Integer id, Integer status) {

	}

	@Override
	public CompanyinfoEntity getById(Integer id) {
		return null;
	}

}

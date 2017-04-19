package org.netCar.service.impl;

import org.netCar.dao.CompanyInfoDao;
import org.netCar.domain.CompanyInfoEntity;
import org.netCar.service.CompanyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyInfoServiceImpl implements CompanyInfoService {

	
	@Autowired
	CompanyInfoDao companyInfoDao;
	
	@Override
	public void save(CompanyInfoEntity companyInfo) {
		companyInfoDao.save(companyInfo);
	}
	

	@Override
	public void update(CompanyInfoEntity companyInfo) {
           companyInfoDao.update(companyInfo);
	}

	@Override
	public void delete(CompanyInfoEntity companyInfo) {
		companyInfoDao.deleteObject(companyInfo);
	}

	@Override
	public void changeStatus(Integer id, Integer status) {

	}

	@Override
	public CompanyInfoEntity getById(Integer id) {
		return null;
	}

}

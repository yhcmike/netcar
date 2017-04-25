package org.netCar.service;


import org.netCar.domain.CompanyInfoEntity;

public interface CompanyInfoService {

	public void save(CompanyInfoEntity companyInfo);
	public void update(CompanyInfoEntity companyInfo);

	public void delete(CompanyInfoEntity companyInfo);
	public void changeStatus(Integer id,Integer status);
	public CompanyInfoEntity getById(Integer id);
	
}

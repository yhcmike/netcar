package org.netCar.service;


import org.netCar.domain.CompanyinfoEntity;

public interface CompanyInfoService {

	public void save(CompanyinfoEntity companyInfo);
	/**
	 * 更新
	 */
	public void update(CompanyinfoEntity companyInfo);
	public void changeStatus(Integer id,Integer status);
	public CompanyinfoEntity getById(Integer id);
	
}

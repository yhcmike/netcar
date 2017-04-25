package org.netCar.vo;

public enum TopicsNameEnum {
	
	PROVCOMPANY("网约车平台公司基本信息","ProvCompany","",true,false),
	PROVCOMPANYSTAT("网约车平台公司营运规模信息","ProvCompanyStat","",true,false),
	PROVCOMPANYPAY("网约车平台公司支付信息","ProvCompanyPay","",true,false),
	PROVCOMPANYSERVICE("网约车平台公司服务机构","ProvCompanyService","",true,false);
	
	private String zhName;
	private String enName;
	private String serviceName;
	private boolean enable;
	private boolean isComplex;
	
	private TopicsNameEnum(String zhName,String enName,String serviceName,boolean enable,boolean isComplex){
		this.zhName = zhName;
		this.enName = enName;
		this.serviceName = serviceName;
		this.enable = enable;
		this.isComplex = isComplex;
	}


	public String getZhName() {
		return zhName;
	}


	public void setZhName(String zhName) {
		this.zhName = zhName;
	}


	public String getEnName() {
		return enName;
	}


	public void setEnName(String enName) {
		this.enName = enName;
	}


	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public boolean isComplex() {
		return isComplex;
	}

	public void setComplex(boolean isComplex) {
		this.isComplex = isComplex;
	}


	public boolean isEnable() {
		return enable;
	}


	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	
	
}

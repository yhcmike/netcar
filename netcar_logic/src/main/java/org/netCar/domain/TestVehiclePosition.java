package org.netCar.domain;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sc_vehicle_position")
public class TestVehiclePosition extends IdEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4019397871083583407L;
	
	//公司标识
    @Column(name = "company_id", length = 32)
    private String companyId;
    //车辆号牌
    @Column(name = "vehicle_no", length = 32)
    private String vehicleNo;
    
    @Column(name = "address", length = 32)
    private Integer address;
    
    @Column(name = "plate_color")
    private String plateColor; 
    
    @Column(name = "vehicle_region_code")
    private Integer vehicleRegionCode;
    
    @Column(name = "position_time")
    private BigInteger positionTime;
    
    @Column(name = "longitude")
    private BigInteger longitude;
    
    @Column(name = "latitude")
    private BigInteger latitude;
    
    @Column(name = "speed")
    private Float speed;
    
    @Column(name = "direction")
    private BigInteger direction;
    
    @Column(name = "elevation")
    private Float elevation;
    
    @Column(name = "mileage")
    private Float mileage;
    
    @Column(name = "encrypt")
    private Integer encrypt;
    
    @Column(name = "warn_status")
    private Integer warnStatus;
    
    @Column(name = "veh_status")
    private Integer vehStatus;
    
    @Column(name = "biz_status")
    private Integer bizStatus;
    
    @Column(name = "order_id")
    private String orderId;

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public Integer getAddress() {
		return address;
	}

	public void setAddress(Integer address) {
		this.address = address;
	}

	public String getPlateColor() {
		return plateColor;
	}

	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}

	public Integer getVehicleRegionCode() {
		return vehicleRegionCode;
	}

	public void setVehicleRegionCode(Integer vehicleRegionCode) {
		this.vehicleRegionCode = vehicleRegionCode;
	}

	public BigInteger getPositionTime() {
		return positionTime;
	}

	public void setPositionTime(BigInteger positionTime) {
		this.positionTime = positionTime;
	}

	public BigInteger getLongitude() {
		return longitude;
	}

	public void setLongitude(BigInteger longitude) {
		this.longitude = longitude;
	}

	public BigInteger getLatitude() {
		return latitude;
	}

	public void setLatitude(BigInteger latitude) {
		this.latitude = latitude;
	}

	public Float getSpeed() {
		return speed;
	}

	public void setSpeed(Float speed) {
		this.speed = speed;
	}

	public BigInteger getDirection() {
		return direction;
	}

	public void setDirection(BigInteger direction) {
		this.direction = direction;
	}

	public Float getElevation() {
		return elevation;
	}

	public void setElevation(Float elevation) {
		this.elevation = elevation;
	}

	public Float getMileage() {
		return mileage;
	}

	public void setMileage(Float mileage) {
		this.mileage = mileage;
	}

	public Integer getEncrypt() {
		return encrypt;
	}

	public void setEncrypt(Integer encrypt) {
		this.encrypt = encrypt;
	}

	public Integer getWarnStatus() {
		return warnStatus;
	}

	public void setWarnStatus(Integer warnStatus) {
		this.warnStatus = warnStatus;
	}

	public Integer getVehStatus() {
		return vehStatus;
	}

	public void setVehStatus(Integer vehStatus) {
		this.vehStatus = vehStatus;
	}

	public Integer getBizStatus() {
		return bizStatus;
	}

	public void setBizStatus(Integer bizStatus) {
		this.bizStatus = bizStatus;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	
    
}

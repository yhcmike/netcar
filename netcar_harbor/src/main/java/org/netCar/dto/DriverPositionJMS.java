package org.netCar.dto;

import java.io.Serializable;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.springframework.jms.core.MessageCreator;

public class DriverPositionJMS implements MessageCreator, Serializable,Cloneable{
	private static final long serialVersionUID = 5466893977220220945L;
	private String companyId;
	    private String licenseId;
	    private Integer driverRegionCode;
	    private String vehicleNo;
	    private Long positionTime;
	    private Double longitude;
	    private Double latitude;
	    private Integer encrypt;
	    private Integer direction;
	    private Integer elevation;
	    private Integer speed;
	    private Integer bizStatus;
	    private String orderId;
	    
		@Override
		public Message createMessage(Session session) throws JMSException {
			ObjectMessage objectMessage = session.createObjectMessage(this);
	        return objectMessage;
		}

		public String getCompanyId() {
			return companyId;
		}

		public void setCompanyId(String companyId) {
			this.companyId = companyId;
		}

		public String getLicenseId() {
			return licenseId;
		}

		public void setLicenseId(String licenseId) {
			this.licenseId = licenseId;
		}

		public Integer getDriverRegionCode() {
			return driverRegionCode;
		}

		public void setDriverRegionCode(Integer driverRegionCode) {
			this.driverRegionCode = driverRegionCode;
		}

		public String getVehicleNo() {
			return vehicleNo;
		}

		public void setVehicleNo(String vehicleNo) {
			this.vehicleNo = vehicleNo;
		}

		public Long getPositionTime() {
			return positionTime;
		}

		public void setPositionTime(Long positionTime) {
			this.positionTime = positionTime;
		}

		

		public Double getLongitude() {
			return longitude;
		}

		public void setLongitude(Double longitude) {
			this.longitude = longitude;
		}

		public Double getLatitude() {
			return latitude;
		}

		public void setLatitude(Double latitude) {
			this.latitude = latitude;
		}

		public Integer getEncrypt() {
			return encrypt;
		}

		public void setEncrypt(Integer encrypt) {
			this.encrypt = encrypt;
		}

		public Integer getDirection() {
			return direction;
		}

		public void setDirection(Integer direction) {
			this.direction = direction;
		}

		public Integer getElevation() {
			return elevation;
		}

		public void setElevation(Integer elevation) {
			this.elevation = elevation;
		}

		public Integer getSpeed() {
			return speed;
		}

		public void setSpeed(Integer speed) {
			this.speed = speed;
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

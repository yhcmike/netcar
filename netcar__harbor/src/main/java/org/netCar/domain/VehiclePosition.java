package org.netCar.domain;

import java.io.Serializable;

public class VehiclePosition implements Serializable {
    private Integer id;

    private String companyId;

    private String vehicleNo;

    private Integer vehicleRegionCode;

    private Long positionTime;

    private Integer longitude;

    private Integer latitude;

    private Integer speed;

    private Integer direction;

    private Integer elevation;

    private Integer mileage;

    private Integer encrypt;

    private Integer warnStatus;

    private Integer vehStatus;

    private Integer bizStatus;

    private String orderId;

    private static final long serialVersionUID = 1L;

    public VehiclePosition(Integer id, String companyId, String vehicleNo) {
        this.id = id;
        this.companyId = companyId;
        this.vehicleNo = vehicleNo;
    }

    public VehiclePosition(Integer id, String companyId, String vehicleNo,
                           Integer vehicleRegionCode, Long positionTime, Integer longitude,
                           Integer latitude, Integer speed, Integer direction,
                           Integer elevation, Integer mileage, Integer encrypt,
                           Integer warnStatus, Integer vehStatus, Integer bizStatus,
                           String orderId) {
        this.id = id;
        this.companyId = companyId;
        this.vehicleNo = vehicleNo;
        this.vehicleRegionCode = vehicleRegionCode;
        this.positionTime = positionTime;
        this.longitude = longitude;
        this.latitude = latitude;
        this.speed = speed;
        this.direction = direction;
        this.elevation = elevation;
        this.mileage = mileage;
        this.encrypt = encrypt;
        this.warnStatus = warnStatus;
        this.vehStatus = vehStatus;
        this.bizStatus = bizStatus;
        this.orderId = orderId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo == null ? null : vehicleNo.trim();
    }

    public Integer getVehicleRegionCode() {
        return vehicleRegionCode;
    }

    public void setVehicleRegionCode(Integer vehicleRegionCode) {
        this.vehicleRegionCode = vehicleRegionCode;
    }

    public Long getPositionTime() {
        return positionTime;
    }

    public void setPositionTime(Long positionTime) {
        this.positionTime = positionTime;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
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

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
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
        this.orderId = orderId == null ? null : orderId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyId=").append(companyId);
        sb.append(", vehicleNo=").append(vehicleNo);
        sb.append(", vehicleRegionCode=").append(vehicleRegionCode);
        sb.append(", positionTime=").append(positionTime);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", speed=").append(speed);
        sb.append(", direction=").append(direction);
        sb.append(", elevation=").append(elevation);
        sb.append(", mileage=").append(mileage);
        sb.append(", encrypt=").append(encrypt);
        sb.append(", warnStatus=").append(warnStatus);
        sb.append(", vehStatus=").append(vehStatus);
        sb.append(", bizStatus=").append(bizStatus);
        sb.append(", orderId=").append(orderId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
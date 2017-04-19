package org.netCar.domain;

import javax.persistence.*;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "vehicleposition")
public class VehiclepositionEntity {
    private int id;

    public void setId(Integer id) {
        this.id = id;
    }

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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Column(name = "companyId", length = 32)
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }


    @Column(name = "vehicleNo", length = 32)
    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }


    @Column(name = "vehicleRegionCode")
    public Integer getVehicleRegionCode() {
        return vehicleRegionCode;
    }

    public void setVehicleRegionCode(Integer vehicleRegionCode) {
        this.vehicleRegionCode = vehicleRegionCode;
    }


    @Column(name = "positionTime")
    public Long getPositionTime() {
        return positionTime;
    }

    public void setPositionTime(Long positionTime) {
        this.positionTime = positionTime;
    }


    @Column(name = "longitude")
    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }


    @Column(name = "latitude")
    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }


    @Column(name = "speed")
    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }


    @Column(name = "direction")
    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }


    @Column(name = "elevation")
    public Integer getElevation() {
        return elevation;
    }

    public void setElevation(Integer elevation) {
        this.elevation = elevation;
    }


    @Column(name = "mileage")
    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }


    @Column(name = "encrypt")
    public Integer getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(Integer encrypt) {
        this.encrypt = encrypt;
    }


    @Column(name = "warnStatus")
    public Integer getWarnStatus() {
        return warnStatus;
    }

    public void setWarnStatus(Integer warnStatus) {
        this.warnStatus = warnStatus;
    }


    @Column(name = "vehStatus")
    public Integer getVehStatus() {
        return vehStatus;
    }

    public void setVehStatus(Integer vehStatus) {
        this.vehStatus = vehStatus;
    }


    @Column(name = "bizStatus")
    public Integer getBizStatus() {
        return bizStatus;
    }

    public void setBizStatus(Integer bizStatus) {
        this.bizStatus = bizStatus;
    }


    @Column(name = "orderId", length = 64)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehiclepositionEntity that = (VehiclepositionEntity) o;

        if (id != that.id) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (vehicleNo != null ? !vehicleNo.equals(that.vehicleNo) : that.vehicleNo != null) return false;
        if (vehicleRegionCode != null ? !vehicleRegionCode.equals(that.vehicleRegionCode) : that.vehicleRegionCode != null)
            return false;
        if (positionTime != null ? !positionTime.equals(that.positionTime) : that.positionTime != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
        if (speed != null ? !speed.equals(that.speed) : that.speed != null) return false;
        if (direction != null ? !direction.equals(that.direction) : that.direction != null) return false;
        if (elevation != null ? !elevation.equals(that.elevation) : that.elevation != null) return false;
        if (mileage != null ? !mileage.equals(that.mileage) : that.mileage != null) return false;
        if (encrypt != null ? !encrypt.equals(that.encrypt) : that.encrypt != null) return false;
        if (warnStatus != null ? !warnStatus.equals(that.warnStatus) : that.warnStatus != null) return false;
        if (vehStatus != null ? !vehStatus.equals(that.vehStatus) : that.vehStatus != null) return false;
        if (bizStatus != null ? !bizStatus.equals(that.bizStatus) : that.bizStatus != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (vehicleNo != null ? vehicleNo.hashCode() : 0);
        result = 31 * result + (vehicleRegionCode != null ? vehicleRegionCode.hashCode() : 0);
        result = 31 * result + (positionTime != null ? positionTime.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (speed != null ? speed.hashCode() : 0);
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        result = 31 * result + (elevation != null ? elevation.hashCode() : 0);
        result = 31 * result + (mileage != null ? mileage.hashCode() : 0);
        result = 31 * result + (encrypt != null ? encrypt.hashCode() : 0);
        result = 31 * result + (warnStatus != null ? warnStatus.hashCode() : 0);
        result = 31 * result + (vehStatus != null ? vehStatus.hashCode() : 0);
        result = 31 * result + (bizStatus != null ? bizStatus.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        return result;
    }
}

package org.netCar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by lyq on 2017/4/19.
 * 订单信息（发起、成功、撤销）
 */
@Entity
@Table(name = "order_info")
public class OrderInfoEntity  extends IdEntity{

    private String companyId;


    @Column(name = "company_id", length = 32)
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    private Integer address;


    @Column(name = "address")
    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    private String orderId;


    @Column(name = "order_id", length = 64)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    private Long departTime;


    @Column(name = "depart_time")
    public Long getDepartTime() {
        return departTime;
    }

    public void setDepartTime(Long departTime) {
        this.departTime = departTime;
    }

    private Long orderTime;


    @Column(name = "order_time")
    public Long getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Long orderTime) {
        this.orderTime = orderTime;
    }

    private String passengerNote;


    @Column(name = "passenger_note", length = 128)
    public String getPassengerNote() {
        return passengerNote;
    }

    public void setPassengerNote(String passengerNote) {
        this.passengerNote = passengerNote;
    }

    private String departure;


    @Column(name = "departure", length = 128)
    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    private Double depLongitude;


    @Column(name = "dep_longitude")
    public Double getDepLongitude() {
        return depLongitude;
    }

    public void setDepLongitude(Double depLongitude) {
        this.depLongitude = depLongitude;
    }

    private Double depLatitude;


    @Column(name = "dep_latitude")
    public Double getDepLatitude() {
        return depLatitude;
    }

    public void setDepLatitude(Double depLatitude) {
        this.depLatitude = depLatitude;
    }

    private String destination;


    @Column(name = "destination", length = 128)
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    private Double destLongitude;


    @Column(name = "dest_longitude")
    public Double getDestLongitude() {
        return destLongitude;
    }

    public void setDestLongitude(Double destLongitude) {
        this.destLongitude = destLongitude;
    }

    private Double destLatitude;


    @Column(name = "dest_latitude")
    public Double getDestLatitude() {
        return destLatitude;
    }

    public void setDestLatitude(Double destLatitude) {
        this.destLatitude = destLatitude;
    }

    private Integer encrypt;


    @Column(name = "encrypt")
    public Integer getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(Integer encrypt) {
        this.encrypt = encrypt;
    }

    private String fareType;


    @Column(name = "fare_type", length = 16)
    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    private Double longitude;


    @Column(name = "longitude")
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    private Double latitude;


    @Column(name = "latitude")
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    private String licenseId;


    @Column(name = "license_id", length = 32)
    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    private String driverPhone;


    @Column(name = "driver_phone", length = 32)
    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    private String vehicleNo;


    @Column(name = "vehicle_no", length = 32)
    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    private Long distributeTime;


    @Column(name = "distribute_time")
    public Long getDistributeTime() {
        return distributeTime;
    }

    public void setDistributeTime(Long distributeTime) {
        this.distributeTime = distributeTime;
    }

    private Long cancelTime;


    @Column(name = "cancel_time")
    public Long getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Long cancelTime) {
        this.cancelTime = cancelTime;
    }

    private String operator;


    @Column(name = "operator", length = 64)
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    private String cancelTypeCode;


    @Column(name = "cancel_type_code", length = 32)
    public String getCancelTypeCode() {
        return cancelTypeCode;
    }

    public void setCancelTypeCode(String cancelTypeCode) {
        this.cancelTypeCode = cancelTypeCode;
    }

    private String cancelReason;


    @Column(name = "cancel_reason", length = 128)
    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderInfoEntity that = (OrderInfoEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (departTime != null ? !departTime.equals(that.departTime) : that.departTime != null) return false;
        if (orderTime != null ? !orderTime.equals(that.orderTime) : that.orderTime != null) return false;
        if (passengerNote != null ? !passengerNote.equals(that.passengerNote) : that.passengerNote != null)
            return false;
        if (departure != null ? !departure.equals(that.departure) : that.departure != null) return false;
        if (depLongitude != null ? !depLongitude.equals(that.depLongitude) : that.depLongitude != null) return false;
        if (depLatitude != null ? !depLatitude.equals(that.depLatitude) : that.depLatitude != null) return false;
        if (destination != null ? !destination.equals(that.destination) : that.destination != null) return false;
        if (destLongitude != null ? !destLongitude.equals(that.destLongitude) : that.destLongitude != null)
            return false;
        if (destLatitude != null ? !destLatitude.equals(that.destLatitude) : that.destLatitude != null) return false;
        if (encrypt != null ? !encrypt.equals(that.encrypt) : that.encrypt != null) return false;
        if (fareType != null ? !fareType.equals(that.fareType) : that.fareType != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
        if (licenseId != null ? !licenseId.equals(that.licenseId) : that.licenseId != null) return false;
        if (driverPhone != null ? !driverPhone.equals(that.driverPhone) : that.driverPhone != null) return false;
        if (vehicleNo != null ? !vehicleNo.equals(that.vehicleNo) : that.vehicleNo != null) return false;
        if (distributeTime != null ? !distributeTime.equals(that.distributeTime) : that.distributeTime != null)
            return false;
        if (cancelTime != null ? !cancelTime.equals(that.cancelTime) : that.cancelTime != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (cancelTypeCode != null ? !cancelTypeCode.equals(that.cancelTypeCode) : that.cancelTypeCode != null)
            return false;
        if (cancelReason != null ? !cancelReason.equals(that.cancelReason) : that.cancelReason != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (departTime != null ? departTime.hashCode() : 0);
        result = 31 * result + (orderTime != null ? orderTime.hashCode() : 0);
        result = 31 * result + (passengerNote != null ? passengerNote.hashCode() : 0);
        result = 31 * result + (departure != null ? departure.hashCode() : 0);
        result = 31 * result + (depLongitude != null ? depLongitude.hashCode() : 0);
        result = 31 * result + (depLatitude != null ? depLatitude.hashCode() : 0);
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        result = 31 * result + (destLongitude != null ? destLongitude.hashCode() : 0);
        result = 31 * result + (destLatitude != null ? destLatitude.hashCode() : 0);
        result = 31 * result + (encrypt != null ? encrypt.hashCode() : 0);
        result = 31 * result + (fareType != null ? fareType.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (licenseId != null ? licenseId.hashCode() : 0);
        result = 31 * result + (driverPhone != null ? driverPhone.hashCode() : 0);
        result = 31 * result + (vehicleNo != null ? vehicleNo.hashCode() : 0);
        result = 31 * result + (distributeTime != null ? distributeTime.hashCode() : 0);
        result = 31 * result + (cancelTime != null ? cancelTime.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (cancelTypeCode != null ? cancelTypeCode.hashCode() : 0);
        result = 31 * result + (cancelReason != null ? cancelReason.hashCode() : 0);
        return result;
    }
}
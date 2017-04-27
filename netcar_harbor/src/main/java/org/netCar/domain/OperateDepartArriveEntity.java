package org.netCar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by lyq on 2017/4/19.
 * 经营信息
 */
@Entity
@Table(name = "operate_depart_arrive")
public class OperateDepartArriveEntity  extends IdEntity{

    private String companyId;


    @Column(name = "company_id", length = 32)
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    private String orderId;


    @Column(name = "order_id", length = 64)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    private Integer onArea;


    @Column(name = "on_area")
    public Integer getOnArea() {
        return onArea;
    }

    public void setOnArea(Integer onArea) {
        this.onArea = onArea;
    }

    private String driverName;


    @Column(name = "driver_name", length = 64)
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    private String licenseId;


    @Column(name = "license_id", length = 32)
    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    private String fareType;


    @Column(name = "fare_type", length = 16)
    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    private String vehicleNo;


    @Column(name = "vehicle_no", length = 32)
    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    private Long bookDepTime;


    @Column(name = "book_dep_time")
    public Long getBookDepTime() {
        return bookDepTime;
    }

    public void setBookDepTime(Long bookDepTime) {
        this.bookDepTime = bookDepTime;
    }

    private Integer waitTime;


    @Column(name = "wait_time")
    public Integer getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Integer waitTime) {
        this.waitTime = waitTime;
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

    private String depArea;


    @Column(name = "dep_area", length = 128)
    public String getDepArea() {
        return depArea;
    }

    public void setDepArea(String depArea) {
        this.depArea = depArea;
    }

    private Long depTime;


    @Column(name = "dep_time")
    public Long getDepTime() {
        return depTime;
    }

    public void setDepTime(Long depTime) {
        this.depTime = depTime;
    }

    private Integer encrypt;


    @Column(name = "encrypt")
    public Integer getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(Integer encrypt) {
        this.encrypt = encrypt;
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

    private String destArea;


    @Column(name = "dest_area", length = 128)
    public String getDestArea() {
        return destArea;
    }

    public void setDestArea(String destArea) {
        this.destArea = destArea;
    }

    private Long destTime;


    @Column(name = "dest_time")
    public Long getDestTime() {
        return destTime;
    }

    public void setDestTime(Long destTime) {
        this.destTime = destTime;
    }

    private String bookModel;


    @Column(name = "book_model", length = 64)
    public String getBookModel() {
        return bookModel;
    }

    public void setBookModel(String bookModel) {
        this.bookModel = bookModel;
    }

    private String model;


    @Column(name = "model", length = 64)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private float driveMile;


    @Column(name = "drive_mile")
    public float getDriveMile() {
        return driveMile;
    }

    public void setDriveMile(float driveMile) {
        this.driveMile = driveMile;
    }

    private Integer driveTime;


    @Column(name = "drive_time")
    public Integer getDriveTime() {
        return driveTime;
    }

    public void setDriveTime(Integer driveTime) {
        this.driveTime = driveTime;
    }

    private Float waitMile;


    @Column(name = "wait_mile")
    public Float getWaitMile() {
        return waitMile;
    }

    public void setWaitMile(Float waitMile) {
        this.waitMile = waitMile;
    }

    private float factPrice;


    @Column(name = "fact_price")
    public float getFactPrice() {
        return factPrice;
    }

    public void setFactPrice(float factPrice) {
        this.factPrice = factPrice;
    }

    private float price;


    @Column(name = "price")
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    private float cashPrice;


    @Column(name = "cash_price")
    public float getCashPrice() {
        return cashPrice;
    }

    public void setCashPrice(float cashPrice) {
        this.cashPrice = cashPrice;
    }

    private String lineName;


    @Column(name = "line_name", length = 64)
    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    private float linePrice;


    @Column(name = "line_price")
    public float getLinePrice() {
        return linePrice;
    }

    public void setLinePrice(float linePrice) {
        this.linePrice = linePrice;
    }

    private String posName;


    @Column(name = "pos_name", length = 64)
    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    private float posPrice;


    @Column(name = "pos_price")
    public float getPosPrice() {
        return posPrice;
    }

    public void setPosPrice(float posPrice) {
        this.posPrice = posPrice;
    }

    private float benfitPrice;


    @Column(name = "benfit_price")
    public float getBenfitPrice() {
        return benfitPrice;
    }

    public void setBenfitPrice(float benfitPrice) {
        this.benfitPrice = benfitPrice;
    }

    private float bookTip;


    @Column(name = "book_tip")
    public float getBookTip() {
        return bookTip;
    }

    public void setBookTip(float bookTip) {
        this.bookTip = bookTip;
    }

    private float passengerTip;


    @Column(name = "passenger_tip")
    public float getPassengerTip() {
        return passengerTip;
    }

    public void setPassengerTip(float passengerTip) {
        this.passengerTip = passengerTip;
    }

    private float peakUpPrice;


    @Column(name = "peak_up_price")
    public float getPeakUpPrice() {
        return peakUpPrice;
    }

    public void setPeakUpPrice(float peakUpPrice) {
        this.peakUpPrice = peakUpPrice;
    }

    private float nightUpPrice;


    @Column(name = "night_up_price")
    public float getNightUpPrice() {
        return nightUpPrice;
    }

    public void setNightUpPrice(float nightUpPrice) {
        this.nightUpPrice = nightUpPrice;
    }

    private float farUpPrice;


    @Column(name = "far_up_price")
    public float getFarUpPrice() {
        return farUpPrice;
    }

    public void setFarUpPrice(float farUpPrice) {
        this.farUpPrice = farUpPrice;
    }

    private float otherUpPrice;


    @Column(name = "other_up_price")
    public float getOtherUpPrice() {
        return otherUpPrice;
    }

    public void setOtherUpPrice(float otherUpPrice) {
        this.otherUpPrice = otherUpPrice;
    }

    private String payState;


    @Column(name = "pay_state", length = 32)
    public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState;
    }

    private Long payTime;


    @Column(name = "pay_time")
    public Long getPayTime() {
        return payTime;
    }

    public void setPayTime(Long payTime) {
        this.payTime = payTime;
    }

    private Long orderMatchTime;


    @Column(name = "order_match_time")
    public Long getOrderMatchTime() {
        return orderMatchTime;
    }

    public void setOrderMatchTime(Long orderMatchTime) {
        this.orderMatchTime = orderMatchTime;
    }

    private String invoiceStatus;


    @Column(name = "invoice_status", length = 32)
    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    private Integer isBeyondOperate;


    @Column(name = "is_beyond_operate")
    public Integer getIsBeyondOperate() {
        return isBeyondOperate;
    }

    public void setIsBeyondOperate(Integer isBeyondOperate) {
        this.isBeyondOperate = isBeyondOperate;
    }
    
}

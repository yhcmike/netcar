package org.netCar.domain;

import javax.persistence.Entity;

/**
 * Created by ffd on 2017/4/19.
 */
@Entity
@javax.persistence.Table(name = "operate_depart_arrive")
public class OperateDepartArriveEntity  extends IdEntity{

    private String companyId;


    @javax.persistence.Column(name = "company_id", length = 32)
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    private String orderId;


    @javax.persistence.Column(name = "order_id", length = 64)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    private Integer onArea;


    @javax.persistence.Column(name = "on_area")
    public Integer getOnArea() {
        return onArea;
    }

    public void setOnArea(Integer onArea) {
        this.onArea = onArea;
    }

    private String driverName;


    @javax.persistence.Column(name = "driver_name", length = 64)
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    private String licenseId;


    @javax.persistence.Column(name = "license_id", length = 32)
    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    private String fareType;


    @javax.persistence.Column(name = "fare_type", length = 16)
    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    private String vehicleNo;


    @javax.persistence.Column(name = "vehicle_no", length = 32)
    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    private Long bookDepTime;


    @javax.persistence.Column(name = "book_dep_time")
    public Long getBookDepTime() {
        return bookDepTime;
    }

    public void setBookDepTime(Long bookDepTime) {
        this.bookDepTime = bookDepTime;
    }

    private Long waitTime;


    @javax.persistence.Column(name = "wait_time")
    public Long getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Long waitTime) {
        this.waitTime = waitTime;
    }

    private String depLongitude;


    @javax.persistence.Column(name = "dep_longitude", length = 10)
    public String getDepLongitude() {
        return depLongitude;
    }

    public void setDepLongitude(String depLongitude) {
        this.depLongitude = depLongitude;
    }

    private String depLatitude;


    @javax.persistence.Column(name = "dep_latitude", length = 10)
    public String getDepLatitude() {
        return depLatitude;
    }

    public void setDepLatitude(String depLatitude) {
        this.depLatitude = depLatitude;
    }

    private String depArea;


    @javax.persistence.Column(name = "dep_area", length = 128)
    public String getDepArea() {
        return depArea;
    }

    public void setDepArea(String depArea) {
        this.depArea = depArea;
    }

    private Long depTime;


    @javax.persistence.Column(name = "dep_time")
    public Long getDepTime() {
        return depTime;
    }

    public void setDepTime(Long depTime) {
        this.depTime = depTime;
    }

    private Integer encrypt;


    @javax.persistence.Column(name = "encrypt")
    public Integer getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(Integer encrypt) {
        this.encrypt = encrypt;
    }

    private Integer destLongitude;


    @javax.persistence.Column(name = "dest_longitude")
    public Integer getDestLongitude() {
        return destLongitude;
    }

    public void setDestLongitude(Integer destLongitude) {
        this.destLongitude = destLongitude;
    }

    private Integer destLatitude;


    @javax.persistence.Column(name = "dest_latitude")
    public Integer getDestLatitude() {
        return destLatitude;
    }

    public void setDestLatitude(Integer destLatitude) {
        this.destLatitude = destLatitude;
    }

    private String destArea;


    @javax.persistence.Column(name = "dest_area", length = 128)
    public String getDestArea() {
        return destArea;
    }

    public void setDestArea(String destArea) {
        this.destArea = destArea;
    }

    private Long destTime;


    @javax.persistence.Column(name = "dest_time")
    public Long getDestTime() {
        return destTime;
    }

    public void setDestTime(Long destTime) {
        this.destTime = destTime;
    }

    private String bookModel;


    @javax.persistence.Column(name = "book_model", length = 64)
    public String getBookModel() {
        return bookModel;
    }

    public void setBookModel(String bookModel) {
        this.bookModel = bookModel;
    }

    private String model;


    @javax.persistence.Column(name = "model", length = 64)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private Integer driveMile;


    @javax.persistence.Column(name = "drive_mile")
    public Integer getDriveMile() {
        return driveMile;
    }

    public void setDriveMile(Integer driveMile) {
        this.driveMile = driveMile;
    }

    private Integer driveTime;


    @javax.persistence.Column(name = "drive_time")
    public Integer getDriveTime() {
        return driveTime;
    }

    public void setDriveTime(Integer driveTime) {
        this.driveTime = driveTime;
    }

    private Integer waitMile;


    @javax.persistence.Column(name = "wait_mile")
    public Integer getWaitMile() {
        return waitMile;
    }

    public void setWaitMile(Integer waitMile) {
        this.waitMile = waitMile;
    }

    private Integer factPrice;


    @javax.persistence.Column(name = "fact_price")
    public Integer getFactPrice() {
        return factPrice;
    }

    public void setFactPrice(Integer factPrice) {
        this.factPrice = factPrice;
    }

    private Integer price;


    @javax.persistence.Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    private Integer cashPrice;


    @javax.persistence.Column(name = "cash_price")
    public Integer getCashPrice() {
        return cashPrice;
    }

    public void setCashPrice(Integer cashPrice) {
        this.cashPrice = cashPrice;
    }

    private String lineName;


    @javax.persistence.Column(name = "line_name", length = 64)
    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    private Integer linePrice;


    @javax.persistence.Column(name = "line_price")
    public Integer getLinePrice() {
        return linePrice;
    }

    public void setLinePrice(Integer linePrice) {
        this.linePrice = linePrice;
    }

    private String posName;


    @javax.persistence.Column(name = "pos_name", length = 64)
    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    private Integer posPrice;


    @javax.persistence.Column(name = "pos_price")
    public Integer getPosPrice() {
        return posPrice;
    }

    public void setPosPrice(Integer posPrice) {
        this.posPrice = posPrice;
    }

    private Integer benfitPrice;


    @javax.persistence.Column(name = "benfit_price")
    public Integer getBenfitPrice() {
        return benfitPrice;
    }

    public void setBenfitPrice(Integer benfitPrice) {
        this.benfitPrice = benfitPrice;
    }

    private Integer bookTip;


    @javax.persistence.Column(name = "book_tip")
    public Integer getBookTip() {
        return bookTip;
    }

    public void setBookTip(Integer bookTip) {
        this.bookTip = bookTip;
    }

    private Integer passengerTip;


    @javax.persistence.Column(name = "passenger_tip")
    public Integer getPassengerTip() {
        return passengerTip;
    }

    public void setPassengerTip(Integer passengerTip) {
        this.passengerTip = passengerTip;
    }

    private Integer peakUpPrice;


    @javax.persistence.Column(name = "peak_up_price")
    public Integer getPeakUpPrice() {
        return peakUpPrice;
    }

    public void setPeakUpPrice(Integer peakUpPrice) {
        this.peakUpPrice = peakUpPrice;
    }

    private Integer nightUpPrice;


    @javax.persistence.Column(name = "night_up_price")
    public Integer getNightUpPrice() {
        return nightUpPrice;
    }

    public void setNightUpPrice(Integer nightUpPrice) {
        this.nightUpPrice = nightUpPrice;
    }

    private Integer farUpPrice;


    @javax.persistence.Column(name = "far_up_price")
    public Integer getFarUpPrice() {
        return farUpPrice;
    }

    public void setFarUpPrice(Integer farUpPrice) {
        this.farUpPrice = farUpPrice;
    }

    private Integer otherUpPrice;


    @javax.persistence.Column(name = "other_up_price")
    public Integer getOtherUpPrice() {
        return otherUpPrice;
    }

    public void setOtherUpPrice(Integer otherUpPrice) {
        this.otherUpPrice = otherUpPrice;
    }

    private String payState;


    @javax.persistence.Column(name = "pay_state", length = 32)
    public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState;
    }

    private Long payTime;


    @javax.persistence.Column(name = "pay_time")
    public Long getPayTime() {
        return payTime;
    }

    public void setPayTime(Long payTime) {
        this.payTime = payTime;
    }

    private Long orderMatchTime;


    @javax.persistence.Column(name = "order_match_time")
    public Long getOrderMatchTime() {
        return orderMatchTime;
    }

    public void setOrderMatchTime(Long orderMatchTime) {
        this.orderMatchTime = orderMatchTime;
    }

    private String invoiceStatus;


    @javax.persistence.Column(name = "invoice_status", length = 32)
    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    private Integer isBeyondOperate;


    @javax.persistence.Column(name = "is_beyond_operate")
    public Integer getIsBeyondOperate() {
        return isBeyondOperate;
    }

    public void setIsBeyondOperate(Integer isBeyondOperate) {
        this.isBeyondOperate = isBeyondOperate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OperateDepartArriveEntity that = (OperateDepartArriveEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (onArea != null ? !onArea.equals(that.onArea) : that.onArea != null) return false;
        if (driverName != null ? !driverName.equals(that.driverName) : that.driverName != null) return false;
        if (licenseId != null ? !licenseId.equals(that.licenseId) : that.licenseId != null) return false;
        if (fareType != null ? !fareType.equals(that.fareType) : that.fareType != null) return false;
        if (vehicleNo != null ? !vehicleNo.equals(that.vehicleNo) : that.vehicleNo != null) return false;
        if (bookDepTime != null ? !bookDepTime.equals(that.bookDepTime) : that.bookDepTime != null) return false;
        if (waitTime != null ? !waitTime.equals(that.waitTime) : that.waitTime != null) return false;
        if (depLongitude != null ? !depLongitude.equals(that.depLongitude) : that.depLongitude != null) return false;
        if (depLatitude != null ? !depLatitude.equals(that.depLatitude) : that.depLatitude != null) return false;
        if (depArea != null ? !depArea.equals(that.depArea) : that.depArea != null) return false;
        if (depTime != null ? !depTime.equals(that.depTime) : that.depTime != null) return false;
        if (encrypt != null ? !encrypt.equals(that.encrypt) : that.encrypt != null) return false;
        if (destLongitude != null ? !destLongitude.equals(that.destLongitude) : that.destLongitude != null)
            return false;
        if (destLatitude != null ? !destLatitude.equals(that.destLatitude) : that.destLatitude != null) return false;
        if (destArea != null ? !destArea.equals(that.destArea) : that.destArea != null) return false;
        if (destTime != null ? !destTime.equals(that.destTime) : that.destTime != null) return false;
        if (bookModel != null ? !bookModel.equals(that.bookModel) : that.bookModel != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (driveMile != null ? !driveMile.equals(that.driveMile) : that.driveMile != null) return false;
        if (driveTime != null ? !driveTime.equals(that.driveTime) : that.driveTime != null) return false;
        if (waitMile != null ? !waitMile.equals(that.waitMile) : that.waitMile != null) return false;
        if (factPrice != null ? !factPrice.equals(that.factPrice) : that.factPrice != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (cashPrice != null ? !cashPrice.equals(that.cashPrice) : that.cashPrice != null) return false;
        if (lineName != null ? !lineName.equals(that.lineName) : that.lineName != null) return false;
        if (linePrice != null ? !linePrice.equals(that.linePrice) : that.linePrice != null) return false;
        if (posName != null ? !posName.equals(that.posName) : that.posName != null) return false;
        if (posPrice != null ? !posPrice.equals(that.posPrice) : that.posPrice != null) return false;
        if (benfitPrice != null ? !benfitPrice.equals(that.benfitPrice) : that.benfitPrice != null) return false;
        if (bookTip != null ? !bookTip.equals(that.bookTip) : that.bookTip != null) return false;
        if (passengerTip != null ? !passengerTip.equals(that.passengerTip) : that.passengerTip != null) return false;
        if (peakUpPrice != null ? !peakUpPrice.equals(that.peakUpPrice) : that.peakUpPrice != null) return false;
        if (nightUpPrice != null ? !nightUpPrice.equals(that.nightUpPrice) : that.nightUpPrice != null) return false;
        if (farUpPrice != null ? !farUpPrice.equals(that.farUpPrice) : that.farUpPrice != null) return false;
        if (otherUpPrice != null ? !otherUpPrice.equals(that.otherUpPrice) : that.otherUpPrice != null) return false;
        if (payState != null ? !payState.equals(that.payState) : that.payState != null) return false;
        if (payTime != null ? !payTime.equals(that.payTime) : that.payTime != null) return false;
        if (orderMatchTime != null ? !orderMatchTime.equals(that.orderMatchTime) : that.orderMatchTime != null)
            return false;
        if (invoiceStatus != null ? !invoiceStatus.equals(that.invoiceStatus) : that.invoiceStatus != null)
            return false;
        if (isBeyondOperate != null ? !isBeyondOperate.equals(that.isBeyondOperate) : that.isBeyondOperate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (onArea != null ? onArea.hashCode() : 0);
        result = 31 * result + (driverName != null ? driverName.hashCode() : 0);
        result = 31 * result + (licenseId != null ? licenseId.hashCode() : 0);
        result = 31 * result + (fareType != null ? fareType.hashCode() : 0);
        result = 31 * result + (vehicleNo != null ? vehicleNo.hashCode() : 0);
        result = 31 * result + (bookDepTime != null ? bookDepTime.hashCode() : 0);
        result = 31 * result + (waitTime != null ? waitTime.hashCode() : 0);
        result = 31 * result + (depLongitude != null ? depLongitude.hashCode() : 0);
        result = 31 * result + (depLatitude != null ? depLatitude.hashCode() : 0);
        result = 31 * result + (depArea != null ? depArea.hashCode() : 0);
        result = 31 * result + (depTime != null ? depTime.hashCode() : 0);
        result = 31 * result + (encrypt != null ? encrypt.hashCode() : 0);
        result = 31 * result + (destLongitude != null ? destLongitude.hashCode() : 0);
        result = 31 * result + (destLatitude != null ? destLatitude.hashCode() : 0);
        result = 31 * result + (destArea != null ? destArea.hashCode() : 0);
        result = 31 * result + (destTime != null ? destTime.hashCode() : 0);
        result = 31 * result + (bookModel != null ? bookModel.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (driveMile != null ? driveMile.hashCode() : 0);
        result = 31 * result + (driveTime != null ? driveTime.hashCode() : 0);
        result = 31 * result + (waitMile != null ? waitMile.hashCode() : 0);
        result = 31 * result + (factPrice != null ? factPrice.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (cashPrice != null ? cashPrice.hashCode() : 0);
        result = 31 * result + (lineName != null ? lineName.hashCode() : 0);
        result = 31 * result + (linePrice != null ? linePrice.hashCode() : 0);
        result = 31 * result + (posName != null ? posName.hashCode() : 0);
        result = 31 * result + (posPrice != null ? posPrice.hashCode() : 0);
        result = 31 * result + (benfitPrice != null ? benfitPrice.hashCode() : 0);
        result = 31 * result + (bookTip != null ? bookTip.hashCode() : 0);
        result = 31 * result + (passengerTip != null ? passengerTip.hashCode() : 0);
        result = 31 * result + (peakUpPrice != null ? peakUpPrice.hashCode() : 0);
        result = 31 * result + (nightUpPrice != null ? nightUpPrice.hashCode() : 0);
        result = 31 * result + (farUpPrice != null ? farUpPrice.hashCode() : 0);
        result = 31 * result + (otherUpPrice != null ? otherUpPrice.hashCode() : 0);
        result = 31 * result + (payState != null ? payState.hashCode() : 0);
        result = 31 * result + (payTime != null ? payTime.hashCode() : 0);
        result = 31 * result + (orderMatchTime != null ? orderMatchTime.hashCode() : 0);
        result = 31 * result + (invoiceStatus != null ? invoiceStatus.hashCode() : 0);
        result = 31 * result + (isBeyondOperate != null ? isBeyondOperate.hashCode() : 0);
        return result;
    }
}

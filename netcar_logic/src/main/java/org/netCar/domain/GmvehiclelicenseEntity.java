package org.netCar.domain;

import javax.persistence.Entity;

/**
 * Created by ffd on 2017/4/19.
 */
@Entity
@javax.persistence.Table(name = "gm_vehicle_license")
public class GmVehicleLicenseEntity  extends IdEntity{

    private Integer address;


    @javax.persistence.Column(name = "address")
    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    private String vehicleNo;


    @javax.persistence.Column(name = "vehicle_no", length = 32)
    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    private String plateColor;


    @javax.persistence.Column(name = "plate_color", length = 32)
    public String getPlateColor() {
        return plateColor;
    }

    public void setPlateColor(String plateColor) {
        this.plateColor = plateColor;
    }

    private String brand;


    @javax.persistence.Column(name = "brand", length = 64)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String model;


    @javax.persistence.Column(name = "model", length = 64)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String engineId;


    @javax.persistence.Column(name = "engine_id", length = 32)
    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    private String vIn;


    @javax.persistence.Column(name = "vIN", length = 17)
    public String getvIn() {
        return vIn;
    }

    public void setvIn(String vIn) {
        this.vIn = vIn;
    }

    private String vehicleType;


    @javax.persistence.Column(name = "vehicle_type", length = 64)
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    private String vehicleTypeCode;


    @javax.persistence.Column(name = "vehicle_type_code", length = 32)
    public String getVehicleTypeCode() {
        return vehicleTypeCode;
    }

    public void setVehicleTypeCode(String vehicleTypeCode) {
        this.vehicleTypeCode = vehicleTypeCode;
    }

    private Integer deliveryDate;


    @javax.persistence.Column(name = "delivery_date")
    public Integer getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Integer deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    private Integer certifyDateA;


    @javax.persistence.Column(name = "certify_dateA")
    public Integer getCertifyDateA() {
        return certifyDateA;
    }

    public void setCertifyDateA(Integer certifyDateA) {
        this.certifyDateA = certifyDateA;
    }

    private String fuelType;


    @javax.persistence.Column(name = "fuel_type", length = 32)
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    private Integer wheelbase;


    @javax.persistence.Column(name = "wheelbase")
    public Integer getWheelbase() {
        return wheelbase;
    }

    public void setWheelbase(Integer wheelbase) {
        this.wheelbase = wheelbase;
    }

    private Integer commander;


    @javax.persistence.Column(name = "commander")
    public Integer getCommander() {
        return commander;
    }

    public void setCommander(Integer commander) {
        this.commander = commander;
    }

    private Integer width;


    @javax.persistence.Column(name = "width")
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    private Integer height;


    @javax.persistence.Column(name = "height")
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    private Integer power;


    @javax.persistence.Column(name = "power")
    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    private Integer seats;


    @javax.persistence.Column(name = "seats")
    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    private String gPsBrand;


    @javax.persistence.Column(name = "gPS_brand", length = 256)
    public String getgPsBrand() {
        return gPsBrand;
    }

    public void setgPsBrand(String gPsBrand) {
        this.gPsBrand = gPsBrand;
    }

    private String gPsModel;


    @javax.persistence.Column(name = "gPS_model", length = 64)
    public String getgPsModel() {
        return gPsModel;
    }

    public void setgPsModel(String gPsModel) {
        this.gPsModel = gPsModel;
    }

    private Integer state;


    @javax.persistence.Column(name = "state")
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    private String transArea;


    @javax.persistence.Column(name = "trans_area", length = 256)
    public String getTransArea() {
        return transArea;
    }

    public void setTransArea(String transArea) {
        this.transArea = transArea;
    }

    private String certificate;


    @javax.persistence.Column(name = "certificate", length = 64)
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    private String transAgency;


    @javax.persistence.Column(name = "trans_agency", length = 256)
    public String getTransAgency() {
        return transAgency;
    }

    public void setTransAgency(String transAgency) {
        this.transAgency = transAgency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GmVehicleLicenseEntity that = (GmVehicleLicenseEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (vehicleNo != null ? !vehicleNo.equals(that.vehicleNo) : that.vehicleNo != null) return false;
        if (plateColor != null ? !plateColor.equals(that.plateColor) : that.plateColor != null) return false;
        if (brand != null ? !brand.equals(that.brand) : that.brand != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (engineId != null ? !engineId.equals(that.engineId) : that.engineId != null) return false;
        if (vIn != null ? !vIn.equals(that.vIn) : that.vIn != null) return false;
        if (vehicleType != null ? !vehicleType.equals(that.vehicleType) : that.vehicleType != null) return false;
        if (vehicleTypeCode != null ? !vehicleTypeCode.equals(that.vehicleTypeCode) : that.vehicleTypeCode != null)
            return false;
        if (deliveryDate != null ? !deliveryDate.equals(that.deliveryDate) : that.deliveryDate != null) return false;
        if (certifyDateA != null ? !certifyDateA.equals(that.certifyDateA) : that.certifyDateA != null) return false;
        if (fuelType != null ? !fuelType.equals(that.fuelType) : that.fuelType != null) return false;
        if (wheelbase != null ? !wheelbase.equals(that.wheelbase) : that.wheelbase != null) return false;
        if (commander != null ? !commander.equals(that.commander) : that.commander != null) return false;
        if (width != null ? !width.equals(that.width) : that.width != null) return false;
        if (height != null ? !height.equals(that.height) : that.height != null) return false;
        if (power != null ? !power.equals(that.power) : that.power != null) return false;
        if (seats != null ? !seats.equals(that.seats) : that.seats != null) return false;
        if (gPsBrand != null ? !gPsBrand.equals(that.gPsBrand) : that.gPsBrand != null) return false;
        if (gPsModel != null ? !gPsModel.equals(that.gPsModel) : that.gPsModel != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (transArea != null ? !transArea.equals(that.transArea) : that.transArea != null) return false;
        if (certificate != null ? !certificate.equals(that.certificate) : that.certificate != null) return false;
        if (transAgency != null ? !transAgency.equals(that.transAgency) : that.transAgency != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (vehicleNo != null ? vehicleNo.hashCode() : 0);
        result = 31 * result + (plateColor != null ? plateColor.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (engineId != null ? engineId.hashCode() : 0);
        result = 31 * result + (vIn != null ? vIn.hashCode() : 0);
        result = 31 * result + (vehicleType != null ? vehicleType.hashCode() : 0);
        result = 31 * result + (vehicleTypeCode != null ? vehicleTypeCode.hashCode() : 0);
        result = 31 * result + (deliveryDate != null ? deliveryDate.hashCode() : 0);
        result = 31 * result + (certifyDateA != null ? certifyDateA.hashCode() : 0);
        result = 31 * result + (fuelType != null ? fuelType.hashCode() : 0);
        result = 31 * result + (wheelbase != null ? wheelbase.hashCode() : 0);
        result = 31 * result + (commander != null ? commander.hashCode() : 0);
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (power != null ? power.hashCode() : 0);
        result = 31 * result + (seats != null ? seats.hashCode() : 0);
        result = 31 * result + (gPsBrand != null ? gPsBrand.hashCode() : 0);
        result = 31 * result + (gPsModel != null ? gPsModel.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (transArea != null ? transArea.hashCode() : 0);
        result = 31 * result + (certificate != null ? certificate.hashCode() : 0);
        result = 31 * result + (transAgency != null ? transAgency.hashCode() : 0);
        return result;
    }
}

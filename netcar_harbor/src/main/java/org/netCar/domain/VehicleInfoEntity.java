package org.netCar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by ffd on 2017/4/19.
 * 车辆基本信息
 */
@Entity
@Table(name = "vehicle_info")
public class VehicleInfoEntity  extends IdEntity{

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

    private String vehicleNo;


    @Column(name = "vehicle_no", length = 32)
    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    private String plateColor;


    @Column(name = "plate_color", length = 32)
    public String getPlateColor() {
        return plateColor;
    }

    public void setPlateColor(String plateColor) {
        this.plateColor = plateColor;
    }

    private Integer seats;


    @Column(name = "seats")
    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    private String brand;


    @Column(name = "brand", length = 64)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String model;


    @Column(name = "model", length = 64)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String vehicleType;


    @Column(name = "vehicle_type", length = 64)
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    private String ownerName;


    @Column(name = "owner_name", length = 64)
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    private String vehicleColor;


    @Column(name = "vehicle_color", length = 32)
    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    private String engineId;


    @Column(name = "engine_id", length = 32)
    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    private String vIn;


    @Column(name = "vIN", length = 17)
    public String getvIn() {
        return vIn;
    }

    public void setvIn(String vIn) {
        this.vIn = vIn;
    }

    private Long certifyDateA;


    @Column(name = "certify_date_A")
    public Long getCertifyDateA() {
        return certifyDateA;
    }

    public void setCertifyDateA(Long certifyDateA) {
        this.certifyDateA = certifyDateA;
    }

    private String fuelType;


    @Column(name = "fuel_type", length = 32)
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    private String engineDisplace;


    @Column(name = "engine_displace", length = 32)
    public String getEngineDisplace() {
        return engineDisplace;
    }

    public void setEngineDisplace(String engineDisplace) {
        this.engineDisplace = engineDisplace;
    }

    private String photoId;


    @Column(name = "photo_id", length = 128)
    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    private String certificate;


    @Column(name = "certificate", length = 64)
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    private String transAgency;


    @Column(name = "trans_agency", length = 256)
    public String getTransAgency() {
        return transAgency;
    }

    public void setTransAgency(String transAgency) {
        this.transAgency = transAgency;
    }

    private String transArea;


    @Column(name = "trans_area", length = 256)
    public String getTransArea() {
        return transArea;
    }

    public void setTransArea(String transArea) {
        this.transArea = transArea;
    }

    private Long transDateStart;


    @Column(name = "trans_date_start")
    public Long getTransDateStart() {
        return transDateStart;
    }

    public void setTransDateStart(Long transDateStart) {
        this.transDateStart = transDateStart;
    }

    private Long transDateStop;


    @Column(name = "trans_date_stop")
    public Long getTransDateStop() {
        return transDateStop;
    }

    public void setTransDateStop(Long transDateStop) {
        this.transDateStop = transDateStop;
    }

    private Long certifyDateB;


    @Column(name = "certify_date_B")
    public Long getCertifyDateB() {
        return certifyDateB;
    }

    public void setCertifyDateB(Long certifyDateB) {
        this.certifyDateB = certifyDateB;
    }

    private String fixState;


    @Column(name = "fix_state", length = 64)
    public String getFixState() {
        return fixState;
    }

    public void setFixState(String fixState) {
        this.fixState = fixState;
    }

    private Long nextFixDate;


    @Column(name = "next_fix_date")
    public Long getNextFixDate() {
        return nextFixDate;
    }

    public void setNextFixDate(Long nextFixDate) {
        this.nextFixDate = nextFixDate;
    }

    private String checkState;


    @Column(name = "check_state")
    public String getCheckState() {
        return checkState;
    }

    public void setCheckState(String checkState) {
        this.checkState = checkState;
    }

    private String feePrintId;


    @Column(name = "fee_print_id", length = 32)
    public String getFeePrintId() {
        return feePrintId;
    }

    public void setFeePrintId(String feePrintId) {
        this.feePrintId = feePrintId;
    }

    private String gPsBrand;


    @Column(name = "gPS_brand", length = 256)
    public String getgPsBrand() {
        return gPsBrand;
    }

    public void setgPsBrand(String gPsBrand) {
        this.gPsBrand = gPsBrand;
    }

    private String gPsModel;


    @Column(name = "gPS_model", length = 64)
    public String getgPsModel() {
        return gPsModel;
    }

    public void setgPsModel(String gPsModel) {
        this.gPsModel = gPsModel;
    }

    private String gPsimei;


    @Column(name = "gPSIMEI", length = 128)
    public String getgPsimei() {
        return gPsimei;
    }

    public void setgPsimei(String gPsimei) {
        this.gPsimei = gPsimei;
    }

    private Long gPsInstallDate;


    @Column(name = "gPS_install_date")
    public Long getgPsInstallDate() {
        return gPsInstallDate;
    }

    public void setgPsInstallDate(Long gPsInstallDate) {
        this.gPsInstallDate = gPsInstallDate;
    }

    private Long registerDate;


    @Column(name = "register_date")
    public Long getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Long registerDate) {
        this.registerDate = registerDate;
    }

    private Integer commercialType;


    @Column(name = "commercial_type")
    public Integer getCommercialType() {
        return commercialType;
    }

    public void setCommercialType(Integer commercialType) {
        this.commercialType = commercialType;
    }

    private String fareType;


    @Column(name = "fare_type", length = 16)
    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    private Integer state;


    @Column(name = "state")
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    private Integer flag;


    @Column(name = "flag")
    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    private Long updateTime;


    @Column(name = "update_time")
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehicleInfoEntity that = (VehicleInfoEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (vehicleNo != null ? !vehicleNo.equals(that.vehicleNo) : that.vehicleNo != null) return false;
        if (plateColor != null ? !plateColor.equals(that.plateColor) : that.plateColor != null) return false;
        if (seats != null ? !seats.equals(that.seats) : that.seats != null) return false;
        if (brand != null ? !brand.equals(that.brand) : that.brand != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (vehicleType != null ? !vehicleType.equals(that.vehicleType) : that.vehicleType != null) return false;
        if (ownerName != null ? !ownerName.equals(that.ownerName) : that.ownerName != null) return false;
        if (vehicleColor != null ? !vehicleColor.equals(that.vehicleColor) : that.vehicleColor != null) return false;
        if (engineId != null ? !engineId.equals(that.engineId) : that.engineId != null) return false;
        if (vIn != null ? !vIn.equals(that.vIn) : that.vIn != null) return false;
        if (certifyDateA != null ? !certifyDateA.equals(that.certifyDateA) : that.certifyDateA != null) return false;
        if (fuelType != null ? !fuelType.equals(that.fuelType) : that.fuelType != null) return false;
        if (engineDisplace != null ? !engineDisplace.equals(that.engineDisplace) : that.engineDisplace != null)
            return false;
        if (photoId != null ? !photoId.equals(that.photoId) : that.photoId != null) return false;
        if (certificate != null ? !certificate.equals(that.certificate) : that.certificate != null) return false;
        if (transAgency != null ? !transAgency.equals(that.transAgency) : that.transAgency != null) return false;
        if (transArea != null ? !transArea.equals(that.transArea) : that.transArea != null) return false;
        if (transDateStart != null ? !transDateStart.equals(that.transDateStart) : that.transDateStart != null)
            return false;
        if (transDateStop != null ? !transDateStop.equals(that.transDateStop) : that.transDateStop != null)
            return false;
        if (certifyDateB != null ? !certifyDateB.equals(that.certifyDateB) : that.certifyDateB != null) return false;
        if (fixState != null ? !fixState.equals(that.fixState) : that.fixState != null) return false;
        if (nextFixDate != null ? !nextFixDate.equals(that.nextFixDate) : that.nextFixDate != null) return false;
        if (checkState != null ? !checkState.equals(that.checkState) : that.checkState != null) return false;
        if (feePrintId != null ? !feePrintId.equals(that.feePrintId) : that.feePrintId != null) return false;
        if (gPsBrand != null ? !gPsBrand.equals(that.gPsBrand) : that.gPsBrand != null) return false;
        if (gPsModel != null ? !gPsModel.equals(that.gPsModel) : that.gPsModel != null) return false;
        if (gPsimei != null ? !gPsimei.equals(that.gPsimei) : that.gPsimei != null) return false;
        if (gPsInstallDate != null ? !gPsInstallDate.equals(that.gPsInstallDate) : that.gPsInstallDate != null)
            return false;
        if (registerDate != null ? !registerDate.equals(that.registerDate) : that.registerDate != null) return false;
        if (commercialType != null ? !commercialType.equals(that.commercialType) : that.commercialType != null)
            return false;
        if (fareType != null ? !fareType.equals(that.fareType) : that.fareType != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (vehicleNo != null ? vehicleNo.hashCode() : 0);
        result = 31 * result + (plateColor != null ? plateColor.hashCode() : 0);
        result = 31 * result + (seats != null ? seats.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (vehicleType != null ? vehicleType.hashCode() : 0);
        result = 31 * result + (ownerName != null ? ownerName.hashCode() : 0);
        result = 31 * result + (vehicleColor != null ? vehicleColor.hashCode() : 0);
        result = 31 * result + (engineId != null ? engineId.hashCode() : 0);
        result = 31 * result + (vIn != null ? vIn.hashCode() : 0);
        result = 31 * result + (certifyDateA != null ? certifyDateA.hashCode() : 0);
        result = 31 * result + (fuelType != null ? fuelType.hashCode() : 0);
        result = 31 * result + (engineDisplace != null ? engineDisplace.hashCode() : 0);
        result = 31 * result + (photoId != null ? photoId.hashCode() : 0);
        result = 31 * result + (certificate != null ? certificate.hashCode() : 0);
        result = 31 * result + (transAgency != null ? transAgency.hashCode() : 0);
        result = 31 * result + (transArea != null ? transArea.hashCode() : 0);
        result = 31 * result + (transDateStart != null ? transDateStart.hashCode() : 0);
        result = 31 * result + (transDateStop != null ? transDateStop.hashCode() : 0);
        result = 31 * result + (certifyDateB != null ? certifyDateB.hashCode() : 0);
        result = 31 * result + (fixState != null ? fixState.hashCode() : 0);
        result = 31 * result + (nextFixDate != null ? nextFixDate.hashCode() : 0);
        result = 31 * result + (checkState != null ? checkState.hashCode() : 0);
        result = 31 * result + (feePrintId != null ? feePrintId.hashCode() : 0);
        result = 31 * result + (gPsBrand != null ? gPsBrand.hashCode() : 0);
        result = 31 * result + (gPsModel != null ? gPsModel.hashCode() : 0);
        result = 31 * result + (gPsimei != null ? gPsimei.hashCode() : 0);
        result = 31 * result + (gPsInstallDate != null ? gPsInstallDate.hashCode() : 0);
        result = 31 * result + (registerDate != null ? registerDate.hashCode() : 0);
        result = 31 * result + (commercialType != null ? commercialType.hashCode() : 0);
        result = 31 * result + (fareType != null ? fareType.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
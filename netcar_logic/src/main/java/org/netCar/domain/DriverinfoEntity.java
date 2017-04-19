package org.netCar.domain;

import javax.persistence.Entity;

/**
 * Created by ffd on 2017/4/19.
 */
@Entity
@javax.persistence.Table(name = "driver_info")
public class DriverInfoEntity extends IdEntity{

    private String companyId;


    @javax.persistence.Column(name = "company_id", length = 32)
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    private Integer address;


    @javax.persistence.Column(name = "address")
    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    private String driverName;


    @javax.persistence.Column(name = "driver_name", length = 64)
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    private String driverPhone;


    @javax.persistence.Column(name = "driver_phone", length = 32)
    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    private String driverGender;


    @javax.persistence.Column(name = "driver_gender", length = 2)
    public String getDriverGender() {
        return driverGender;
    }

    public void setDriverGender(String driverGender) {
        this.driverGender = driverGender;
    }

    private Integer driverBirthday;


    @javax.persistence.Column(name = "driver_birthday")
    public Integer getDriverBirthday() {
        return driverBirthday;
    }

    public void setDriverBirthday(Integer driverBirthday) {
        this.driverBirthday = driverBirthday;
    }

    private String driverNationality;


    @javax.persistence.Column(name = "driver_nationality", length = 32)
    public String getDriverNationality() {
        return driverNationality;
    }

    public void setDriverNationality(String driverNationality) {
        this.driverNationality = driverNationality;
    }

    private String driverNation;


    @javax.persistence.Column(name = "driver_nation", length = 32)
    public String getDriverNation() {
        return driverNation;
    }

    public void setDriverNation(String driverNation) {
        this.driverNation = driverNation;
    }

    private String driverMaritalStatus;


    @javax.persistence.Column(name = "driver_marital_status", length = 64)
    public String getDriverMaritalStatus() {
        return driverMaritalStatus;
    }

    public void setDriverMaritalStatus(String driverMaritalStatus) {
        this.driverMaritalStatus = driverMaritalStatus;
    }

    private String driverLanguageLevel;


    @javax.persistence.Column(name = "driver_language_level", length = 64)
    public String getDriverLanguageLevel() {
        return driverLanguageLevel;
    }

    public void setDriverLanguageLevel(String driverLanguageLevel) {
        this.driverLanguageLevel = driverLanguageLevel;
    }

    private String driverEducation;


    @javax.persistence.Column(name = "driver_education", length = 64)
    public String getDriverEducation() {
        return driverEducation;
    }

    public void setDriverEducation(String driverEducation) {
        this.driverEducation = driverEducation;
    }

    private String driverCensus;


    @javax.persistence.Column(name = "driver_census", length = 256)
    public String getDriverCensus() {
        return driverCensus;
    }

    public void setDriverCensus(String driverCensus) {
        this.driverCensus = driverCensus;
    }

    private String driverAddress;


    @javax.persistence.Column(name = "driver_address", length = 256)
    public String getDriverAddress() {
        return driverAddress;
    }

    public void setDriverAddress(String driverAddress) {
        this.driverAddress = driverAddress;
    }

    private String driverContactAddress;


    @javax.persistence.Column(name = "driver_contact_address", length = 256)
    public String getDriverContactAddress() {
        return driverContactAddress;
    }

    public void setDriverContactAddress(String driverContactAddress) {
        this.driverContactAddress = driverContactAddress;
    }

    private String photoId;


    @javax.persistence.Column(name = "photo_id", length = 128)
    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    private String licenseId;


    @javax.persistence.Column(name = "license_id", length = 32)
    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    private String licensePhotoId;


    @javax.persistence.Column(name = "license_photo_id", length = 128)
    public String getLicensePhotoId() {
        return licensePhotoId;
    }

    public void setLicensePhotoId(String licensePhotoId) {
        this.licensePhotoId = licensePhotoId;
    }

    private String driverType;


    @javax.persistence.Column(name = "driver_type", length = 16)
    public String getDriverType() {
        return driverType;
    }

    public void setDriverType(String driverType) {
        this.driverType = driverType;
    }

    private Integer getDriverLicenseDate;


    @javax.persistence.Column(name = "get_driver_license_date")
    public Integer getGetDriverLicenseDate() {
        return getDriverLicenseDate;
    }

    public void setGetDriverLicenseDate(Integer getDriverLicenseDate) {
        this.getDriverLicenseDate = getDriverLicenseDate;
    }

    private Integer driverLicenseOn;


    @javax.persistence.Column(name = "driver_license_on")
    public Integer getDriverLicenseOn() {
        return driverLicenseOn;
    }

    public void setDriverLicenseOn(Integer driverLicenseOn) {
        this.driverLicenseOn = driverLicenseOn;
    }

    private Integer driverLicenseOff;


    @javax.persistence.Column(name = "driver_license_off")
    public Integer getDriverLicenseOff() {
        return driverLicenseOff;
    }

    public void setDriverLicenseOff(Integer driverLicenseOff) {
        this.driverLicenseOff = driverLicenseOff;
    }

    private Integer taxiDriver;


    @javax.persistence.Column(name = "taxi_driver")
    public Integer getTaxiDriver() {
        return taxiDriver;
    }

    public void setTaxiDriver(Integer taxiDriver) {
        this.taxiDriver = taxiDriver;
    }

    private String certificateNo;


    @javax.persistence.Column(name = "certificate_no", length = 128)
    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    private String networkCarIssueOrganization;


    @javax.persistence.Column(name = "network_car_issue_organization", length = 256)
    public String getNetworkCarIssueOrganization() {
        return networkCarIssueOrganization;
    }

    public void setNetworkCarIssueOrganization(String networkCarIssueOrganization) {
        this.networkCarIssueOrganization = networkCarIssueOrganization;
    }

    private Integer networkCarIssueDate;


    @javax.persistence.Column(name = "network_car_issue_date")
    public Integer getNetworkCarIssueDate() {
        return networkCarIssueDate;
    }

    public void setNetworkCarIssueDate(Integer networkCarIssueDate) {
        this.networkCarIssueDate = networkCarIssueDate;
    }

    private Integer getNetworkCarProofDate;


    @javax.persistence.Column(name = "get_network_car_proof_date")
    public Integer getGetNetworkCarProofDate() {
        return getNetworkCarProofDate;
    }

    public void setGetNetworkCarProofDate(Integer getNetworkCarProofDate) {
        this.getNetworkCarProofDate = getNetworkCarProofDate;
    }

    private Integer networkCarProofOn;


    @javax.persistence.Column(name = "network_car_proof_on")
    public Integer getNetworkCarProofOn() {
        return networkCarProofOn;
    }

    public void setNetworkCarProofOn(Integer networkCarProofOn) {
        this.networkCarProofOn = networkCarProofOn;
    }

    private Integer networkCarProofOff;


    @javax.persistence.Column(name = "network_car_proof_off")
    public Integer getNetworkCarProofOff() {
        return networkCarProofOff;
    }

    public void setNetworkCarProofOff(Integer networkCarProofOff) {
        this.networkCarProofOff = networkCarProofOff;
    }

    private Integer registerDate;


    @javax.persistence.Column(name = "register_date")
    public Integer getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Integer registerDate) {
        this.registerDate = registerDate;
    }

    private Integer fullTimeDriver;


    @javax.persistence.Column(name = "fullTime_driver")
    public Integer getFullTimeDriver() {
        return fullTimeDriver;
    }

    public void setFullTimeDriver(Integer fullTimeDriver) {
        this.fullTimeDriver = fullTimeDriver;
    }

    private Integer inDriverBlacklist;


    @javax.persistence.Column(name = "in_driver_blacklist")
    public Integer getInDriverBlacklist() {
        return inDriverBlacklist;
    }

    public void setInDriverBlacklist(Integer inDriverBlacklist) {
        this.inDriverBlacklist = inDriverBlacklist;
    }

    private Integer commercialType;


    @javax.persistence.Column(name = "commercial_type")
    public Integer getCommercialType() {
        return commercialType;
    }

    public void setCommercialType(Integer commercialType) {
        this.commercialType = commercialType;
    }

    private String contractCompany;


    @javax.persistence.Column(name = "contract_company", length = 256)
    public String getContractCompany() {
        return contractCompany;
    }

    public void setContractCompany(String contractCompany) {
        this.contractCompany = contractCompany;
    }

    private Integer contractOn;


    @javax.persistence.Column(name = "contract_on")
    public Integer getContractOn() {
        return contractOn;
    }

    public void setContractOn(Integer contractOn) {
        this.contractOn = contractOn;
    }

    private Integer contractOff;


    @javax.persistence.Column(name = "contract_off")
    public Integer getContractOff() {
        return contractOff;
    }

    public void setContractOff(Integer contractOff) {
        this.contractOff = contractOff;
    }

    private String emergencyContact;


    @javax.persistence.Column(name = "emergency_contact", length = 64)
    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    private String emergencyContactPhone;


    @javax.persistence.Column(name = "emergency_contact_phone", length = 32)
    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    private String emergencyContactAddress;


    @javax.persistence.Column(name = "emergency_contact_address", length = 256)
    public String getEmergencyContactAddress() {
        return emergencyContactAddress;
    }

    public void setEmergencyContactAddress(String emergencyContactAddress) {
        this.emergencyContactAddress = emergencyContactAddress;
    }

    private Integer state;


    @javax.persistence.Column(name = "state")
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    private Integer flag;


    @javax.persistence.Column(name = "flag")
    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    private Long updateTime;


    @javax.persistence.Column(name = "update_time")
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

        DriverInfoEntity that = (DriverInfoEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (driverName != null ? !driverName.equals(that.driverName) : that.driverName != null) return false;
        if (driverPhone != null ? !driverPhone.equals(that.driverPhone) : that.driverPhone != null) return false;
        if (driverGender != null ? !driverGender.equals(that.driverGender) : that.driverGender != null) return false;
        if (driverBirthday != null ? !driverBirthday.equals(that.driverBirthday) : that.driverBirthday != null)
            return false;
        if (driverNationality != null ? !driverNationality.equals(that.driverNationality) : that.driverNationality != null)
            return false;
        if (driverNation != null ? !driverNation.equals(that.driverNation) : that.driverNation != null) return false;
        if (driverMaritalStatus != null ? !driverMaritalStatus.equals(that.driverMaritalStatus) : that.driverMaritalStatus != null)
            return false;
        if (driverLanguageLevel != null ? !driverLanguageLevel.equals(that.driverLanguageLevel) : that.driverLanguageLevel != null)
            return false;
        if (driverEducation != null ? !driverEducation.equals(that.driverEducation) : that.driverEducation != null)
            return false;
        if (driverCensus != null ? !driverCensus.equals(that.driverCensus) : that.driverCensus != null) return false;
        if (driverAddress != null ? !driverAddress.equals(that.driverAddress) : that.driverAddress != null)
            return false;
        if (driverContactAddress != null ? !driverContactAddress.equals(that.driverContactAddress) : that.driverContactAddress != null)
            return false;
        if (photoId != null ? !photoId.equals(that.photoId) : that.photoId != null) return false;
        if (licenseId != null ? !licenseId.equals(that.licenseId) : that.licenseId != null) return false;
        if (licensePhotoId != null ? !licensePhotoId.equals(that.licensePhotoId) : that.licensePhotoId != null)
            return false;
        if (driverType != null ? !driverType.equals(that.driverType) : that.driverType != null) return false;
        if (getDriverLicenseDate != null ? !getDriverLicenseDate.equals(that.getDriverLicenseDate) : that.getDriverLicenseDate != null)
            return false;
        if (driverLicenseOn != null ? !driverLicenseOn.equals(that.driverLicenseOn) : that.driverLicenseOn != null)
            return false;
        if (driverLicenseOff != null ? !driverLicenseOff.equals(that.driverLicenseOff) : that.driverLicenseOff != null)
            return false;
        if (taxiDriver != null ? !taxiDriver.equals(that.taxiDriver) : that.taxiDriver != null) return false;
        if (certificateNo != null ? !certificateNo.equals(that.certificateNo) : that.certificateNo != null)
            return false;
        if (networkCarIssueOrganization != null ? !networkCarIssueOrganization.equals(that.networkCarIssueOrganization) : that.networkCarIssueOrganization != null)
            return false;
        if (networkCarIssueDate != null ? !networkCarIssueDate.equals(that.networkCarIssueDate) : that.networkCarIssueDate != null)
            return false;
        if (getNetworkCarProofDate != null ? !getNetworkCarProofDate.equals(that.getNetworkCarProofDate) : that.getNetworkCarProofDate != null)
            return false;
        if (networkCarProofOn != null ? !networkCarProofOn.equals(that.networkCarProofOn) : that.networkCarProofOn != null)
            return false;
        if (networkCarProofOff != null ? !networkCarProofOff.equals(that.networkCarProofOff) : that.networkCarProofOff != null)
            return false;
        if (registerDate != null ? !registerDate.equals(that.registerDate) : that.registerDate != null) return false;
        if (fullTimeDriver != null ? !fullTimeDriver.equals(that.fullTimeDriver) : that.fullTimeDriver != null)
            return false;
        if (inDriverBlacklist != null ? !inDriverBlacklist.equals(that.inDriverBlacklist) : that.inDriverBlacklist != null)
            return false;
        if (commercialType != null ? !commercialType.equals(that.commercialType) : that.commercialType != null)
            return false;
        if (contractCompany != null ? !contractCompany.equals(that.contractCompany) : that.contractCompany != null)
            return false;
        if (contractOn != null ? !contractOn.equals(that.contractOn) : that.contractOn != null) return false;
        if (contractOff != null ? !contractOff.equals(that.contractOff) : that.contractOff != null) return false;
        if (emergencyContact != null ? !emergencyContact.equals(that.emergencyContact) : that.emergencyContact != null)
            return false;
        if (emergencyContactPhone != null ? !emergencyContactPhone.equals(that.emergencyContactPhone) : that.emergencyContactPhone != null)
            return false;
        if (emergencyContactAddress != null ? !emergencyContactAddress.equals(that.emergencyContactAddress) : that.emergencyContactAddress != null)
            return false;
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
        result = 31 * result + (driverName != null ? driverName.hashCode() : 0);
        result = 31 * result + (driverPhone != null ? driverPhone.hashCode() : 0);
        result = 31 * result + (driverGender != null ? driverGender.hashCode() : 0);
        result = 31 * result + (driverBirthday != null ? driverBirthday.hashCode() : 0);
        result = 31 * result + (driverNationality != null ? driverNationality.hashCode() : 0);
        result = 31 * result + (driverNation != null ? driverNation.hashCode() : 0);
        result = 31 * result + (driverMaritalStatus != null ? driverMaritalStatus.hashCode() : 0);
        result = 31 * result + (driverLanguageLevel != null ? driverLanguageLevel.hashCode() : 0);
        result = 31 * result + (driverEducation != null ? driverEducation.hashCode() : 0);
        result = 31 * result + (driverCensus != null ? driverCensus.hashCode() : 0);
        result = 31 * result + (driverAddress != null ? driverAddress.hashCode() : 0);
        result = 31 * result + (driverContactAddress != null ? driverContactAddress.hashCode() : 0);
        result = 31 * result + (photoId != null ? photoId.hashCode() : 0);
        result = 31 * result + (licenseId != null ? licenseId.hashCode() : 0);
        result = 31 * result + (licensePhotoId != null ? licensePhotoId.hashCode() : 0);
        result = 31 * result + (driverType != null ? driverType.hashCode() : 0);
        result = 31 * result + (getDriverLicenseDate != null ? getDriverLicenseDate.hashCode() : 0);
        result = 31 * result + (driverLicenseOn != null ? driverLicenseOn.hashCode() : 0);
        result = 31 * result + (driverLicenseOff != null ? driverLicenseOff.hashCode() : 0);
        result = 31 * result + (taxiDriver != null ? taxiDriver.hashCode() : 0);
        result = 31 * result + (certificateNo != null ? certificateNo.hashCode() : 0);
        result = 31 * result + (networkCarIssueOrganization != null ? networkCarIssueOrganization.hashCode() : 0);
        result = 31 * result + (networkCarIssueDate != null ? networkCarIssueDate.hashCode() : 0);
        result = 31 * result + (getNetworkCarProofDate != null ? getNetworkCarProofDate.hashCode() : 0);
        result = 31 * result + (networkCarProofOn != null ? networkCarProofOn.hashCode() : 0);
        result = 31 * result + (networkCarProofOff != null ? networkCarProofOff.hashCode() : 0);
        result = 31 * result + (registerDate != null ? registerDate.hashCode() : 0);
        result = 31 * result + (fullTimeDriver != null ? fullTimeDriver.hashCode() : 0);
        result = 31 * result + (inDriverBlacklist != null ? inDriverBlacklist.hashCode() : 0);
        result = 31 * result + (commercialType != null ? commercialType.hashCode() : 0);
        result = 31 * result + (contractCompany != null ? contractCompany.hashCode() : 0);
        result = 31 * result + (contractOn != null ? contractOn.hashCode() : 0);
        result = 31 * result + (contractOff != null ? contractOff.hashCode() : 0);
        result = 31 * result + (emergencyContact != null ? emergencyContact.hashCode() : 0);
        result = 31 * result + (emergencyContactPhone != null ? emergencyContactPhone.hashCode() : 0);
        result = 31 * result + (emergencyContactAddress != null ? emergencyContactAddress.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}

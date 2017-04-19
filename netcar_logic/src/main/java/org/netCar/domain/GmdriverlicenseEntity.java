package org.netCar.domain;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "gmdriverlicense")
public class GmdriverlicenseEntity {
    private int id;

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Integer address;


    @Column(name = "address")
    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    private String driverName;


    @Column(name = "driverName", length = 64)
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    private Integer driverGender;


    @Column(name = "driverGender")
    public Integer getDriverGender() {
        return driverGender;
    }

    public void setDriverGender(Integer driverGender) {
        this.driverGender = driverGender;
    }

    private Integer documentType;


    @Column(name = "documentType")
    public Integer getDocumentType() {
        return documentType;
    }

    public void setDocumentType(Integer documentType) {
        this.documentType = documentType;
    }

    private String idNumber;


    @Column(name = "idNumber", length = 32)
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    private String nation;


    @Column(name = "nation", length = 32)
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    private String driverPhone;


    @Column(name = "driverPhone", length = 32)
    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    private String driverAddress;


    @Column(name = "driverAddress", length = 256)
    public String getDriverAddress() {
        return driverAddress;
    }

    public void setDriverAddress(String driverAddress) {
        this.driverAddress = driverAddress;
    }

    private String driverEducation;


    @Column(name = "driverEducation", length = 64)
    public String getDriverEducation() {
        return driverEducation;
    }

    public void setDriverEducation(String driverEducation) {
        this.driverEducation = driverEducation;
    }

    private String technicalTitle;


    @Column(name = "technicalTitle", length = 32)
    public String getTechnicalTitle() {
        return technicalTitle;
    }

    public void setTechnicalTitle(String technicalTitle) {
        this.technicalTitle = technicalTitle;
    }

    private String employeeStatus;


    @Column(name = "employeeStatus", length = 32)
    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    private String householdRegistration;


    @Column(name = "householdRegistration", length = 32)
    public String getHouseholdRegistration() {
        return householdRegistration;
    }

    public void setHouseholdRegistration(String householdRegistration) {
        this.householdRegistration = householdRegistration;
    }

    private String certificateNo;


    @Column(name = "certificateNo", length = 128)
    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    private Integer driverBirthday;


    @Column(name = "driverBirthday")
    public Integer getDriverBirthday() {
        return driverBirthday;
    }

    public void setDriverBirthday(Integer driverBirthday) {
        this.driverBirthday = driverBirthday;
    }

    private Date getDriverLicenseDate;


    @Column(name = "getDriverLicenseDate")
    public Date getGetDriverLicenseDate() {
        return getDriverLicenseDate;
    }

    public void setGetDriverLicenseDate(Date getDriverLicenseDate) {
        this.getDriverLicenseDate = getDriverLicenseDate;
    }

    private Integer networkCarIssueDate;


    @Column(name = "networkCarIssueDate")
    public Integer getNetworkCarIssueDate() {
        return networkCarIssueDate;
    }

    public void setNetworkCarIssueDate(Integer networkCarIssueDate) {
        this.networkCarIssueDate = networkCarIssueDate;
    }

    private Integer networkCarProofOn;


    @Column(name = "networkCarProofOn")
    public Integer getNetworkCarProofOn() {
        return networkCarProofOn;
    }

    public void setNetworkCarProofOn(Integer networkCarProofOn) {
        this.networkCarProofOn = networkCarProofOn;
    }

    private Integer networkCarProofOff;


    @Column(name = "networkCarProofOff")
    public Integer getNetworkCarProofOff() {
        return networkCarProofOff;
    }

    public void setNetworkCarProofOff(Integer networkCarProofOff) {
        this.networkCarProofOff = networkCarProofOff;
    }

    private String networkCarIssueOrganization;


    @Column(name = "networkCarIssueOrganization", length = 256)
    public String getNetworkCarIssueOrganization() {
        return networkCarIssueOrganization;
    }

    public void setNetworkCarIssueOrganization(String networkCarIssueOrganization) {
        this.networkCarIssueOrganization = networkCarIssueOrganization;
    }

    private String networkCarIssueOrganizationCode;


    @Column(name = "networkCarIssueOrganizationCode", length = 32)
    public String getNetworkCarIssueOrganizationCode() {
        return networkCarIssueOrganizationCode;
    }

    public void setNetworkCarIssueOrganizationCode(String networkCarIssueOrganizationCode) {
        this.networkCarIssueOrganizationCode = networkCarIssueOrganizationCode;
    }

    private String adhereAddress;


    @Column(name = "adhereAddress", length = 32)
    public String getAdhereAddress() {
        return adhereAddress;
    }

    public void setAdhereAddress(String adhereAddress) {
        this.adhereAddress = adhereAddress;
    }

    private String cardType;


    @Column(name = "cardType", length = 32)
    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    private String icCard;


    @Column(name = "icCard", length = 32)
    public String getIcCard() {
        return icCard;
    }

    public void setIcCard(String icCard) {
        this.icCard = icCard;
    }

    private String licenseId;


    @Column(name = "licenseId", length = 32)
    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    private String emergencyContact;


    @Column(name = "emergencyContact", length = 64)
    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    private String emergencyContactPhone;


    @Column(name = "emergencyContactPhone", length = 32)
    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    private String emergencyContactAddress;


    @Column(name = "emergencyContactAddress", length = 256)
    public String getEmergencyContactAddress() {
        return emergencyContactAddress;
    }

    public void setEmergencyContactAddress(String emergencyContactAddress) {
        this.emergencyContactAddress = emergencyContactAddress;
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


    @Column(name = "updateTime")
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

        GmdriverlicenseEntity that = (GmdriverlicenseEntity) o;

        if (id != that.id) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (driverName != null ? !driverName.equals(that.driverName) : that.driverName != null) return false;
        if (driverGender != null ? !driverGender.equals(that.driverGender) : that.driverGender != null) return false;
        if (documentType != null ? !documentType.equals(that.documentType) : that.documentType != null) return false;
        if (idNumber != null ? !idNumber.equals(that.idNumber) : that.idNumber != null) return false;
        if (nation != null ? !nation.equals(that.nation) : that.nation != null) return false;
        if (driverPhone != null ? !driverPhone.equals(that.driverPhone) : that.driverPhone != null) return false;
        if (driverAddress != null ? !driverAddress.equals(that.driverAddress) : that.driverAddress != null)
            return false;
        if (driverEducation != null ? !driverEducation.equals(that.driverEducation) : that.driverEducation != null)
            return false;
        if (technicalTitle != null ? !technicalTitle.equals(that.technicalTitle) : that.technicalTitle != null)
            return false;
        if (employeeStatus != null ? !employeeStatus.equals(that.employeeStatus) : that.employeeStatus != null)
            return false;
        if (householdRegistration != null ? !householdRegistration.equals(that.householdRegistration) : that.householdRegistration != null)
            return false;
        if (certificateNo != null ? !certificateNo.equals(that.certificateNo) : that.certificateNo != null)
            return false;
        if (driverBirthday != null ? !driverBirthday.equals(that.driverBirthday) : that.driverBirthday != null)
            return false;
        if (getDriverLicenseDate != null ? !getDriverLicenseDate.equals(that.getDriverLicenseDate) : that.getDriverLicenseDate != null)
            return false;
        if (networkCarIssueDate != null ? !networkCarIssueDate.equals(that.networkCarIssueDate) : that.networkCarIssueDate != null)
            return false;
        if (networkCarProofOn != null ? !networkCarProofOn.equals(that.networkCarProofOn) : that.networkCarProofOn != null)
            return false;
        if (networkCarProofOff != null ? !networkCarProofOff.equals(that.networkCarProofOff) : that.networkCarProofOff != null)
            return false;
        if (networkCarIssueOrganization != null ? !networkCarIssueOrganization.equals(that.networkCarIssueOrganization) : that.networkCarIssueOrganization != null)
            return false;
        if (networkCarIssueOrganizationCode != null ? !networkCarIssueOrganizationCode.equals(that.networkCarIssueOrganizationCode) : that.networkCarIssueOrganizationCode != null)
            return false;
        if (adhereAddress != null ? !adhereAddress.equals(that.adhereAddress) : that.adhereAddress != null)
            return false;
        if (cardType != null ? !cardType.equals(that.cardType) : that.cardType != null) return false;
        if (icCard != null ? !icCard.equals(that.icCard) : that.icCard != null) return false;
        if (licenseId != null ? !licenseId.equals(that.licenseId) : that.licenseId != null) return false;
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
        int result = id;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (driverName != null ? driverName.hashCode() : 0);
        result = 31 * result + (driverGender != null ? driverGender.hashCode() : 0);
        result = 31 * result + (documentType != null ? documentType.hashCode() : 0);
        result = 31 * result + (idNumber != null ? idNumber.hashCode() : 0);
        result = 31 * result + (nation != null ? nation.hashCode() : 0);
        result = 31 * result + (driverPhone != null ? driverPhone.hashCode() : 0);
        result = 31 * result + (driverAddress != null ? driverAddress.hashCode() : 0);
        result = 31 * result + (driverEducation != null ? driverEducation.hashCode() : 0);
        result = 31 * result + (technicalTitle != null ? technicalTitle.hashCode() : 0);
        result = 31 * result + (employeeStatus != null ? employeeStatus.hashCode() : 0);
        result = 31 * result + (householdRegistration != null ? householdRegistration.hashCode() : 0);
        result = 31 * result + (certificateNo != null ? certificateNo.hashCode() : 0);
        result = 31 * result + (driverBirthday != null ? driverBirthday.hashCode() : 0);
        result = 31 * result + (getDriverLicenseDate != null ? getDriverLicenseDate.hashCode() : 0);
        result = 31 * result + (networkCarIssueDate != null ? networkCarIssueDate.hashCode() : 0);
        result = 31 * result + (networkCarProofOn != null ? networkCarProofOn.hashCode() : 0);
        result = 31 * result + (networkCarProofOff != null ? networkCarProofOff.hashCode() : 0);
        result = 31 * result + (networkCarIssueOrganization != null ? networkCarIssueOrganization.hashCode() : 0);
        result = 31 * result + (networkCarIssueOrganizationCode != null ? networkCarIssueOrganizationCode.hashCode() : 0);
        result = 31 * result + (adhereAddress != null ? adhereAddress.hashCode() : 0);
        result = 31 * result + (cardType != null ? cardType.hashCode() : 0);
        result = 31 * result + (icCard != null ? icCard.hashCode() : 0);
        result = 31 * result + (licenseId != null ? licenseId.hashCode() : 0);
        result = 31 * result + (emergencyContact != null ? emergencyContact.hashCode() : 0);
        result = 31 * result + (emergencyContactPhone != null ? emergencyContactPhone.hashCode() : 0);
        result = 31 * result + (emergencyContactAddress != null ? emergencyContactAddress.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}

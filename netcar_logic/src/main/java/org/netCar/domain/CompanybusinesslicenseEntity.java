package org.netCar.domain;

import javax.persistence.*;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "companybusinesslicense")
public class CompanyBusinessLicenseEntity extends  IdEntity {
    private String companyId;
    private Integer address;
    private String certificate;
    private String operationArea;
    private String ownerName;
    private String organization;
    private Integer startDate;
    private Integer stopDate;
    private Integer certifyDate;
    private String state;
    private Integer flag;
    private Long updateTime;



    @Column(name = "companyId", length = 32)
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }


    @Column(name = "address")
    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }


    @Column(name = "certificate", length = 64)
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }


    @Column(name = "operationArea", length = 128)
    public String getOperationArea() {
        return operationArea;
    }

    public void setOperationArea(String operationArea) {
        this.operationArea = operationArea;
    }


    @Column(name = "ownerName", length = 256)
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


    @Column(name = "organization", length = 256)
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }


    @Column(name = "startDate")
    public Integer getStartDate() {
        return startDate;
    }

    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }


    @Column(name = "stopDate")
    public Integer getStopDate() {
        return stopDate;
    }

    public void setStopDate(Integer stopDate) {
        this.stopDate = stopDate;
    }


    @Column(name = "certifyDate")
    public Integer getCertifyDate() {
        return certifyDate;
    }

    public void setCertifyDate(Integer certifyDate) {
        this.certifyDate = certifyDate;
    }


    @Column(name = "state", length = 8)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    @Column(name = "flag")
    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }


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

        CompanyBusinessLicenseEntity that = (CompanyBusinessLicenseEntity) o;

        if (id != that.id) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (certificate != null ? !certificate.equals(that.certificate) : that.certificate != null) return false;
        if (operationArea != null ? !operationArea.equals(that.operationArea) : that.operationArea != null)
            return false;
        if (ownerName != null ? !ownerName.equals(that.ownerName) : that.ownerName != null) return false;
        if (organization != null ? !organization.equals(that.organization) : that.organization != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (stopDate != null ? !stopDate.equals(that.stopDate) : that.stopDate != null) return false;
        if (certifyDate != null ? !certifyDate.equals(that.certifyDate) : that.certifyDate != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (certificate != null ? certificate.hashCode() : 0);
        result = 31 * result + (operationArea != null ? operationArea.hashCode() : 0);
        result = 31 * result + (ownerName != null ? ownerName.hashCode() : 0);
        result = 31 * result + (organization != null ? organization.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (stopDate != null ? stopDate.hashCode() : 0);
        result = 31 * result + (certifyDate != null ? certifyDate.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}

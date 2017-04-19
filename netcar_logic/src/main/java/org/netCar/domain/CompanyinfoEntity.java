package org.netCar.domain;

import javax.persistence.*;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "companyinfo")
public class CompanyinfoEntity {
    private int id;
    private String companyId;
    private String companyName;
    private String identifier;
    private Integer address;
    private String businessScope;
    private String contactAddress;
    private String economicType;
    private String regCapital;
    private String legalName;
    private String legalId;
    private String legalPhone;
    private String legalPhoto;
    private Integer state;
    private Integer flag;
    private Long updateTime;

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


    @Column(name = "companyId", length = 32)
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }


    @Column(name = "companyName", length = 256)
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    @Column(name = "identifier", length = 32)
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }


    @Column(name = "address")
    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }


    @Column(name = "businessScope", length = 256)
    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }


    @Column(name = "contactAddress", length = 256)
    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }


    @Column(name = "economicType", length = 128)
    public String getEconomicType() {
        return economicType;
    }

    public void setEconomicType(String economicType) {
        this.economicType = economicType;
    }


    @Column(name = "regCapital", length = 128)
    public String getRegCapital() {
        return regCapital;
    }

    public void setRegCapital(String regCapital) {
        this.regCapital = regCapital;
    }


    @Column(name = "legalName", length = 256)
    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }


    @Column(name = "legalID", length = 32)
    public String getLegalId() {
        return legalId;
    }

    public void setLegalId(String legalId) {
        this.legalId = legalId;
    }


    @Column(name = "legalPhone", length = 32)
    public String getLegalPhone() {
        return legalPhone;
    }

    public void setLegalPhone(String legalPhone) {
        this.legalPhone = legalPhone;
    }


    @Column(name = "legalPhoto", length = 128)
    public String getLegalPhoto() {
        return legalPhoto;
    }

    public void setLegalPhoto(String legalPhoto) {
        this.legalPhoto = legalPhoto;
    }


    @Column(name = "state")
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
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

        CompanyinfoEntity that = (CompanyinfoEntity) o;

        if (id != that.id) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (companyName != null ? !companyName.equals(that.companyName) : that.companyName != null) return false;
        if (identifier != null ? !identifier.equals(that.identifier) : that.identifier != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (businessScope != null ? !businessScope.equals(that.businessScope) : that.businessScope != null)
            return false;
        if (contactAddress != null ? !contactAddress.equals(that.contactAddress) : that.contactAddress != null)
            return false;
        if (economicType != null ? !economicType.equals(that.economicType) : that.economicType != null) return false;
        if (regCapital != null ? !regCapital.equals(that.regCapital) : that.regCapital != null) return false;
        if (legalName != null ? !legalName.equals(that.legalName) : that.legalName != null) return false;
        if (legalId != null ? !legalId.equals(that.legalId) : that.legalId != null) return false;
        if (legalPhone != null ? !legalPhone.equals(that.legalPhone) : that.legalPhone != null) return false;
        if (legalPhoto != null ? !legalPhoto.equals(that.legalPhoto) : that.legalPhoto != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (identifier != null ? identifier.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (businessScope != null ? businessScope.hashCode() : 0);
        result = 31 * result + (contactAddress != null ? contactAddress.hashCode() : 0);
        result = 31 * result + (economicType != null ? economicType.hashCode() : 0);
        result = 31 * result + (regCapital != null ? regCapital.hashCode() : 0);
        result = 31 * result + (legalName != null ? legalName.hashCode() : 0);
        result = 31 * result + (legalId != null ? legalId.hashCode() : 0);
        result = 31 * result + (legalPhone != null ? legalPhone.hashCode() : 0);
        result = 31 * result + (legalPhoto != null ? legalPhoto.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}

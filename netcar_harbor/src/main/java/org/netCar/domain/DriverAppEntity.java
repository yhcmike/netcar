package org.netCar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by ffd on 2017/4/19.
 */
@Entity
@Table(name = "driver_app")
public class DriverAppEntity extends IdEntity{
    private String companyId;
    private Integer address;
    private String licenseId;
    private String driverPhone;
    private Integer netType;
    private String appVersion;
    private Integer mapType;
    private Integer state;
    private Integer flag;
    private Long updateTime;




    @Column(name = "company_id", length = 32)
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


    @Column(name = "license_id", length = 32)
    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }


    @Column(name = "driver_phone", length = 32)
    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }


    @Column(name = "net_type")
    public Integer getNetType() {
        return netType;
    }

    public void setNetType(Integer netType) {
        this.netType = netType;
    }


    @Column(name = "app_version", length = 32)
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }


    @Column(name = "map_type")
    public Integer getMapType() {
        return mapType;
    }

    public void setMapType(Integer mapType) {
        this.mapType = mapType;
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

        DriverAppEntity that = (DriverAppEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (licenseId != null ? !licenseId.equals(that.licenseId) : that.licenseId != null) return false;
        if (driverPhone != null ? !driverPhone.equals(that.driverPhone) : that.driverPhone != null) return false;
        if (netType != null ? !netType.equals(that.netType) : that.netType != null) return false;
        if (appVersion != null ? !appVersion.equals(that.appVersion) : that.appVersion != null) return false;
        if (mapType != null ? !mapType.equals(that.mapType) : that.mapType != null) return false;
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
        result = 31 * result + (licenseId != null ? licenseId.hashCode() : 0);
        result = 31 * result + (driverPhone != null ? driverPhone.hashCode() : 0);
        result = 31 * result + (netType != null ? netType.hashCode() : 0);
        result = 31 * result + (appVersion != null ? appVersion.hashCode() : 0);
        result = 31 * result + (mapType != null ? mapType.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}

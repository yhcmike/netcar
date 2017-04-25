package org.netCar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by lyq on 2017/4/19.
 * 车辆经营上下线
 */
@Entity
@Table(name = "operate_log_in_out")
public class OperateLogInOutEntity  extends IdEntity{
    private String companyId;
    private String licenseId;
    private String vehicleNo;
    private Long loginTime;
    private Integer inLongitude;
    private Integer inLatitude;
    private Integer inEncrypt;
    private Long logoutTime;
    private Integer outLongitude;
    private Integer outLatitude;
    private Integer outEncrypt;




    @Column(name = "company_id", length = 32)
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }


    @Column(name = "license_id", length = 32)
    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }


    @Column(name = "vehicle_no", length = 32)
    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }


    @Column(name = "login_time")
    public Long getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Long loginTime) {
        this.loginTime = loginTime;
    }


    @Column(name = "in_longitude")
    public Integer getInLongitude() {
        return inLongitude;
    }

    public void setInLongitude(Integer inLongitude) {
        this.inLongitude = inLongitude;
    }


    @Column(name = "in_latitude")
    public Integer getInLatitude() {
        return inLatitude;
    }

    public void setInLatitude(Integer inLatitude) {
        this.inLatitude = inLatitude;
    }


    @Column(name = "in_encrypt")
    public Integer getInEncrypt() {
        return inEncrypt;
    }

    public void setInEncrypt(Integer inEncrypt) {
        this.inEncrypt = inEncrypt;
    }


    @Column(name = "logout_time")
    public Long getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Long logoutTime) {
        this.logoutTime = logoutTime;
    }


    @Column(name = "out_longitude")
    public Integer getOutLongitude() {
        return outLongitude;
    }

    public void setOutLongitude(Integer outLongitude) {
        this.outLongitude = outLongitude;
    }


    @Column(name = "out_latitude")
    public Integer getOutLatitude() {
        return outLatitude;
    }

    public void setOutLatitude(Integer outLatitude) {
        this.outLatitude = outLatitude;
    }


    @Column(name = "out_encrypt")
    public Integer getOutEncrypt() {
        return outEncrypt;
    }

    public void setOutEncrypt(Integer outEncrypt) {
        this.outEncrypt = outEncrypt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OperateLogInOutEntity that = (OperateLogInOutEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (licenseId != null ? !licenseId.equals(that.licenseId) : that.licenseId != null) return false;
        if (vehicleNo != null ? !vehicleNo.equals(that.vehicleNo) : that.vehicleNo != null) return false;
        if (loginTime != null ? !loginTime.equals(that.loginTime) : that.loginTime != null) return false;
        if (inLongitude != null ? !inLongitude.equals(that.inLongitude) : that.inLongitude != null) return false;
        if (inLatitude != null ? !inLatitude.equals(that.inLatitude) : that.inLatitude != null) return false;
        if (inEncrypt != null ? !inEncrypt.equals(that.inEncrypt) : that.inEncrypt != null) return false;
        if (logoutTime != null ? !logoutTime.equals(that.logoutTime) : that.logoutTime != null) return false;
        if (outLongitude != null ? !outLongitude.equals(that.outLongitude) : that.outLongitude != null) return false;
        if (outLatitude != null ? !outLatitude.equals(that.outLatitude) : that.outLatitude != null) return false;
        if (outEncrypt != null ? !outEncrypt.equals(that.outEncrypt) : that.outEncrypt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (licenseId != null ? licenseId.hashCode() : 0);
        result = 31 * result + (vehicleNo != null ? vehicleNo.hashCode() : 0);
        result = 31 * result + (loginTime != null ? loginTime.hashCode() : 0);
        result = 31 * result + (inLongitude != null ? inLongitude.hashCode() : 0);
        result = 31 * result + (inLatitude != null ? inLatitude.hashCode() : 0);
        result = 31 * result + (inEncrypt != null ? inEncrypt.hashCode() : 0);
        result = 31 * result + (logoutTime != null ? logoutTime.hashCode() : 0);
        result = 31 * result + (outLongitude != null ? outLongitude.hashCode() : 0);
        result = 31 * result + (outLatitude != null ? outLatitude.hashCode() : 0);
        result = 31 * result + (outEncrypt != null ? outEncrypt.hashCode() : 0);
        return result;
    }
}

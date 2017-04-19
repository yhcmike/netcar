package org.netCar.domain;

import javax.persistence.*;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "operateloginout")
public class OperateloginoutEntity {
    private int id;

    public void setId(Integer id) {
        this.id = id;
    }

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


    @Column(name = "licenseId", length = 32)
    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }


    @Column(name = "vehicleNo", length = 32)
    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }


    @Column(name = "loginTime")
    public Long getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Long loginTime) {
        this.loginTime = loginTime;
    }


    @Column(name = "inLongitude")
    public Integer getInLongitude() {
        return inLongitude;
    }

    public void setInLongitude(Integer inLongitude) {
        this.inLongitude = inLongitude;
    }


    @Column(name = "inLatitude")
    public Integer getInLatitude() {
        return inLatitude;
    }

    public void setInLatitude(Integer inLatitude) {
        this.inLatitude = inLatitude;
    }


    @Column(name = "inEncrypt")
    public Integer getInEncrypt() {
        return inEncrypt;
    }

    public void setInEncrypt(Integer inEncrypt) {
        this.inEncrypt = inEncrypt;
    }


    @Column(name = "logoutTime")
    public Long getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Long logoutTime) {
        this.logoutTime = logoutTime;
    }


    @Column(name = "outLongitude")
    public Integer getOutLongitude() {
        return outLongitude;
    }

    public void setOutLongitude(Integer outLongitude) {
        this.outLongitude = outLongitude;
    }


    @Column(name = "outLatitude")
    public Integer getOutLatitude() {
        return outLatitude;
    }

    public void setOutLatitude(Integer outLatitude) {
        this.outLatitude = outLatitude;
    }


    @Column(name = "outEncrypt")
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

        OperateloginoutEntity that = (OperateloginoutEntity) o;

        if (id != that.id) return false;
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
        int result = id;
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

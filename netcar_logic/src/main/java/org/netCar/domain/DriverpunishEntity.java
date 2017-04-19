package org.netCar.domain;

import javax.persistence.*;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "driverpunish")
public class DriverpunishEntity {
    private int id;

    public void setId(Integer id) {
        this.id = id;
    }

    private String companyId;
    private String licenseId;
    private Long punishTime;
    private String punishReason;
    private String punishResult;

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


    @Column(name = "punishTime")
    public Long getPunishTime() {
        return punishTime;
    }

    public void setPunishTime(Long punishTime) {
        this.punishTime = punishTime;
    }


    @Column(name = "punishReason", length = 128)
    public String getPunishReason() {
        return punishReason;
    }

    public void setPunishReason(String punishReason) {
        this.punishReason = punishReason;
    }


    @Column(name = "punishResult", length = 128)
    public String getPunishResult() {
        return punishResult;
    }

    public void setPunishResult(String punishResult) {
        this.punishResult = punishResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriverpunishEntity that = (DriverpunishEntity) o;

        if (id != that.id) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (licenseId != null ? !licenseId.equals(that.licenseId) : that.licenseId != null) return false;
        if (punishTime != null ? !punishTime.equals(that.punishTime) : that.punishTime != null) return false;
        if (punishReason != null ? !punishReason.equals(that.punishReason) : that.punishReason != null) return false;
        if (punishResult != null ? !punishResult.equals(that.punishResult) : that.punishResult != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (licenseId != null ? licenseId.hashCode() : 0);
        result = 31 * result + (punishTime != null ? punishTime.hashCode() : 0);
        result = 31 * result + (punishReason != null ? punishReason.hashCode() : 0);
        result = 31 * result + (punishResult != null ? punishResult.hashCode() : 0);
        return result;
    }
}

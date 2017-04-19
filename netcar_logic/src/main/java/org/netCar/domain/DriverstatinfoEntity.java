package org.netCar.domain;

import javax.persistence.*;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "driverstatinfo")
public class DriverstatinfoEntity  extends  IdEntity{

    private String companyId;
    private Integer address;
    private String licenseId;
    private Integer cycle;
    private String orderCount;
    private String trafficViolationCount;
    private String complainedCount;
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


    @Column(name = "licenseId", length = 32)
    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }


    @Column(name = "cycle")
    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }


    @Column(name = "orderCount", length = 10)
    public String getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(String orderCount) {
        this.orderCount = orderCount;
    }


    @Column(name = "trafficViolationCount", length = 32)
    public String getTrafficViolationCount() {
        return trafficViolationCount;
    }

    public void setTrafficViolationCount(String trafficViolationCount) {
        this.trafficViolationCount = trafficViolationCount;
    }


    @Column(name = "complainedCount", length = 32)
    public String getComplainedCount() {
        return complainedCount;
    }

    public void setComplainedCount(String complainedCount) {
        this.complainedCount = complainedCount;
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

        DriverstatinfoEntity that = (DriverstatinfoEntity) o;

        if (id != that.id) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (licenseId != null ? !licenseId.equals(that.licenseId) : that.licenseId != null) return false;
        if (cycle != null ? !cycle.equals(that.cycle) : that.cycle != null) return false;
        if (orderCount != null ? !orderCount.equals(that.orderCount) : that.orderCount != null) return false;
        if (trafficViolationCount != null ? !trafficViolationCount.equals(that.trafficViolationCount) : that.trafficViolationCount != null)
            return false;
        if (complainedCount != null ? !complainedCount.equals(that.complainedCount) : that.complainedCount != null)
            return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (licenseId != null ? licenseId.hashCode() : 0);
        result = 31 * result + (cycle != null ? cycle.hashCode() : 0);
        result = 31 * result + (orderCount != null ? orderCount.hashCode() : 0);
        result = 31 * result + (trafficViolationCount != null ? trafficViolationCount.hashCode() : 0);
        result = 31 * result + (complainedCount != null ? complainedCount.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}

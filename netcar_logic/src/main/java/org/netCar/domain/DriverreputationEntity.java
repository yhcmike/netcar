package org.netCar.domain;

import javax.persistence.*;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "driverreputation")
public class DriverreputationEntity  extends  IdEntity{

    private String companyId;
    private String licenseId;
    private Integer level;
    private Integer testDate;
    private String testDepartment;


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


    @Column(name = "level")
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }


    @Column(name = "testDate")
    public Integer getTestDate() {
        return testDate;
    }

    public void setTestDate(Integer testDate) {
        this.testDate = testDate;
    }


    @Column(name = "testDepartment", length = 128)
    public String getTestDepartment() {
        return testDepartment;
    }

    public void setTestDepartment(String testDepartment) {
        this.testDepartment = testDepartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriverreputationEntity that = (DriverreputationEntity) o;

        if (id != that.id) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (licenseId != null ? !licenseId.equals(that.licenseId) : that.licenseId != null) return false;
        if (level != null ? !level.equals(that.level) : that.level != null) return false;
        if (testDate != null ? !testDate.equals(that.testDate) : that.testDate != null) return false;
        if (testDepartment != null ? !testDepartment.equals(that.testDepartment) : that.testDepartment != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (licenseId != null ? licenseId.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (testDate != null ? testDate.hashCode() : 0);
        result = 31 * result + (testDepartment != null ? testDepartment.hashCode() : 0);
        return result;
    }
}

package org.netCar.domain;

import javax.persistence.*;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "drivertraininfo")
public class DrivertraininfoEntity {
    private int id;

    public void setId(Integer id) {
        this.id = id;
    }

    private String companyId;
    private Integer address;
    private String licenseId;
    private String courseName;
    private Integer courseDate;
    private String startTime;
    private String stopTime;
    private String duration;
    private Integer flag;
    private Long updateTime;

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


    @Column(name = "courseName", length = 64)
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    @Column(name = "courseDate")
    public Integer getCourseDate() {
        return courseDate;
    }

    public void setCourseDate(Integer courseDate) {
        this.courseDate = courseDate;
    }


    @Column(name = "startTime", length = 8)
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    @Column(name = "stopTime", length = 8)
    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }


    @Column(name = "duration", length = 10)
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
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

        DrivertraininfoEntity that = (DrivertraininfoEntity) o;

        if (id != that.id) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (licenseId != null ? !licenseId.equals(that.licenseId) : that.licenseId != null) return false;
        if (courseName != null ? !courseName.equals(that.courseName) : that.courseName != null) return false;
        if (courseDate != null ? !courseDate.equals(that.courseDate) : that.courseDate != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (stopTime != null ? !stopTime.equals(that.stopTime) : that.stopTime != null) return false;
        if (duration != null ? !duration.equals(that.duration) : that.duration != null) return false;
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
        result = 31 * result + (courseName != null ? courseName.hashCode() : 0);
        result = 31 * result + (courseDate != null ? courseDate.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (stopTime != null ? stopTime.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}

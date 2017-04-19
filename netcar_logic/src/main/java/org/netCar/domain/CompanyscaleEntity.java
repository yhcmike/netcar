package org.netCar.domain;

import javax.persistence.*;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "companyscale")
public class CompanyscaleEntity {
    private int id;

    public void setId(Integer id) {
        this.id = id;
    }

    private String companyId;
    private String vehicleNum;
    private String driverNum;
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


    @Column(name = "vehicleNum", length = 64)
    public String getVehicleNum() {
        return vehicleNum;
    }

    public void setVehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
    }


    @Column(name = "driverNum", length = 64)
    public String getDriverNum() {
        return driverNum;
    }

    public void setDriverNum(String driverNum) {
        this.driverNum = driverNum;
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

        CompanyscaleEntity that = (CompanyscaleEntity) o;

        if (id != that.id) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (vehicleNum != null ? !vehicleNum.equals(that.vehicleNum) : that.vehicleNum != null) return false;
        if (driverNum != null ? !driverNum.equals(that.driverNum) : that.driverNum != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (vehicleNum != null ? vehicleNum.hashCode() : 0);
        result = 31 * result + (driverNum != null ? driverNum.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}

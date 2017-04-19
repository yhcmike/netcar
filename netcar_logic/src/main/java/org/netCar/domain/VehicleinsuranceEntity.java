package org.netCar.domain;

import javax.persistence.*;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "vehicleinsurance")
public class VehicleinsuranceEntity {
    private int id;

    public void setId(Integer id) {
        this.id = id;
    }

    private String companyId;
    private String vehicleNo;
    private String insurCom;
    private String insurNum;
    private String insurType;
    private Integer insurCount;
    private Integer insurEff;
    private Integer insurExp;
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


    @Column(name = "vehicleNo", length = 32)
    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }


    @Column(name = "insurCom", length = 64)
    public String getInsurCom() {
        return insurCom;
    }

    public void setInsurCom(String insurCom) {
        this.insurCom = insurCom;
    }


    @Column(name = "insurNum", length = 64)
    public String getInsurNum() {
        return insurNum;
    }

    public void setInsurNum(String insurNum) {
        this.insurNum = insurNum;
    }


    @Column(name = "insurType", length = 32)
    public String getInsurType() {
        return insurType;
    }

    public void setInsurType(String insurType) {
        this.insurType = insurType;
    }


    @Column(name = "insurCount")
    public Integer getInsurCount() {
        return insurCount;
    }

    public void setInsurCount(Integer insurCount) {
        this.insurCount = insurCount;
    }


    @Column(name = "insurEff")
    public Integer getInsurEff() {
        return insurEff;
    }

    public void setInsurEff(Integer insurEff) {
        this.insurEff = insurEff;
    }


    @Column(name = "insurExp")
    public Integer getInsurExp() {
        return insurExp;
    }

    public void setInsurExp(Integer insurExp) {
        this.insurExp = insurExp;
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

        VehicleinsuranceEntity that = (VehicleinsuranceEntity) o;

        if (id != that.id) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (vehicleNo != null ? !vehicleNo.equals(that.vehicleNo) : that.vehicleNo != null) return false;
        if (insurCom != null ? !insurCom.equals(that.insurCom) : that.insurCom != null) return false;
        if (insurNum != null ? !insurNum.equals(that.insurNum) : that.insurNum != null) return false;
        if (insurType != null ? !insurType.equals(that.insurType) : that.insurType != null) return false;
        if (insurCount != null ? !insurCount.equals(that.insurCount) : that.insurCount != null) return false;
        if (insurEff != null ? !insurEff.equals(that.insurEff) : that.insurEff != null) return false;
        if (insurExp != null ? !insurExp.equals(that.insurExp) : that.insurExp != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (vehicleNo != null ? vehicleNo.hashCode() : 0);
        result = 31 * result + (insurCom != null ? insurCom.hashCode() : 0);
        result = 31 * result + (insurNum != null ? insurNum.hashCode() : 0);
        result = 31 * result + (insurType != null ? insurType.hashCode() : 0);
        result = 31 * result + (insurCount != null ? insurCount.hashCode() : 0);
        result = 31 * result + (insurEff != null ? insurEff.hashCode() : 0);
        result = 31 * result + (insurExp != null ? insurExp.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}

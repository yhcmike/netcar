package org.netCar.domain;

import javax.persistence.*;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "companypay")
public class CompanypayEntity {
    private int id;
    private String companyId;
    private String payName;
    private String payId;
    private String payType;
    private String payScop;
    private String prepareBank;
    private String countDate;
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


    @Column(name = "payName", length = 256)
    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }


    @Column(name = "payId", length = 32)
    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }


    @Column(name = "payType", length = 64)
    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }


    @Column(name = "payScop", length = 64)
    public String getPayScop() {
        return payScop;
    }

    public void setPayScop(String payScop) {
        this.payScop = payScop;
    }


    @Column(name = "prepareBank", length = 256)
    public String getPrepareBank() {
        return prepareBank;
    }

    public void setPrepareBank(String prepareBank) {
        this.prepareBank = prepareBank;
    }


    @Column(name = "countDate", length = 10)
    public String getCountDate() {
        return countDate;
    }

    public void setCountDate(String countDate) {
        this.countDate = countDate;
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

        CompanypayEntity that = (CompanypayEntity) o;

        if (id != that.id) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (payName != null ? !payName.equals(that.payName) : that.payName != null) return false;
        if (payId != null ? !payId.equals(that.payId) : that.payId != null) return false;
        if (payType != null ? !payType.equals(that.payType) : that.payType != null) return false;
        if (payScop != null ? !payScop.equals(that.payScop) : that.payScop != null) return false;
        if (prepareBank != null ? !prepareBank.equals(that.prepareBank) : that.prepareBank != null) return false;
        if (countDate != null ? !countDate.equals(that.countDate) : that.countDate != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (payName != null ? payName.hashCode() : 0);
        result = 31 * result + (payId != null ? payId.hashCode() : 0);
        result = 31 * result + (payType != null ? payType.hashCode() : 0);
        result = 31 * result + (payScop != null ? payScop.hashCode() : 0);
        result = 31 * result + (prepareBank != null ? prepareBank.hashCode() : 0);
        result = 31 * result + (countDate != null ? countDate.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}

package org.netCar.domain;

import javax.persistence.*;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "passengerevaluation")
public class PassengerevaluationEntity  extends  IdEntity{

    private String companyId;
    private String orderId;
    private Long evaluateTime;
    private Integer serviceScore;
    private Integer driverScore;
    private Integer vehicleScore;
    private String detail;


    @Column(name = "companyId", length = 32)
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }


    @Column(name = "orderId", length = 64)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    @Column(name = "evaluateTime")
    public Long getEvaluateTime() {
        return evaluateTime;
    }

    public void setEvaluateTime(Long evaluateTime) {
        this.evaluateTime = evaluateTime;
    }


    @Column(name = "serviceScore")
    public Integer getServiceScore() {
        return serviceScore;
    }

    public void setServiceScore(Integer serviceScore) {
        this.serviceScore = serviceScore;
    }


    @Column(name = "driverScore")
    public Integer getDriverScore() {
        return driverScore;
    }

    public void setDriverScore(Integer driverScore) {
        this.driverScore = driverScore;
    }


    @Column(name = "vehicleScore")
    public Integer getVehicleScore() {
        return vehicleScore;
    }

    public void setVehicleScore(Integer vehicleScore) {
        this.vehicleScore = vehicleScore;
    }


    @Column(name = "detail", length = 128)
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PassengerevaluationEntity that = (PassengerevaluationEntity) o;

        if (id != that.id) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (evaluateTime != null ? !evaluateTime.equals(that.evaluateTime) : that.evaluateTime != null) return false;
        if (serviceScore != null ? !serviceScore.equals(that.serviceScore) : that.serviceScore != null) return false;
        if (driverScore != null ? !driverScore.equals(that.driverScore) : that.driverScore != null) return false;
        if (vehicleScore != null ? !vehicleScore.equals(that.vehicleScore) : that.vehicleScore != null) return false;
        if (detail != null ? !detail.equals(that.detail) : that.detail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (evaluateTime != null ? evaluateTime.hashCode() : 0);
        result = 31 * result + (serviceScore != null ? serviceScore.hashCode() : 0);
        result = 31 * result + (driverScore != null ? driverScore.hashCode() : 0);
        result = 31 * result + (vehicleScore != null ? vehicleScore.hashCode() : 0);
        result = 31 * result + (detail != null ? detail.hashCode() : 0);
        return result;
    }
}

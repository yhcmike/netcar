package org.netCar.domain;

import javax.persistence.*;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "passengercomplaint")
public class PassengercomplaintEntity {
    private int id;

    public void setId(Integer id) {
        this.id = id;
    }

    private String companyId;
    private String orderId;
    private Long complaintTime;
    private String detail;
    private String result;

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


    @Column(name = "orderId", length = 64)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    @Column(name = "complaintTime")
    public Long getComplaintTime() {
        return complaintTime;
    }

    public void setComplaintTime(Long complaintTime) {
        this.complaintTime = complaintTime;
    }


    @Column(name = "detail", length = 256)
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }


    @Column(name = "result", length = 128)
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PassengercomplaintEntity that = (PassengercomplaintEntity) o;

        if (id != that.id) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (complaintTime != null ? !complaintTime.equals(that.complaintTime) : that.complaintTime != null)
            return false;
        if (detail != null ? !detail.equals(that.detail) : that.detail != null) return false;
        if (result != null ? !result.equals(that.result) : that.result != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result1 = id;
        result1 = 31 * result1 + (companyId != null ? companyId.hashCode() : 0);
        result1 = 31 * result1 + (orderId != null ? orderId.hashCode() : 0);
        result1 = 31 * result1 + (complaintTime != null ? complaintTime.hashCode() : 0);
        result1 = 31 * result1 + (detail != null ? detail.hashCode() : 0);
        result1 = 31 * result1 + (result != null ? result.hashCode() : 0);
        return result1;
    }
}

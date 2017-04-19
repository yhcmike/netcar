package org.netCar.domain;

import javax.persistence.*;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "jtt697")
public class Jtt697Entity {
    private int id;

    public void setId(Integer id) {
        this.id = id;
    }

    private String code;
    private String name;
    private int year;

    public void setYear(Integer year) {
        this.year = year;
    }

    private String remark;
    private Integer status;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Column(name = "code", length = 32)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    @Column(name = "name", length = 64)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column(name = "year")
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Column(name = "remark", length = 128)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jtt697Entity that = (Jtt697Entity) o;

        if (id != that.id) return false;
        if (year != that.year) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}

package org.netCar.domain;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "alarminformations")
public class AlarminformationsEntity {
    private int id;
    private String content;
    private String type;
    private Integer num;
    private Date date;
    private String remark;

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


    @Column(name = "content", length = 256)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Column(name = "type", length = 64)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Column(name = "num")
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }


    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @Column(name = "remark", length = 256)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AlarminformationsEntity that = (AlarminformationsEntity) o;

        if (id != that.id) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (num != null ? !num.equals(that.num) : that.num != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (num != null ? num.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}

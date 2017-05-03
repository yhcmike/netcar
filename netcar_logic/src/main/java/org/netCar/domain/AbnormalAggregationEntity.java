package org.netCar.domain;

import javax.persistence.*;

/**
 * 异常聚集围栏设置
 * Created by ffd on 2017/5/3.
 */
@Entity
@Table(name = "abnormalaggregation")
public class AbnormalAggregationEntity extends IdEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1436273408805506847L;
	
	@Column(name = "name", length = 64)
    private String name;
    @Column(name = "memo", length = 128)
    private String memo;
    @Column(name = "lng")
    private Double lng;
    @Column(name = "lat")
    private Double lat;
    @Column(name = "radius")
    private Double radius;
    @Column(name = "firstNum")
    private Integer firstNum;
    @Column(name = "secNum")
    private Integer secNum;
    @Column(name = "thrNum")
    private Integer thrNum;
    @Column(name = "status")
    private Integer status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Integer getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(Integer firstNum) {
        this.firstNum = firstNum;
    }

    public Integer getSecNum() {
        return secNum;
    }

    public void setSecNum(Integer secNum) {
        this.secNum = secNum;
    }

    public Integer getThrNum() {
        return thrNum;
    }

    public void setThrNum(Integer thrNum) {
        this.thrNum = thrNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

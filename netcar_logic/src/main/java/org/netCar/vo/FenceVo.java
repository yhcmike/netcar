package org.netCar.vo;

import java.io.Serializable;

public class FenceVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8446677104975278552L;
	
	private Integer id;
	
	private String name;
	
	private Integer shape;
	
	private Double radius;
	
	private Integer type;
	
	private String spots;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getShape() {
		return shape;
	}

	public void setShape(Integer shape) {
		this.shape = shape;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getSpots() {
		return spots;
	}

	public void setSpots(String spots) {
		this.spots = spots;
	}
	
	

}

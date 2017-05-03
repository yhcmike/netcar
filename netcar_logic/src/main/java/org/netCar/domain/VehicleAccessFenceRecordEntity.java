package org.netCar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by ffd on 2017/5/3.
 */
@Entity
@Table(name = "vehicle_access_fence_record")
public class VehicleAccessFenceRecordEntity extends IdEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4474941697026485758L;

	@Column(name = "fence_id", length = 128)
	private Integer fenceId;
	@Column(name = "vehicle_no", length = 32)
	private String vehicleNo;
	@Column(name = "position_time")
	private Long positionTime;
	@Column(name = "longitude")
	private Double longitude;
	@Column(name = "latitude")
	private Double latitude;
	@Column(name = "order_id", length = 32)
	private String orderId;
	@Column(name = "type")
	private Integer type;

	public Integer getFenceId() {
		return fenceId;
	}

	public void setFenceId(Integer fenceId) {
		this.fenceId = fenceId;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public Long getPositionTime() {
		return positionTime;
	}

	public void setPositionTime(Long positionTime) {
		this.positionTime = positionTime;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
}

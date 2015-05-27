package com.guoxinan.uems.model;

/**
 * AbstractVehicle entity provides the base persistence definition of the
 * Vehicle entity. @author MyEclipse Persistence Tools
 */

public class Vehicle {

	// Fields

	private Integer vehicleId;
	private Integer driverId;
	private String vehicleType;
	private String vehicleNumber;
	private String vehicleStatus;
	private String vehicleRemark;
	private String vehicleCarrier;
	private Boolean vehicleIsDelete;
	private String vehicleRoute;
	private String vehicleLocation;

	// Constructors

	/** default constructor */
	public Vehicle() {
	}

	/** minimal constructor */
	public Vehicle(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	/** full constructor */
	public Vehicle(Integer vehicleId, Integer driveId,
			String vehicleType, String vehicleNumber, String vehicleStatus,
			String vehicleRemark, String vehicleCarrier,
			Boolean vehicleIsDelete, String vehicleRoute, String vehicleLocation) {
		this.vehicleId = vehicleId;
		this.driverId = driveId;
		this.vehicleType = vehicleType;
		this.vehicleNumber = vehicleNumber;
		this.vehicleStatus = vehicleStatus;
		this.vehicleRemark = vehicleRemark;
		this.vehicleCarrier = vehicleCarrier;
		this.vehicleIsDelete = vehicleIsDelete;
		this.vehicleRoute = vehicleRoute;
		this.vehicleLocation = vehicleLocation;
	}

	// Property accessors

	public Integer getVehicleId() {
		return this.vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public Integer getDriverId() {
		return this.driverId;
	}

	public void setDriverId(Integer driveId) {
		this.driverId = driveId;
	}

	public String getVehicleType() {
		return this.vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleNumber() {
		return this.vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleStatus() {
		return this.vehicleStatus;
	}

	public void setVehicleStatus(String vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}

	public String getVehicleRemark() {
		return this.vehicleRemark;
	}

	public void setVehicleRemark(String vehicleRemark) {
		this.vehicleRemark = vehicleRemark;
	}

	public String getVehicleCarrier() {
		return this.vehicleCarrier;
	}

	public void setVehicleCarrier(String vehicleCarrier) {
		this.vehicleCarrier = vehicleCarrier;
	}

	public Boolean getVehicleIsDelete() {
		return this.vehicleIsDelete;
	}

	public void setVehicleIsDelete(Boolean vehicleIsDelete) {
		this.vehicleIsDelete = vehicleIsDelete;
	}

	public String getVehicleRoute() {
		return this.vehicleRoute;
	}

	public void setVehicleRoute(String vehicleRoute) {
		this.vehicleRoute = vehicleRoute;
	}

	public String getVehicleLocation() {
		return this.vehicleLocation;
	}

	public void setVehicleLocation(String vehicleLocation) {
		this.vehicleLocation = vehicleLocation;
	}

}
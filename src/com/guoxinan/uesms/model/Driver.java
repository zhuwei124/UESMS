package com.guoxinan.uesms.model;

/**
 * AbstractDriver entity provides the base persistence definition of the Driver
 * entity. @author MyEclipse Persistence Tools
 */

public class Driver {

	// Fields

	private Integer driverId;
	private Integer drivingLlicenseId;
	private Integer vehicleId;
	private String driverName;
	private String driverVicheNumber;
	private String driverCompany;
	private Boolean driverIsDeleted;

	// Constructors

	/** default constructor */
	public Driver() {
	}

	/** full constructor */
	public Driver(Integer driverId, Integer drivingLlicenseId,
			Integer vehicleId, String driverName, String driverVicheNumber,
			String driverCompany, Boolean driverIsDeleted) {
		this.driverId = driverId;
		this.drivingLlicenseId = drivingLlicenseId;
		this.vehicleId = vehicleId;
		this.driverName = driverName;
		this.driverVicheNumber = driverVicheNumber;
		this.driverCompany = driverCompany;
		this.driverIsDeleted = driverIsDeleted;
	}

	// Property accessors

	public Integer getDriverId() {
		return this.driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}

	public Integer getDrivingLlicenseId() {
		return this.drivingLlicenseId;
	}

	public void setDrivingLlicenseId(Integer drivingLlicenseId) {
		this.drivingLlicenseId = drivingLlicenseId;
	}

	public Integer getVehicleId() {
		return this.vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getDriverName() {
		return this.driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverVicheNumber() {
		return this.driverVicheNumber;
	}

	public void setDriverVicheNumber(String driverVicheNumber) {
		this.driverVicheNumber = driverVicheNumber;
	}

	public String getDriverCompany() {
		return this.driverCompany;
	}

	public void setDriverCompany(String driverCompany) {
		this.driverCompany = driverCompany;
	}

	public Boolean getDriverIsDeleted() {
		return this.driverIsDeleted;
	}

	public void setDriverIsDeleted(Boolean driverIsDeleted) {
		this.driverIsDeleted = driverIsDeleted;
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", drivingLlicenseId="
				+ drivingLlicenseId + ", vehicleId=" + vehicleId
				+ ", driverName=" + driverName + ", driverVicheNumber="
				+ driverVicheNumber + ", driverCompany=" + driverCompany
				+ ", driverIsDeleted=" + driverIsDeleted + "]";
	}

}
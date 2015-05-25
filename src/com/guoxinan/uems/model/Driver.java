package com.guoxinan.uems.model;

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
	private Boolean driverIsDelete;

	// Constructors

	/** default constructor */
	public Driver() {
	}

	/** minimal constructor */
	public Driver(Integer driveId) {
		this.driverId = driveId;
	}

	/** full constructor */
	public Driver(Integer driveId, Integer drivingLlicenseId,
			Integer vehicleId, String driverName, String driverVicheNumber,
			String driverCompany, Boolean driveIsDelete) {
		this.driverId = driveId;
		this.drivingLlicenseId = drivingLlicenseId;
		this.vehicleId = vehicleId;
		this.driverName = driverName;
		this.driverVicheNumber = driverVicheNumber;
		this.driverCompany = driverCompany;
		this.driverIsDelete = driveIsDelete;
	}

	// Property accessors

	public Integer getDriverId() {
		return this.driverId;
	}

	public void setDriverId(Integer driveId) {
		this.driverId = driveId;
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

	public Boolean getDriverIsDelete() {
		return this.driverIsDelete;
	}

	public void setDriverIsDelete(Boolean driverIsDelete) {
		this.driverIsDelete = driverIsDelete;
	}

}
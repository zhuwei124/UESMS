package com.guoxinan.uems.model;

import java.util.Date;

/**
 * AbstractDrivinglicense entity provides the base persistence definition of
 * the Drivinglicense entity. @author MyEclipse Persistence Tools
 */

public class Drivinglicense {

	// Fields

	private Integer drivingLicenseId;
	private Integer driveId;
	private String drivingLicenseVehicleTtype;
	private String drivingLicenseStatus;
	private Integer drivingLicenseRecord;
	private Date drivingLicenseEnd;
	private Date drivingLicenseStart;
	private Date drivingLicenseIssueDate;

	// Constructors

	/** default constructor */
	public Drivinglicense() {
	}

	/** minimal constructor */
	public Drivinglicense(Integer drivingLicenseId) {
		this.drivingLicenseId = drivingLicenseId;
	}

	/** full constructor */
	public Drivinglicense(Integer drivingLicenseId, Integer driveId,
			String drivingLicenseVehicleTtype, String drivingLicenseStatus,
			Integer drivingLicenseRecord, Date drivingLicenseEnd,
			Date drivingLicenseStart, Date drivingLicenseIssueDate) {
		this.drivingLicenseId = drivingLicenseId;
		this.driveId = driveId;
		this.drivingLicenseVehicleTtype = drivingLicenseVehicleTtype;
		this.drivingLicenseStatus = drivingLicenseStatus;
		this.drivingLicenseRecord = drivingLicenseRecord;
		this.drivingLicenseEnd = drivingLicenseEnd;
		this.drivingLicenseStart = drivingLicenseStart;
		this.drivingLicenseIssueDate = drivingLicenseIssueDate;
	}

	// Property accessors

	public Integer getDrivingLicenseId() {
		return this.drivingLicenseId;
	}

	public void setDrivingLicenseId(Integer drivingLicenseId) {
		this.drivingLicenseId = drivingLicenseId;
	}

	public Integer getDriveId() {
		return this.driveId;
	}

	public void setDriveId(Integer driveId) {
		this.driveId = driveId;
	}

	public String getDrivingLicenseVehicleTtype() {
		return this.drivingLicenseVehicleTtype;
	}

	public void setDrivingLicenseVehicleTtype(
			String drivingLicenseVehicleTtype) {
		this.drivingLicenseVehicleTtype = drivingLicenseVehicleTtype;
	}

	public String getDrivingLicenseStatus() {
		return this.drivingLicenseStatus;
	}

	public void setDrivingLicenseStatus(String drivingLicenseStatus) {
		this.drivingLicenseStatus = drivingLicenseStatus;
	}

	public Integer getDrivingLicenseRecord() {
		return this.drivingLicenseRecord;
	}

	public void setDrivingLicenseRecord(Integer drivingLicenseRecord) {
		this.drivingLicenseRecord = drivingLicenseRecord;
	}

	public Date getDrivingLicenseEnd() {
		return this.drivingLicenseEnd;
	}

	public void setDrivingLicenseEnd(Date drivingLicenseEnd) {
		this.drivingLicenseEnd = drivingLicenseEnd;
	}

	public Date getDrivingLicenseStart() {
		return this.drivingLicenseStart;
	}

	public void setDrivingLicenseStart(Date drivingLicenseStart) {
		this.drivingLicenseStart = drivingLicenseStart;
	}

	public Date getDrivingLicenseIssueDate() {
		return this.drivingLicenseIssueDate;
	}

	public void setDrivingLicenseIssueDate(Date drivingLicenseIssueDate) {
		this.drivingLicenseIssueDate = drivingLicenseIssueDate;
	}

}
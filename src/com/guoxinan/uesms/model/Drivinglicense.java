package com.guoxinan.uesms.model;

import java.util.Date;

/**
 * AbstractDrivinglicense entity provides the base persistence definition of the
 * Drivinglicense entity. @author MyEclipse Persistence Tools
 */

public class Drivinglicense {

	// Fields

	private Integer drivingLicenseId;
	private Integer driveId;
	private String drivingLicenseVehicleTtype;
	private String drivingLicenseStatus;
	private Integer drivingLicenseRecord;
	private String drivingLicenseEnd;
	private String drivingLicenseStart;
	private String drivingLicenseIssueDate;
	private Short drivingLicenseIsDeleted;

	// Constructors

	/** default constructor */
	public Drivinglicense() {
	}

	/** full constructor */
	public Drivinglicense(Integer drivingLicenseId, Integer driveId,
			String drivingLicenseVehicleTtype, String drivingLicenseStatus,
			Integer drivingLicenseRecord, String drivingLicenseEnd,
			String drivingLicenseStart, String drivingLicenseIssueDate,
			Short drivingLicenseIsDeleted) {
		this.drivingLicenseId = drivingLicenseId;
		this.driveId = driveId;
		this.drivingLicenseVehicleTtype = drivingLicenseVehicleTtype;
		this.drivingLicenseStatus = drivingLicenseStatus;
		this.drivingLicenseRecord = drivingLicenseRecord;
		this.drivingLicenseEnd = drivingLicenseEnd;
		this.drivingLicenseStart = drivingLicenseStart;
		this.drivingLicenseIssueDate = drivingLicenseIssueDate;
		this.drivingLicenseIsDeleted = drivingLicenseIsDeleted;
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

	public void setDrivingLicenseVehicleTtype(String drivingLicenseVehicleTtype) {
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

	public String getDrivingLicenseEnd() {
		return this.drivingLicenseEnd;
	}

	public void setDrivingLicenseEnd(String drivingLicenseEnd) {
		this.drivingLicenseEnd = drivingLicenseEnd;
	}

	public String getDrivingLicenseStart() {
		return this.drivingLicenseStart;
	}

	public void setDrivingLicenseStart(String drivingLicenseStart) {
		this.drivingLicenseStart = drivingLicenseStart;
	}

	public String getDrivingLicenseIssueDate() {
		return this.drivingLicenseIssueDate;
	}

	public void setDrivingLicenseIssueDate(String drivingLicenseIssueDate) {
		this.drivingLicenseIssueDate = drivingLicenseIssueDate;
	}

	public Short getDrivingLicenseIsDeleted() {
		return this.drivingLicenseIsDeleted;
	}

	public void setDrivingLicenseIsDeleted(Short drivingLicenseIsDeleted) {
		this.drivingLicenseIsDeleted = drivingLicenseIsDeleted;
	}

	@Override
	public String toString() {
		return "Drivinglicense [drivingLicenseId=" + drivingLicenseId
				+ ", driveId=" + driveId + ", drivingLicenseVehicleTtype="
				+ drivingLicenseVehicleTtype + ", drivingLicenseStatus="
				+ drivingLicenseStatus + ", drivingLicenseRecord="
				+ drivingLicenseRecord + ", drivingLicenseEnd="
				+ drivingLicenseEnd + ", drivingLicenseStart="
				+ drivingLicenseStart + ", drivingLicenseIssueDate="
				+ drivingLicenseIssueDate + ", drivingLicenseIsDeleted="
				+ drivingLicenseIsDeleted + "]";
	}

}
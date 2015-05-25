package com.guoxinan.uems.model;

/**
 * AbstractStation entity provides the base persistence definition of the
 * Station entity. @author MyEclipse Persistence Tools
 */

public class Station {

	// Fields

	private Integer stationId;
	private Integer carriageCompanyId;
	private String stationCode;
	private String stationCorporateRepresentative;
	private String stationAddress;
	private String stationZipCode;
	private String stationStatus;
	private String ststionBriefIntroduction;
	private Boolean ststionIsDeleted;

	// Constructors

	/** default constructor */
	public Station() {
	}

	/** minimal constructor */
	public Station(Integer stationId) {
		this.stationId = stationId;
	}

	/** full constructor */
	public Station(Integer stationId, Integer carriageCompanyId,
			String stationCode, String stationCorporateRepresentative,
			String stationAddress, String stationZipCode, String stationStatus,
			String ststionBriefIntroduction, Boolean ststionIsDeleted) {
		this.stationId = stationId;
		this.carriageCompanyId = carriageCompanyId;
		this.stationCode = stationCode;
		this.stationCorporateRepresentative = stationCorporateRepresentative;
		this.stationAddress = stationAddress;
		this.stationZipCode = stationZipCode;
		this.stationStatus = stationStatus;
		this.ststionBriefIntroduction = ststionBriefIntroduction;
		this.ststionIsDeleted = ststionIsDeleted;
	}

	// Property accessors

	public Integer getStationId() {
		return this.stationId;
	}

	public void setStationId(Integer stationId) {
		this.stationId = stationId;
	}

	public Integer getCarriageCompanyId() {
		return this.carriageCompanyId;
	}

	public void setCarriageCompanyId(Integer carriageCompanyId) {
		this.carriageCompanyId = carriageCompanyId;
	}

	public String getStationCode() {
		return this.stationCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	public String getStationCorporateRepresentative() {
		return this.stationCorporateRepresentative;
	}

	public void setStationCorporateRepresentative(
			String stationCorporateRepresentative) {
		this.stationCorporateRepresentative = stationCorporateRepresentative;
	}

	public String getStationAddress() {
		return this.stationAddress;
	}

	public void setStationAddress(String stationAddress) {
		this.stationAddress = stationAddress;
	}

	public String getStationZipCode() {
		return this.stationZipCode;
	}

	public void setStationZipCode(String stationZipCode) {
		this.stationZipCode = stationZipCode;
	}

	public String getStationStatus() {
		return this.stationStatus;
	}

	public void setStationStatus(String stationStatus) {
		this.stationStatus = stationStatus;
	}

	public String getStstionBriefIntroduction() {
		return this.ststionBriefIntroduction;
	}

	public void setStstionBriefIntroduction(String ststionBriefIntroduction) {
		this.ststionBriefIntroduction = ststionBriefIntroduction;
	}

	public Boolean getStstionIsDeleted() {
		return this.ststionIsDeleted;
	}

	public void setStstionIsDeleted(Boolean ststionIsDeleted) {
		this.ststionIsDeleted = ststionIsDeleted;
	}

}
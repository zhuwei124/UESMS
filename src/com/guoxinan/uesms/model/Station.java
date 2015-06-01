package com.guoxinan.uesms.model;

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
	private String stationBriefIntroduction;
	private Boolean stationIsDeleted;

	// Constructors

	/** default constructor */
	public Station() {
	}


	/** full constructor */
	public Station(Integer stationId, Integer carriageCompanyId,
			String stationCode, String stationCorporateRepresentative,
			String stationAddress, String stationZipCode, String stationStatus,
			String stationBriefIntroduction, Boolean stationIsDeleted) {
		this.stationId = stationId;
		this.carriageCompanyId = carriageCompanyId;
		this.stationCode = stationCode;
		this.stationCorporateRepresentative = stationCorporateRepresentative;
		this.stationAddress = stationAddress;
		this.stationZipCode = stationZipCode;
		this.stationStatus = stationStatus;
		this.stationBriefIntroduction = stationBriefIntroduction;
		this.stationIsDeleted = stationIsDeleted;
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

	public String getStationBriefIntroduction() {
		return this.stationBriefIntroduction;
	}

	public void setStationBriefIntroduction(String stationBriefIntroduction) {
		this.stationBriefIntroduction = stationBriefIntroduction;
	}

	public Boolean getStationIsDeleted() {
		return this.stationIsDeleted;
	}

	public void setStationIsDeleted(Boolean stationIsDeleted) {
		this.stationIsDeleted = stationIsDeleted;
	}


	@Override
	public String toString() {
		return "Station [stationId=" + stationId + ", carriageCompanyId="
				+ carriageCompanyId + ", stationCode=" + stationCode
				+ ", stationCorporateRepresentative="
				+ stationCorporateRepresentative + ", stationAddress="
				+ stationAddress + ", stationZipCode=" + stationZipCode
				+ ", stationStatus=" + stationStatus
				+ ", stationBriefIntroduction=" + stationBriefIntroduction
				+ ", stationIsDeleted=" + stationIsDeleted + "]";
	}

}
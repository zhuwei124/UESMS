package com.guoxinan.uesms.model;

/**
 * AbstractCarriagecompany entity provides the base persistence definition of
 * the Carriagecompany entity. @author MyEclipse Persistence Tools
 */

public class Carriagecompany {

	// Fields

	private Integer carriageCompanyId;
	private Integer vehicleId;
	private String carriageCompanyCorporateRepresentative;
	private String carriageCompanyAddress;
	private String carriageCompanyZipCode;
	private String carriageCompanyStatus;
	private Boolean carriageCompanyIsDeleted;

	// Constructors

	/** default constructor */
	public Carriagecompany() {
	}

	/** full constructor */
	public Carriagecompany(Integer carriageCompanyId,
			Integer vehicleId, String carriageCompanyCorporateRepresentative,
			String carriageCompanyAddress, String carriageCompanyZipCode,
			String carriageCompanyStatus, Boolean carriageCompanyIsDeleted) {
		this.carriageCompanyId = carriageCompanyId;
		this.vehicleId = vehicleId;
		this.carriageCompanyCorporateRepresentative = carriageCompanyCorporateRepresentative;
		this.carriageCompanyAddress = carriageCompanyAddress;
		this.carriageCompanyZipCode = carriageCompanyZipCode;
		this.carriageCompanyStatus = carriageCompanyStatus;
		this.carriageCompanyIsDeleted = carriageCompanyIsDeleted;
	}

	// Property accessors

	public Integer getCarriageCompanyId() {
		return this.carriageCompanyId;
	}

	public void setCarriageCompanyId(Integer carriageCompanyId) {
		this.carriageCompanyId = carriageCompanyId;
	}

	public Integer getVehicleId() {
		return this.vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getCarriageCompanyCorporateRepresentative() {
		return this.carriageCompanyCorporateRepresentative;
	}

	public void setCarriageCompanyCorporateRepresentative(
			String carriageCompanyCorporateRepresentative) {
		this.carriageCompanyCorporateRepresentative = carriageCompanyCorporateRepresentative;
	}

	public String getCarriageCompanyAddress() {
		return this.carriageCompanyAddress;
	}

	public void setCarriageCompanyAddress(String carriageCompanyAddress) {
		this.carriageCompanyAddress = carriageCompanyAddress;
	}

	public String getCarriageCompanyZipCode() {
		return this.carriageCompanyZipCode;
	}

	public void setCarriageCompanyZipCode(String carriageCompanyZipCode) {
		this.carriageCompanyZipCode = carriageCompanyZipCode;
	}

	public String getCarriageCompanyStatus() {
		return this.carriageCompanyStatus;
	}

	public void setCarriageCompanyStatus(String carriageCompanyStatus) {
		this.carriageCompanyStatus = carriageCompanyStatus;
	}

	public Boolean getCarriageCompanyIsDeleted() {
		return this.carriageCompanyIsDeleted;
	}

	public void setCarriageCompanyIsDeleted(Boolean carriageCompanyIsDeleted) {
		this.carriageCompanyIsDeleted = carriageCompanyIsDeleted;
	}

	@Override
	public String toString() {
		return "Carriagecompany [carriageCompanyId=" + carriageCompanyId
				+ ", vehicleId=" + vehicleId
				+ ", carriageCompanyCorporateRepresentative="
				+ carriageCompanyCorporateRepresentative
				+ ", carriageCompanyAddress=" + carriageCompanyAddress
				+ ", carriageCompanyZipCode=" + carriageCompanyZipCode
				+ ", carriageCompanyStatus=" + carriageCompanyStatus
				+ ", carriageCompanyIsDeleted=" + carriageCompanyIsDeleted
				+ "]";
	}
	
}
package com.guoxinan.uesms.model;

/**
 * AbstractLimitt entity provides the base persistence definition of the Limitt
 * entity. @author MyEclipse Persistence Tools
 */

public class Limitt {

	// Fields

	private Integer limitId;
	private String limitName;
	private String limitStatus;
	private Boolean limitIsDeleted;
	private int limitLevel;

	// Constructors

	/** default constructor */
	public Limitt() {
	}

	/** full constructor */
	public Limitt(Integer limitId, String limitName,
			String limitStatus, Boolean limitIsDeleted ,int limitLevel) {
		this.limitId = limitId;
		this.limitName = limitName;
		this.limitStatus = limitStatus;
		this.limitIsDeleted = limitIsDeleted;
		this.limitLevel = limitLevel;
	}

	// Property accessors

	public Integer getLimitId() {
		return this.limitId;
	}

	public void setLimitId(Integer limitId) {
		this.limitId = limitId;
	}

	public String getLimitName() {
		return this.limitName;
	}

	public void setLimitName(String limitName) {
		this.limitName = limitName;
	}

	public String getLimitStatus() {
		return this.limitStatus;
	}

	public void setLimitStatus(String limitStatus) {
		this.limitStatus = limitStatus;
	}

	public Boolean getLimitIsDeleted() {
		return this.limitIsDeleted;
	}

	public void setLimitIsDeleted(Boolean limitIsDeleted) {
		this.limitIsDeleted = limitIsDeleted;
	}
	
	public int getLimitLevel() {
		return limitLevel;
	}

	public void setLimitLevel(int limitLevel) {
		this.limitLevel = limitLevel;
	}

	@Override
	public String toString() {
		return "Limitt [limitId=" + limitId + ", limitName=" + limitName
				+ ", limitStatus=" + limitStatus + ", limitIsDeleted="
				+ limitIsDeleted + ", limitLevel=" + limitLevel + "]";
	}

}
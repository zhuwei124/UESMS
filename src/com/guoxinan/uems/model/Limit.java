package com.guoxinan.uems.model;

/**
 * AbstractLimit entity provides the base persistence definition of the Limit
 * entity. @author MyEclipse Persistence Tools
 */

public class Limit {

	// Fields

	private Integer limitId;
	private String limitName;
	private String limitStatus;

	// Constructors

	/** default constructor */
	public Limit() {
	}

	/** minimal constructor */
	public Limit(Integer limitId) {
		this.limitId = limitId;
	}

	/** full constructor */
	public Limit(Integer limitId, String limitName, String limitStatus) {
		this.limitId = limitId;
		this.limitName = limitName;
		this.limitStatus = limitStatus;
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

}
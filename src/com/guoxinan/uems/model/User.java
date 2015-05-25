package com.guoxinan.uems.model;

import java.util.Date;

/**
 * AbstractUser entity provides the base persistence definition of the User
 * entity. @author MyEclipse Persistence Tools
 */

public class User {

	// Fields

	private Integer userId;
	private Integer passwordQuestionId;
	private Integer limitId;
	private Integer userSystemNumber;
	private String userName;
	private String userSex;
	private String userIdCard;
	private String userTellNumber;
	private Date userBirthday;
	private String userMail;
	private String userAddress;
	private String userQq;
	private String userStatus;
	private String userPassword;
	private Boolean userIsDeleted;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(Integer userId) {
		this.userId = userId;
	}

	/** full constructor */
	public User(Integer userId, Integer passwordQuestionId,
			Integer limitId, Integer userSystemNumber, String userName,
			String userSex, String userIdCard, String userTellNumber,
			Date userBirthday, String userMail, String userAddress,
			String userQq, String userStatus, String userPassword,
			Boolean userIsDeleted) {
		this.userId = userId;
		this.passwordQuestionId = passwordQuestionId;
		this.limitId = limitId;
		this.userSystemNumber = userSystemNumber;
		this.userName = userName;
		this.userSex = userSex;
		this.userIdCard = userIdCard;
		this.userTellNumber = userTellNumber;
		this.userBirthday = userBirthday;
		this.userMail = userMail;
		this.userAddress = userAddress;
		this.userQq = userQq;
		this.userStatus = userStatus;
		this.userPassword = userPassword;
		this.userIsDeleted = userIsDeleted;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getPasswordQuestionId() {
		return this.passwordQuestionId;
	}

	public void setPasswordQuestionId(Integer passwordQuestionId) {
		this.passwordQuestionId = passwordQuestionId;
	}

	public Integer getLimitId() {
		return this.limitId;
	}

	public void setLimitId(Integer limitId) {
		this.limitId = limitId;
	}

	public Integer getUserSystemNumber() {
		return this.userSystemNumber;
	}

	public void setUserSystemNumber(Integer userSystemNumber) {
		this.userSystemNumber = userSystemNumber;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSex() {
		return this.userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserIdCard() {
		return this.userIdCard;
	}

	public void setUserIdCard(String userIdCard) {
		this.userIdCard = userIdCard;
	}

	public String getUserTellNumber() {
		return this.userTellNumber;
	}

	public void setUserTellNumber(String userTellNumber) {
		this.userTellNumber = userTellNumber;
	}

	public Date getUserBirthday() {
		return this.userBirthday;
	}

	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}

	public String getUserMail() {
		return this.userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getUserAddress() {
		return this.userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserQq() {
		return this.userQq;
	}

	public void setUserQq(String userQq) {
		this.userQq = userQq;
	}

	public String getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Boolean getUserIsDeleted() {
		return this.userIsDeleted;
	}

	public void setUserIsDeleted(Boolean userIsDeleted) {
		this.userIsDeleted = userIsDeleted;
	}

}
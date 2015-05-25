package com.guoxinan.uems.model;

/**
 * AbstractPasswordquestion entity provides the base persistence definition of
 * the Passwordquestion entity. @author MyEclipse Persistence Tools
 */

public class Passwordquestion {

	// Fields

	private Integer passwordQuestionId;
	private String passwordQuestionContent;
	private String passwordQuestionAnswer;
	private Boolean passwordQuestionIsDeleted;

	// Constructors

	/** default constructor */
	public Passwordquestion() {
	}

	/** minimal constructor */
	public Passwordquestion(Integer passwordQuestionId) {
		this.passwordQuestionId = passwordQuestionId;
	}

	/** full constructor */
	public Passwordquestion(Integer passwordQuestionId,
			String passwordQuestionContent, String passwordQuestionAnswer,
			Boolean passwordQuestionIsDeleted) {
		this.passwordQuestionId = passwordQuestionId;
		this.passwordQuestionContent = passwordQuestionContent;
		this.passwordQuestionAnswer = passwordQuestionAnswer;
		this.passwordQuestionIsDeleted = passwordQuestionIsDeleted;
	}

	// Property accessors

	public Integer getPasswordQuestionId() {
		return this.passwordQuestionId;
	}

	public void setPasswordQuestionId(Integer passwordQuestionId) {
		this.passwordQuestionId = passwordQuestionId;
	}

	public String getPasswordQuestionContent() {
		return this.passwordQuestionContent;
	}

	public void setPasswordQuestionContent(String passwordQuestionContent) {
		this.passwordQuestionContent = passwordQuestionContent;
	}

	public String getPasswordQuestionAnswer() {
		return this.passwordQuestionAnswer;
	}

	public void setPasswordQuestionAnswer(String passwordQuestionAnswer) {
		this.passwordQuestionAnswer = passwordQuestionAnswer;
	}

	public Boolean getPasswordQuestionIsDeleted() {
		return this.passwordQuestionIsDeleted;
	}

	public void setPasswordQuestionIsDeleted(Boolean passwordQuestionIsDeleted) {
		this.passwordQuestionIsDeleted = passwordQuestionIsDeleted;
	}

}
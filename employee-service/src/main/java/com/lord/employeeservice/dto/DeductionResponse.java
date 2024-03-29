package com.lord.employeeservice.dto;

import java.math.BigDecimal;

public class DeductionResponse {

	
private Long id;
	
	private String jobRole;

	private BigDecimal retirement;
	
	private BigDecimal inss;
	
	private BigDecimal socialWork;
	
	private BigDecimal socialShare;
	
	private BigDecimal insurance;
	
	private BigDecimal freeDayDiscount;
	
	private BigDecimal bonificationDiscount;
	
	private BigDecimal loanDiscount;
	
	
	public String getJobRole() {
		return jobRole;
	}
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getRetirement() {
		return retirement;
	}

	public void setRetirement(BigDecimal retirement) {
		this.retirement = retirement;
	}

	public BigDecimal getInss() {
		return inss;
	}

	public void setInss(BigDecimal inss) {
		this.inss = inss;
	}

	public BigDecimal getSocialWork() {
		return socialWork;
	}

	public void setSocialWork(BigDecimal socialWork) {
		this.socialWork = socialWork;
	}

	public BigDecimal getSocialShare() {
		return socialShare;
	}

	public void setSocialShare(BigDecimal socialShare) {
		this.socialShare = socialShare;
	}

	public BigDecimal getInsurance() {
		return insurance;
	}

	public void setInsurance(BigDecimal insurance) {
		this.insurance = insurance;
	}

	public BigDecimal getFreeDayDiscount() {
		return freeDayDiscount;
	}

	public void setFreeDayDiscount(BigDecimal freeDayDiscount) {
		this.freeDayDiscount = freeDayDiscount;
	}

	public BigDecimal getBonificationDiscount() {
		return bonificationDiscount;
	}

	public void setBonificationDiscount(BigDecimal bonificationDiscount) {
		this.bonificationDiscount = bonificationDiscount;
	}

	public BigDecimal getLoanDiscount() {
		return loanDiscount;
	}

	public void setLoanDiscount(BigDecimal loanDiscount) {
		this.loanDiscount = loanDiscount;
	}
	
}

package com.lord.employeeservice.dto;

import java.math.BigDecimal;

public class FortNightResponse {

	private int hours;
	
	private BigDecimal extras;
	
	private BigDecimal prize;
	
	private BigDecimal retirement;
	
	private BigDecimal inss;
	
	private BigDecimal socialWork;
	
	private BigDecimal socialShare;
	
	private BigDecimal insurance;
	
	private BigDecimal freeDayDiscount;
	
	private BigDecimal bonificationDiscount;
	
	private BigDecimal loanDiscount;
	
	private String employeeName;
	
	private Long employeeId;

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public BigDecimal getExtras() {
		return extras;
	}

	public void setExtras(BigDecimal extras) {
		this.extras = extras;
	}

	public BigDecimal getPrize() {
		return prize;
	}

	public void setPrize(BigDecimal prize) {
		this.prize = prize;
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

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	
	
	
}

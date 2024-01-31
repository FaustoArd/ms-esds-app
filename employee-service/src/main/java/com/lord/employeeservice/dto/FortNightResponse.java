package com.lord.employeeservice.dto;

import java.math.BigDecimal;

public class FortNightResponse {

	private int hoursQuantity;
	
	private BigDecimal hours;
	
	private int extrasQuantity50;

	private int extrasQuantity100;
	
	private BigDecimal extras50;

	private BigDecimal extras100;
	
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

	private BigDecimal totalRetribution;

	private BigDecimal totalDeduction;
	
	private BigDecimal holidayDay;

	public BigDecimal getHours() {
		return hours;
	}

	public void setHours(BigDecimal hours) {
		this.hours = hours;
	}
	

	public int getHoursQuantity() {
		return hoursQuantity;
	}

	public void setHoursQuantity(int hoursQuantity) {
		this.hoursQuantity = hoursQuantity;
	}

	public BigDecimal getExtras50() {
		return extras50;
	}

	public void setExtras50(BigDecimal extras50) {
		this.extras50 = extras50;
	}
	

	public BigDecimal getExtras100() {
		return extras100;
	}

	public void setExtras100(BigDecimal extras100) {
		this.extras100 = extras100;
	}
	
	public int getExtrasQuantity50() {
		return extrasQuantity50;
	}

	public void setExtrasQuantity50(int extrasQuantity50) {
		this.extrasQuantity50 = extrasQuantity50;
	}

	public int getExtrasQuantity100() {
		return extrasQuantity100;
	}

	public void setExtrasQuantity100(int extrasQuantity100) {
		this.extrasQuantity100 = extrasQuantity100;
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

	public BigDecimal getTotalRetribution() {
		return totalRetribution;
	}

	public void setTotalRetribution(BigDecimal totalRetribution) {
		this.totalRetribution = totalRetribution;
	}

	public BigDecimal getTotalDeduction() {
		return totalDeduction;
	}

	public void setTotalDeduction(BigDecimal totalDeduction) {
		this.totalDeduction = totalDeduction;
	}
	
	public BigDecimal getHolidayDay() {
		return holidayDay;
	}

	public void setHolidayDay(BigDecimal holidayDay) {
		this.holidayDay = holidayDay;
	}

}

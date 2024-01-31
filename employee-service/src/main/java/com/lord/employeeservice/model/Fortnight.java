package com.lord.employeeservice.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="fort_nights")
public class Fortnight {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long id;
	
	private Calendar date;
	
	private String fortNightDateText;
	
	private int hoursQuantity;
	
	private Calendar lastDepositDate;
	
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
	
	private BigDecimal totalRetribution;
	
	private BigDecimal totalDeduction;
	
	private BigDecimal holidayDay;
	
	private BigDecimal totalPay;
	
	private String totalPayText;
	
	@ManyToOne(cascade =  CascadeType.MERGE,fetch = FetchType.LAZY)
	@JoinColumn(name="employee_id", referencedColumnName = "id")
	private Employee employee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	public int getHoursQuantity() {
		return hoursQuantity;
	}

	public void setHoursQuantity(int hoursQuantity) {
		this.hoursQuantity = hoursQuantity;
	}
	
	public Calendar getLastDepositDate() {
		return lastDepositDate;
	}

	public void setLastDepositDate(Calendar lastDepositDate) {
		this.lastDepositDate = lastDepositDate;
	}


	public BigDecimal getHours() {
		return hours;
	}

	public void setHours(BigDecimal hours) {
		this.hours = hours;
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
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
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

	public BigDecimal getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(BigDecimal totalPay) {
		this.totalPay = totalPay;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getFortNightDateText() {
		return fortNightDateText;
	}

	public void setForthNightDateText(String fortNightDateText) {
		this.fortNightDateText = fortNightDateText;
	}

	public String getTotalPayText() {
		return totalPayText;
	}

	public void setTotalPayText(String totalPayText) {
		this.totalPayText = totalPayText;
	}
	
	
}

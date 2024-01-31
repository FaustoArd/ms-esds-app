package com.lord.employeeservice.model;

import java.math.BigDecimal;
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
	
	private int hours;
	
	private int extrasNumber;
	
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
	
	private BigDecimal totalRetribution;
	
	private BigDecimal totalDeduction;
	
	@ManyToOne(cascade =  CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="employee_id", referencedColumnName = "id")
	private Employee employee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
	

	public int getExtrasNumber() {
		return extrasNumber;
	}

	public void setExtrasNumber(int extrasNumber) {
		this.extrasNumber = extrasNumber;
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
	

}

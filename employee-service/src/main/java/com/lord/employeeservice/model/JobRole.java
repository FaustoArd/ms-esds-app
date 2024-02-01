package com.lord.employeeservice.model;

import java.math.BigDecimal;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="job_roles")
public class JobRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String role;
	
	private BigDecimal payHour;
    
	private BigDecimal prizePercentage;
	
	private BigDecimal holidayDayPercentage ;
	
	private int holiday;
	
	private Long enterpriseId;
	
	public Long getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(Long enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public BigDecimal getPayHour() {
		return payHour;
	}

	public void setPayHour(BigDecimal payHour) {
		this.payHour = payHour;
	}

	

	public BigDecimal getPrizePercentage() {
		return prizePercentage;
	}

	public void setPrizePercentage(BigDecimal prizePercentage) {
		this.prizePercentage = prizePercentage;
	}

	public int getHoliday() {
		return holiday;
	}

	public void setHoliday(int holiday) {
		this.holiday = holiday;
	}


	public BigDecimal getHolidayDayPercentage() {
		return holidayDayPercentage;
	}

	public void setHolidayDayPercentage(BigDecimal holidayDayPercentage) {
		this.holidayDayPercentage = holidayDayPercentage;
	}

	
	

}

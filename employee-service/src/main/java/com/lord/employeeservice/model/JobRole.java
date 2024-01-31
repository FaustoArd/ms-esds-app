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
    
	private BigDecimal payExtraHour50;
	
	private BigDecimal payExtraHour100;
	
	private BigDecimal prize;
	
	private BigDecimal holidayDayPercentage ;
	
	private int holiday;
	
	

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

	public BigDecimal getPayExtraHour50() {
		return payExtraHour50;
	}

	public void setPayExtraHour50(BigDecimal payExtraHour) {
		this.payExtraHour50 = payExtraHour;
	}

	
	public BigDecimal getPayExtraHour100() {
		return payExtraHour100;
	}

	public void setPayExtraHour100(BigDecimal payExtraHour100) {
		this.payExtraHour100 = payExtraHour100;
	}

	public BigDecimal getPrize() {
		return prize;
	}

	public void setPrize(BigDecimal prize) {
		this.prize = prize;
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

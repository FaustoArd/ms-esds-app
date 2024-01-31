package com.lord.employeeservice.dto;

import java.math.BigDecimal;

public class JobRoleResponse {

	private Long id;
	
	private String role;
	
	private BigDecimal payHour;
    
	private BigDecimal payExtraHour50;
	
	private BigDecimal payExtraHour100;
	
	private BigDecimal prize;
	
	private int holiday;
	
	private BigDecimal holidayDayPercentage;

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

	public void setPayExtraHour50(BigDecimal payExtraHour50) {
		this.payExtraHour50 = payExtraHour50;
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

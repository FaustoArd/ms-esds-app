package com.lord.employeeservice.dto;

import java.math.BigDecimal;

public class JobRoleDto {
	
	private Long id;
	
	private String role;
	
	private BigDecimal payHour;
    
	private BigDecimal payExtraHour;
	
	private BigDecimal prize;
	
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

	public BigDecimal getPayExtraHour() {
		return payExtraHour;
	}

	public void setPayExtraHour(BigDecimal payExtraHour) {
		this.payExtraHour = payExtraHour;
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
	
	
}

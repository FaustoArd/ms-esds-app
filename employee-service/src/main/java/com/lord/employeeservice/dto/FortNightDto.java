package com.lord.employeeservice.dto;

import java.util.Calendar;

public class FortNightDto {

	private Long id;
	
	private Long employeeId;
	
	private Calendar date;
	
	private int hoursQuantity;
	
	private int extrasQuantity50;
	
	private int extrasQuantity100;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public int getHoursQuantity() {
		return hoursQuantity;
	}
	

	public void setHoursQuantity(int hoursQuantity) {
		this.hoursQuantity = hoursQuantity;
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

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}
	
	
	
	
	
}

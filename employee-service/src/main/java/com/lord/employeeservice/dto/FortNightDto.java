package com.lord.employeeservice.dto;

public class FortNightDto {

	private Long id;
	
	private Long employeeId;
	
	private int hours;
	
	private int extrasNumber;

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
	
	
	
}

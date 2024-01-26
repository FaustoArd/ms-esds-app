package com.lord.laborservice.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String employeeName;
	
	private BigDecimal employeeDaySalary;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public BigDecimal getEmployeeDaySalary() {
		return employeeDaySalary;
	}

	public void setEmployeeDaySalary(BigDecimal employeeDaySalary) {
		this.employeeDaySalary = employeeDaySalary;
	}

	
}

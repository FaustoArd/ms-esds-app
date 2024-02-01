package com.lord.employeeservice.dto;

public class EmployeeDto {

	private Long id;
	
	private String name;
	
	private String lastname;
	
	private String phone;
	
	private String email;
	
	private String dni;
	
	private String jobRole;
	
	private Long jobRoleId;
	
	private Long enterpriseId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
	
	public Long getJobRoleId() {
		return jobRoleId;
	}
	
	public void setJobroleId(Long jobRoleId) {
		this.jobRoleId = jobRoleId;
	}
	public Long getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(Long enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	
}

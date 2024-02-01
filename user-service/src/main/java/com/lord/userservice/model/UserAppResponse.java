package com.lord.userservice.model;

import java.util.Set;


public class UserAppResponse {

		private Long id;
	
	private String name;
	
	private String lastname;
	
	private String username;
	
	private String email;
	
	private String password;
	
	private Set<Long> enterprisesId;

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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Long> getEnterprisesId() {
		return enterprisesId;
	}

	public void setEnterprisesId(Set<Long> enterprisesId) {
		this.enterprisesId = enterprisesId;
	}
	
}

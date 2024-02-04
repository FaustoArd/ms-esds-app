package com.lord.userservice.dto;

public class LoginResponse {

	
	private Long id;
	
	private String token;
	
	private String text;
	
	public LoginResponse(Long id, String token,String text) {
		this.id = id;
		this.token = token;
		this.text = text;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}

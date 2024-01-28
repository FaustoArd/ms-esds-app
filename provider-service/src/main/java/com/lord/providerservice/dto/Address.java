package com.lord.providerservice.dto;

public class Address {

	private String street;

	private String houseNumber;
	
	private String gMapsFullname;

	private String locality;

	private String city;
	
	private Long providerId;
	
	

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getLocality() {
		return locality;
	}
	
	

	public String getgMapsFullname() {
		return gMapsFullname;
	}

	public void setgMapsFullname(String gMapsFullname) {
		this.gMapsFullname = gMapsFullname;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getProviderId() {
		return providerId;
	}

	public void setProviderId(Long providerId) {
		this.providerId = providerId;
	}
	}

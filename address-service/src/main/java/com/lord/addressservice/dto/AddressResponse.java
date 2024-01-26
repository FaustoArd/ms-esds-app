package com.lord.addressservice.dto;

public class AddressResponse {
	
	private Long id;
	
	private Long customerId;
	
	private Long providerId;

	private String street;

	private String houseNumber;
	
	private String gMapsFullname;

	private String locality;

	private String city;

	public String getStreet() {
		return street;
	}
	
	public Long setId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getProviderId() {
		return providerId;
	}

	public void setProviderId(Long providerId) {
		this.providerId = providerId;
	}

	public Long getId() {
		return id;
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
	public String getGMapsFullname() {
		return gMapsFullname;
	}
	public void setGmapsFullname(String gMapsFullname) {
		this.gMapsFullname = gMapsFullname;
	}

	public String getLocality() {
		return locality;
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
	
}


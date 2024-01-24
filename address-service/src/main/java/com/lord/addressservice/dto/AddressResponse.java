package com.lord.addressservice.dto;

public class AddressResponse {
	
	private Long id;

	private String street;

	private String houseNumber;

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


package com.lord.enterpriseservice.model;

public class Address {
	
	private Long id;
	
	private Long enterpriseId;

	private String street;

	private String houseNumber;
	
	private String gMapsFullname;

	private String locality;

	private String city;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Long getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(Long enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

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

	public String getgMapsFullname() {
		return gMapsFullname;
	}

	public void setgMapsFullname(String gMapsFullname) {
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

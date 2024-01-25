package com.lord.distanceservice.model;

import java.util.ArrayList;

public class GeocodingResponse {
	
	private ArrayList<AddressComponent> address_components;
	
	private String formatted_address;
	
	private Geometry geometry;
	
	private String place_id;
	
	private PlusCode plusCode;
	
	private ArrayList<String> types;

	public ArrayList<AddressComponent> getAddress_components() {
		return address_components;
	}

	public void setAddress_components(ArrayList<AddressComponent> address_components) {
		this.address_components = address_components;
	}

	public String getFormatted_address() {
		return formatted_address;
	}

	public void setFormatted_address(String formatted_address) {
		this.formatted_address = formatted_address;
	}

	public Geometry getGeometry() {
		return geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

	public String getPlace_id() {
		return place_id;
	}

	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}

	public PlusCode getPlusCode() {
		return plusCode;
	}

	public void setPlusCode(PlusCode plusCode) {
		this.plusCode = plusCode;
	}

	public ArrayList<String> getTypes() {
		return types;
	}

	public void setTypes(ArrayList<String> types) {
		this.types = types;
	}
	
	

}

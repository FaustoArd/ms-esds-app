package com.lord.distanceservice.model;

import java.util.ArrayList;

public class Place {
	
	private String formatted_address;
	
	private Geometry geometry;

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
	
	
	

}

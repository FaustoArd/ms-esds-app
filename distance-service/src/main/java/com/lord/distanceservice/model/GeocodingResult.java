package com.lord.distanceservice.model;

import java.util.ArrayList;

public class GeocodingResult {
	
	private ArrayList<GeocodingResponse> results;
	
	private String status;

	public ArrayList<GeocodingResponse> getResults() {
		return results;
	}

	public void setResults(ArrayList<GeocodingResponse> results) {
		this.results = results;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}

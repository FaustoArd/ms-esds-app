package com.lord.distanceservice.model;

import java.util.ArrayList;

public class PlacesTextSearchResponse {

	private ArrayList<String> html_attributions;
	
	private ArrayList<Place> results;
	
	private String status;

	public ArrayList<String> getHtml_attributions() {
		return html_attributions;
	}

	public void setHtml_attributions(ArrayList<String> html_attributions) {
		this.html_attributions = html_attributions;
	}

	public ArrayList<Place> getResults() {
		return results;
	}

	public void setResults(ArrayList<Place> results) {
		this.results = results;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}

package com.lord.distanceservice.model;

public class DistanceMatrixElement {
	
	private String status;
	
	private TextValueObject distance;
	
	private TextValueObject duration;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public TextValueObject getDistance() {
		return distance;
	}

	public void setDistance(TextValueObject distance) {
		this.distance = distance;
	}

	public TextValueObject getDuration() {
		return duration;
	}

	public void setDuration(TextValueObject duration) {
		this.duration = duration;
	}
	
	
	
	

}

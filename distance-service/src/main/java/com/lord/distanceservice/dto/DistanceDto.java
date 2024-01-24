package com.lord.distanceservice.dto;

import org.springframework.data.annotation.Id;

public class DistanceDto {
	
	@Id
	private String id;
	
	private String mode;
	
	private String destination;
	
	private String origin;
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	

}

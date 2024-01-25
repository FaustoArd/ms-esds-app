package com.lord.distanceservice.model;

import java.util.ArrayList;

public class DistanceMatrixResponse {
	
	private ArrayList<String> destination_addresses;
	
	private ArrayList<String> origin_addresses;
	
	private ArrayList<DistanceMatrixRow> rows;
	
	private DistanceMatrixStatus status;
	
	private String error_message;

	public ArrayList<String> getDestination_addresses() {
		return destination_addresses;
	}

	public void setDestination_addresses(ArrayList<String> destination_addresses) {
		this.destination_addresses = destination_addresses;
	}

	public ArrayList<String> getOrigin_addresses() {
		return origin_addresses;
	}

	public void setOrigin_addresses(ArrayList<String> origin_addresses) {
		this.origin_addresses = origin_addresses;
	}

	public ArrayList<DistanceMatrixRow> getRows() {
		return rows;
	}

	public void setRows(ArrayList<DistanceMatrixRow> rows) {
		this.rows = rows;
	}

	public DistanceMatrixStatus getStatus() {
		return status;
	}

	public void setStatus(DistanceMatrixStatus status) {
		this.status = status;
	}

	public String getError_message() {
		return error_message;
	}

	public void setError_message(String error_message) {
		this.error_message = error_message;
	}
	
	
	
	
}

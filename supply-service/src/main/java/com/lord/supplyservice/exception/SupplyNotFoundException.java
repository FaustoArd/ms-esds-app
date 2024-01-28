package com.lord.supplyservice.exception;

public class SupplyNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SupplyNotFoundException(String message) {
		super(message);
	}
}

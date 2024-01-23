package com.lord.providerservice.exception;

public class ProviderNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProviderNotFoundException(String message) {
		super(message);
	}
}

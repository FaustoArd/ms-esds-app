package com.lord.addressservice.service;

import com.lord.addressservice.dto.AddressResponse;

public interface AddressService {

	public AddressResponse getByProviderId(Long providerId);
}

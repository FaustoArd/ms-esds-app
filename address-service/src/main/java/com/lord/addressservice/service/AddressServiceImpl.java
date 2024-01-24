package com.lord.addressservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.addressservice.dao.AddressDao;
import com.lord.addressservice.dto.AddressResponse;
import com.lord.addressservice.mapper.AddressMapper;
import com.lord.addressservice.model.Address;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private final AddressDao addressDao;
	
	@Autowired
	private final AddressMapper addressMapper;
	
	public AddressServiceImpl(AddressDao addressServiceDao, AddressMapper addressMapper) {
		this.addressDao = addressServiceDao;
		this.addressMapper = addressMapper;
	}

	@Override
	public AddressResponse getByProviderId(Long providerId) {
		Address address = addressDao.findByProviderId(providerId);
		return addressMapper.toResponse(address);
	}
}


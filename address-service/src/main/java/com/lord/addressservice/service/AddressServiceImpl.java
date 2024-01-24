package com.lord.addressservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.addressservice.dto.AddressResponse;
import com.lord.addressservice.mapper.AddressMapper;
import com.lord.addressservice.model.Address;
import com.lord.addressservice.service_dao.AddressServiceDao;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private final AddressServiceDao addressServiceDao;
	
	@Autowired
	private final AddressMapper addressMapper;
	
	public AddressServiceImpl(AddressServiceDao addressServiceDao, AddressMapper addressMapper) {
		this.addressServiceDao = addressServiceDao;
		this.addressMapper = addressMapper;
	}

	@Override
	public AddressResponse getByProviderId(Long providerId) {
		Address address = addressServiceDao.findByProviderId(providerId);
		return addressMapper.toResponse(address);
	}
}


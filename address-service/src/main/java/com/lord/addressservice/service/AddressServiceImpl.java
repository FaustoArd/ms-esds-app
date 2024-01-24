package com.lord.addressservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.addressservice.dao.AddressDao;
import com.lord.addressservice.dto.AddressDto;
import com.lord.addressservice.dto.AddressResponse;
import com.lord.addressservice.mapper.AddressMapper;
import com.lord.addressservice.model.Address;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private final AddressDao addressDao;
	
	@Autowired
	private final AddressMapper addressMapper;
	
	private static final Logger log = LoggerFactory.getLogger(AddressServiceImpl.class);
	
	public AddressServiceImpl(AddressDao addressServiceDao, AddressMapper addressMapper) {
		this.addressDao = addressServiceDao;
		this.addressMapper = addressMapper;
	}

	@Override
	public AddressResponse getByProviderId(Long providerId) {
		log.info("Get provider by id");
		Address address = addressDao.findByProviderId(providerId);
		return addressMapper.addressToResponse(address);
	}

	@Override
	public AddressResponse saveAddress(AddressDto addressDto) {
		log.info("Save address");
	Address address = addressMapper.dtoToAddress(addressDto);
	Address savedAddress = addressDao.save(address);
	return addressMapper.addressToResponse(savedAddress);
	}
}


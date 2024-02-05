package com.lord.enterpriseservice.service;

import java.util.List;

import com.lord.enterpriseservice.dto.EnterpriseCreateResponse;
import com.lord.enterpriseservice.dto.EnterpriseDto;
import com.lord.enterpriseservice.dto.EnterpriseResponse;
import com.lord.enterpriseservice.model.Address;

public interface EnterpriseService {

	public EnterpriseCreateResponse createEnterprise(EnterpriseDto enterpriseDto);
	
	public EnterpriseResponse findEnterpriseById(Long id);
	
	public List<EnterpriseResponse> findEnterprisesByUserId(Long id);
	
	public Address createAddress(Address address);
	
	public Address findAddress(Long addressId);
}

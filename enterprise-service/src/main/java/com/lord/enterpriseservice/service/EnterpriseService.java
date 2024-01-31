package com.lord.enterpriseservice.service;

import com.lord.enterpriseservice.dto.EnterpriseDto;
import com.lord.enterpriseservice.dto.EnterpriseResponse;
import com.lord.enterpriseservice.model.Address;

public interface EnterpriseService {

	public String saveEnterprise(EnterpriseDto enterpriseDto);
	
	public EnterpriseResponse findEnterpriseById(Long id);
	
	public String saveAddress(Address address);
}

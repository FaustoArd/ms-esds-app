package com.lord.enterpriseservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.enterpriseservice.dao.EnterpriseDao;
import com.lord.enterpriseservice.dto.EnterpriseDto;
import com.lord.enterpriseservice.dto.EnterpriseResponse;
import com.lord.enterpriseservice.model.Address;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {
	
	@Autowired
	private final EnterpriseDao enterpriseDao;

	public EnterpriseServiceImpl(EnterpriseDao enterpriseDao) {
		this.enterpriseDao = enterpriseDao;
	}

	@Override
	public String saveEnterprise(EnterpriseDto enterpriseDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EnterpriseResponse findEnterpriseById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveAddress(Address address) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

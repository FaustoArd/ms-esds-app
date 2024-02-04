package com.lord.enterpriseservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.enterpriseservice.exception.EnterpriseNotFoundException;
import com.lord.enterpriseservice.model.Enterprise;
import com.lord.enterpriseservice.repository.EnterpriseRepository;

@Service
public class EnterpriseDaoImpl implements EnterpriseDao {

	
	@Autowired
	private final EnterpriseRepository enterpriseRepository;
	
	private static final String enterpriseNotFound = "Enterprise not found";
	
	public EnterpriseDaoImpl(EnterpriseRepository enterpriseRepository) {
		this.enterpriseRepository = enterpriseRepository;
	}

	@Override
	public Enterprise save(Enterprise enterprise) {
		return enterpriseRepository.save(enterprise);
	}

	@Override
	public Enterprise findById(Long id) {
		return enterpriseRepository.findById(id).orElseThrow(()-> new EnterpriseNotFoundException(enterpriseNotFound));
	}

	@Override
	public List<Enterprise> findAll() {
		return (List<Enterprise>)enterpriseRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		if(enterpriseRepository.existsById(id)) {
			enterpriseRepository.deleteById(id);
		}else {
			throw new EnterpriseNotFoundException(enterpriseNotFound);
		}
		
	}

	@Override
	public List<Enterprise> findByUserId(Long id) {
		return enterpriseRepository.findEnterpriseByUserId(id);
	}

}

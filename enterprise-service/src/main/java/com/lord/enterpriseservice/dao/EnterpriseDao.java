package com.lord.enterpriseservice.dao;

import java.util.List;

import com.lord.enterpriseservice.model.Enterprise;

public interface EnterpriseDao {
	
	public Enterprise save(Enterprise enterprise);
	
	public Enterprise findById(Long id);
	
	public List<Enterprise> findAll();
	
	public void deleteById(Long id);

}

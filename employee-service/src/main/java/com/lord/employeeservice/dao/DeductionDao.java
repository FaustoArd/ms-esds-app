package com.lord.employeeservice.dao;

import java.util.List;

import com.lord.employeeservice.model.Deduction;
import com.lord.employeeservice.model.JobRole;

public interface DeductionDao {
	
	public Deduction save(Deduction deduction);
	
	public Deduction findById(Long id);

	public List<Deduction> findAll();
	
	public void deleteById(Long id);
	
	public Deduction findByJobRole(JobRole jobRole);
	
	public List<Deduction> findByEnterpriseId(Long enterpriseId);

}

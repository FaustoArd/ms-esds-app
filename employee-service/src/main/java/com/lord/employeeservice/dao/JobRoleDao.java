package com.lord.employeeservice.dao;

import java.util.List;

import com.lord.employeeservice.model.JobRole;

public interface JobRoleDao {
public JobRole save(JobRole jobRole);
	
	public JobRole findById(Long id);

	public List<JobRole> findAll();
	
	public void deleteById(Long id);
}

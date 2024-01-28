package com.lord.employeeservice.dao;

import java.util.List;

import com.lord.employeeservice.exception.ItemNotFoundException;
import com.lord.employeeservice.model.JobRole;
import com.lord.employeeservice.repository.JobRoleRepository;

public class JobRoleDaoImpl implements ServiceDao<JobRole> {

	private final JobRoleRepository jobRoleRepository;

	private static final String jobRoleNotFound = "JobRole not found";

	public JobRoleDaoImpl(JobRoleRepository jobRoleRepository) {
		super();
		this.jobRoleRepository = jobRoleRepository;
	}

	@Override
	public JobRole save(JobRole jobRole) {
		return jobRoleRepository.save(jobRole);
	}

	@Override
	public JobRole findyId(Long id) {
		return jobRoleRepository.findById(id).orElseThrow(() -> new ItemNotFoundException(jobRoleNotFound));
	}

	@Override
	public List<JobRole> findAll() {
		return (List<JobRole>) jobRoleRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		if (jobRoleRepository.existsById(id)) {
			jobRoleRepository.deleteById(id);
		} else {
			throw new ItemNotFoundException(jobRoleNotFound);
		}

	}

}

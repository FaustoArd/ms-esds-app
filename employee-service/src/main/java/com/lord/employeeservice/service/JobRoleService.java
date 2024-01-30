package com.lord.employeeservice.service;

import java.util.List;

import com.lord.employeeservice.dto.JobRoleDto;
import com.lord.employeeservice.dto.JobRoleResponse;

public interface JobRoleService {
	
	public String createJobRole(JobRoleDto jobRoleDto);
	
	public JobRoleResponse findJobRoleById(Long id);
	
	public List<JobRoleResponse> findallJobRoles();
}

package com.lord.employeeservice.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.employeeservice.dao.JobRoleDao;

import com.lord.employeeservice.dto.JobRoleDto;
import com.lord.employeeservice.dto.JobRoleResponse;
import com.lord.employeeservice.mapper.JobRoleMapper;
import com.lord.employeeservice.model.JobRole;

@Service
public class JobRoleServiceImpl implements JobRoleService {

	@Autowired
	private final JobRoleDao jobRoleDao;
	
	private static final Logger log = LoggerFactory.getLogger(JobRoleServiceImpl.class);	
	public JobRoleServiceImpl(JobRoleDao jobRoleDao) {
		this.jobRoleDao = jobRoleDao;
	}

	@Override
	public String createJobRole(JobRoleDto jobRoleDto) {
		log.info("Create Job Role");
		JobRole jobRole = JobRoleMapper.INSTANCE.dtoToJobRole(jobRoleDto);
		JobRole savedJobRole = jobRoleDao.save(jobRole);
		log.info("Job Role saved sucessfully: " + savedJobRole.getRole());
		return savedJobRole.getRole();
	}

	@Override
	public JobRoleResponse findJobRoleById(Long id) {
		log.info("Find Job Role");
		JobRole jobRole = jobRoleDao.findById(id);
		return JobRoleMapper.INSTANCE.jobRoleToResponse(jobRole);
	}

	@Override
	public List<JobRoleResponse> findallJobRoles() {
		log.info("Find all job roles");
		List<JobRole> jobRoles = jobRoleDao.findAll();
		return JobRoleMapper.INSTANCE.jobRolesToResponses(jobRoles);
		
	}

}

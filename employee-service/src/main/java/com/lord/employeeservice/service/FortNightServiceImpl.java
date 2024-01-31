package com.lord.employeeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.employeeservice.dao.DeductionDao;
import com.lord.employeeservice.dao.DeductionDaoImpl;
import com.lord.employeeservice.dao.EmployeeDao;
import com.lord.employeeservice.dao.FortNightDao;
import com.lord.employeeservice.dao.FortNightDaoImpl;
import com.lord.employeeservice.dao.JobRoleDao;

import com.lord.employeeservice.dto.FortNightDto;
import com.lord.employeeservice.dto.FortNightResponse;
import com.lord.employeeservice.model.Deduction;
import com.lord.employeeservice.model.Employee;
import com.lord.employeeservice.model.Fortnight;
import com.lord.employeeservice.model.JobRole;

@Service
public class FortNightServiceImpl implements ForthNightService {
	
	@Autowired
	private final FortNightDao fortNightDao;
	
	@Autowired
	private final JobRoleDao jobRoleDao;
	
	 @Autowired
	private final DeductionDao deductionDao;
	 
	 @Autowired
	 private final EmployeeDao employeeDao;
	
	public FortNightServiceImpl(FortNightDao fortNightDao,JobRoleDao jobRoleDao,DeductionDao deductionDao, EmployeeDao employeeDao) {
		this.fortNightDao = fortNightDao;
		this.jobRoleDao = jobRoleDao;
		this.deductionDao = deductionDao;
		this.employeeDao = employeeDao;
	}

	@Override
	public FortNightResponse createForthNight(FortNightDto fortNightDto) {
		Employee employee = employeeDao.findById(fortNightDto.getEmployeeId());
		JobRole jobRole = new JobRole();
		jobRole.setId(employee.getJobRole().getId());
		Deduction deduction = deductionDao.findByJobRole(jobRole);
		
		return new FortNightResponse();
	}

	@Override
	public Fortnight calculate(FortNightDto fortNightDto) {
		
	}

}

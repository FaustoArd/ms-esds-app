package com.lord.employeeservice.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.employeeservice.dao.EmployeeDao;
import com.lord.employeeservice.dao.JobRoleDao;

import com.lord.employeeservice.dto.EmployeeDto;
import com.lord.employeeservice.dto.EmployeeResponse;
import com.lord.employeeservice.mapper.EmployeeMapper;
import com.lord.employeeservice.model.Employee;
import com.lord.employeeservice.model.JobRole;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private final EmployeeDao employeeDao;
	
	@Autowired
	private final JobRoleDao jobRoleDao;
	
	private static final Logger log = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	public EmployeeServiceImpl(EmployeeDao employeeDao,JobRoleDao jobRoleDao) {
		this.employeeDao = employeeDao;
		this.jobRoleDao = jobRoleDao;
		
	}
	
	@Override
	public String createEmployee(EmployeeDto employeeDto) {
		log.info("Create employee");
		Employee employee = EmployeeMapper.INSTANCE.dtoToEmployee(employeeDto);
		JobRole jobRole = jobRoleDao.findById(employeeDto.getJobRoleId());
		employee.setJobRole(jobRole);
		Employee savedEmployee = employeeDao.save(employee);
		log.info("Employee saved sucessfully: " + savedEmployee.getName());
		return savedEmployee.getName()  + " " + savedEmployee.getLastname();
	}
	
	@Override
	public EmployeeResponse findEmployeeById(Long id) {
		log.info("Find employee");
		Employee employee = employeeDao.findById(id);
		return EmployeeMapper.INSTANCE.employeeToEmployeeResponse(employee);
	}

	@Override
	public List<EmployeeResponse> findAllEmployees() {
		log.info("Find all employees");
		List<Employee> employees = employeeDao.findAll();
		return EmployeeMapper.INSTANCE.employeesToResponses(employees);
	}

	@Override
	public List<EmployeeResponse> findByEnterpriseId(Long enterpriseId) {
		List<Employee> employees = employeeDao.findByEnterpriseId(enterpriseId);
		return EmployeeMapper.INSTANCE.employeesToResponses(employees);
	}

	

	

	

}

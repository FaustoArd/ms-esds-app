package com.lord.employeeservice.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.employeeservice.dao.ServiceDao;
import com.lord.employeeservice.dto.DeductionDto;
import com.lord.employeeservice.dto.DeductionResponse;
import com.lord.employeeservice.dto.EmployeeDto;
import com.lord.employeeservice.dto.EmployeeResponse;
import com.lord.employeeservice.dto.JobRoleDto;
import com.lord.employeeservice.dto.JobRoleResponse;
import com.lord.employeeservice.mapper.DeductionMapper;
import com.lord.employeeservice.mapper.EmployeeMapper;
import com.lord.employeeservice.mapper.JobRoleMapper;
import com.lord.employeeservice.model.Deduction;
import com.lord.employeeservice.model.Employee;
import com.lord.employeeservice.model.JobRole;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private final ServiceDao<Employee> employeeDao;
	
	@Autowired
	private final ServiceDao<JobRole> jobRoleDao;
	
	@Autowired
	private final ServiceDao<Deduction> deductionDao;
	
	private static final Logger log = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	public EmployeeServiceImpl(ServiceDao<Employee> employeeDao,ServiceDao<JobRole> jobRoleDao,ServiceDao<Deduction> deductionDao) {
		this.employeeDao = employeeDao;
		this.jobRoleDao = jobRoleDao;
		this.deductionDao = deductionDao;
	}
	
	@Override
	public String createEmployee(EmployeeDto employeeDto) {
		log.info("Create employee");
		Employee employee = EmployeeMapper.INSTANCE.dtoToEmployee(employeeDto);
		JobRole jobRole = jobRoleDao.findyId(employeeDto.getJobRoleId());
		employee.setJobRole(jobRole);
		Employee savedEmployee = employeeDao.save(employee);
		log.info("Employee saved sucessfully: " + savedEmployee.getName());
		return savedEmployee.getName()  + " " + savedEmployee.getLastname();
	}
	
	@Override
	public String createJobRole(JobRoleDto jobRoleDto) {
		log.info("Create Job Role");
		JobRole jobRole = JobRoleMapper.INSTANCE.dtoToJobRole(jobRoleDto);
		JobRole savedJobRole = jobRoleDao.save(jobRole);
		log.info("Employee saved sucessfully: " + savedJobRole.getRole());
		return savedJobRole.getRole();
	}

	@Override
	public String createDeduction(DeductionDto deductionDto) {
		log.info("Create Deduction");
		Deduction deduction = DeductionMapper.INSTANCE.dtoToDeduction(deductionDto);
		JobRole jobRole = jobRoleDao.findyId(deductionDto.getJobRoleId());
		deduction.setJobRole(jobRole);
		Deduction savedDeduction = deductionDao.save(deduction);
		log.info("Deduction saved sucessfully");
		return savedDeduction.getJobRole().getRole();
	}

	@Override
	public EmployeeResponse findEmployeeById(Long id) {
		log.info("Find employee");
		Employee employee = employeeDao.findyId(id);
		return EmployeeMapper.INSTANCE.employeeToEmployeeResponse(employee);
	}

	@Override
	public JobRoleResponse findJobRoleById(Long id) {
		log.info("Find Job Role");
		JobRole jobRole = jobRoleDao.findyId(id);
		return JobRoleMapper.INSTANCE.jobRoleToResponse(jobRole);
	}

	@Override
	public DeductionResponse findDeductionbyId(Long id) {
		log.info("Find deduction");
		Deduction deduction = deductionDao.findyId(id);
		return DeductionMapper.INSTANCE.deductionToResponse(deduction);
	}

	@Override
	public List<EmployeeResponse> findAllEmployees() {
		log.info("Find all employees");
		List<Employee> employees = employeeDao.findAll();
		return EmployeeMapper.INSTANCE.employeesToResponses(employees);
	}

	@Override
	public List<JobRoleResponse> findallJobRoles() {
		log.info("Find all job roles");
		List<JobRole> jobRoles = jobRoleDao.findAll();
		return JobRoleMapper.INSTANCE.jobRolesToResponses(jobRoles);
		
	}

	@Override
	public List<DeductionResponse> findAllDeductions() {
		log.info("Find all deductions");
		List<Deduction> deductions = deductionDao.findAll();
		return DeductionMapper.INSTANCE.deductionsToResponses(deductions);
	}

	

}

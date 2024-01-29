package com.lord.employeeservice.service;

import java.util.List;
import com.lord.employeeservice.dto.DeductionDto;
import com.lord.employeeservice.dto.DeductionResponse;
import com.lord.employeeservice.dto.EmployeeDto;
import com.lord.employeeservice.dto.EmployeeResponse;
import com.lord.employeeservice.dto.JobRoleDto;
import com.lord.employeeservice.dto.JobRoleResponse;

public interface EmployeeService {
	
	public String createEmployee(EmployeeDto employeeDto); 
	
	public String createJobRole(JobRoleDto jobRoleDto);
	
	public String createDeduction(DeductionDto deductionDto);
	
	public EmployeeResponse findEmployeeById(Long id);
	
	public JobRoleResponse findJobRoleById(Long id);
	
	public DeductionResponse findDeductionbyId(Long id);
	
	public List<EmployeeResponse> findAllEmployees();
	
	public List<JobRoleResponse> findallJobRoles();
	
	public List<DeductionResponse> findAllDeductions();

}

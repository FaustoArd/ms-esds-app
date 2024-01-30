package com.lord.employeeservice.service;

import java.util.List;
import com.lord.employeeservice.dto.EmployeeDto;
import com.lord.employeeservice.dto.EmployeeResponse;


public interface EmployeeService {
	
	public String createEmployee(EmployeeDto employeeDto); 
	
	public EmployeeResponse findEmployeeById(Long id);
	
	public List<EmployeeResponse> findAllEmployees();
	
	
	


}

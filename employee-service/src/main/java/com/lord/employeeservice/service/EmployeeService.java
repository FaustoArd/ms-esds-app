package com.lord.employeeservice.service;

import com.lord.employeeservice.dto.EmployeeDto;
import com.lord.employeeservice.dto.EmployeeResponse;

public interface EmployeeService {
	
	public String createEmployee(EmployeeDto employeeDto); 
	
	public EmployeeResponse findById(Long id);

}

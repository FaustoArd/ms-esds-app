package com.lord.employeeservice.dao;

import java.util.List;

import com.lord.employeeservice.model.Employee;

public interface EmployeeDao {
public Employee save(Employee employee);
	
	public Employee findById(Long id);

	public List<Employee> findAll();
	
	public void deleteById(Long id);
	
	public List<Employee> findByEnterpriseId(Long enterpriseId);
}

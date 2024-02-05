package com.lord.employeeservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.lord.employeeservice.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	public List<Employee> findByEnterpriseId(Long enterpriseId);
}

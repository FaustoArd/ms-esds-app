package com.lord.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lord.employeeservice.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

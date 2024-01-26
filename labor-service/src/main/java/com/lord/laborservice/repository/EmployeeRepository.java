package com.lord.laborservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lord.laborservice.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

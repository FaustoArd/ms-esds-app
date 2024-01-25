package com.lord.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lord.employeeservice.model.JobRole;

public interface JobRoleRepository extends JpaRepository<JobRole, Long> {

}

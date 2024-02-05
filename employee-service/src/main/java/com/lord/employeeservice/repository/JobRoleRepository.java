package com.lord.employeeservice.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.lord.employeeservice.model.JobRole;

public interface JobRoleRepository extends JpaRepository<JobRole, Long> {

	public List<JobRole> findByEnterpriseId(Long enterpriseId);
}

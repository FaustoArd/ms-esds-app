package com.lord.employeeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lord.employeeservice.dao.DeductionDao;
import com.lord.employeeservice.dao.EmployeeDao;
import com.lord.employeeservice.dao.JobRoleDao;
import com.lord.employeeservice.service.ForthNightService;

@SpringBootTest
public class FortNightServiceTest {
	
	@Autowired
	private ForthNightService forthNightService;
	
	@Autowired
	private JobRoleDao jobRoleDao;
	
	@Autowired
	private EmployeeDao employeeDao;
	
	private DeductionDao deductionDao;
	
	void setup() {
		
		
	}

}

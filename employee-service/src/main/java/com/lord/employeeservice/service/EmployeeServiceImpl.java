package com.lord.employeeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.employeeservice.dao.ServiceDao;
import com.lord.employeeservice.dto.EmployeeDto;
import com.lord.employeeservice.dto.EmployeeResponse;
import com.lord.employeeservice.mapper.EmployeeMapper;
import com.lord.employeeservice.model.Employee;
import com.lord.employeeservice.model.JobRole;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private final ServiceDao<Employee> employeeDao;
	
	@Autowired
	private final ServiceDao<JobRole> jobRoleDao;
	
	public EmployeeServiceImpl(ServiceDao<Employee> employeeDao,ServiceDao<JobRole> jobRoleDao) {
		this.employeeDao = employeeDao;
		this.jobRoleDao = jobRoleDao;
	}
	
	@Override
	public String createEmployee(EmployeeDto employeeDto) {
		Employee employee = EmployeeMapper.INSTANCE.dtoToEmployee(employeeDto);
		Employee savedEmployee = employeeDao.save(employee);
		return savedEmployee.getName()  + " " + savedEmployee.getLastname();
	}

	@Override
	public EmployeeResponse findById(Long id) {
		Employee employee = employeeDao.findyId(id);
		return EmployeeMapper.INSTANCE.employeeToEmployeeResponse(employee);
	}

}

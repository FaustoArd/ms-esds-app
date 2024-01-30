package com.lord.employeeservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.employeeservice.exception.ItemNotFoundException;
import com.lord.employeeservice.model.Employee;
import com.lord.employeeservice.repository.EmployeeRepository;

@Service
public class EmployeeDaoImpl implements ServiceDao<Employee> {
	
	@Autowired
	private final EmployeeRepository employeeRepository;
	
	private static final String employeeNotFound ="Employee not found";

	public EmployeeDaoImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee findyId(Long id) {
		return employeeRepository.findById(id).orElseThrow(()-> new ItemNotFoundException(employeeNotFound));
	}

	@Override
	public List<Employee> findAll() {
	return (List<Employee>)employeeRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		if(employeeRepository.existsById(id)) {
			employeeRepository.deleteById(id);
		}else {
			throw new ItemNotFoundException(employeeNotFound);
		}
		
	}

}

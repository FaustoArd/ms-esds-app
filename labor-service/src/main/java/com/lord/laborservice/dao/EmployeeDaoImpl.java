package com.lord.laborservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.laborservice.exception.ItemNotFoundException;
import com.lord.laborservice.model.Employee;
import com.lord.laborservice.repository.EmployeeRepository;

@Service
public class EmployeeDaoImpl implements ServiceDao<Employee> {
	
	@Autowired
	private final EmployeeRepository employeeRepository;
	
	private static final String itemNotFound = "Item not found";
	
	public EmployeeDaoImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> findAll() {
		return (List<Employee>)employeeRepository.findAll();
	}

	@Override
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee findById(Long id) {
		return employeeRepository.findById(id).orElseThrow(()-> new ItemNotFoundException(itemNotFound));
	}

	@Override
	public void deleteById(Long id) throws ItemNotFoundException {
		if(employeeRepository.existsById(id)) {
			employeeRepository.deleteById(id);
		}else {
			throw new ItemNotFoundException(itemNotFound);
		}
		
	}

	

}

package com.lord.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.lord.employeeservice.dto.EmployeeDto;
import com.lord.employeeservice.dto.EmployeeResponse;
import com.lord.employeeservice.service.EmployeeService;



@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private final EmployeeService employeeService;
	
	private static final Gson gson = new Gson();
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@PostMapping("/employee_create")
	ResponseEntity<String> createEmployee(@RequestBody EmployeeDto employeeDto){
		String response = employeeService.createEmployee(employeeDto);
		return new ResponseEntity<String>(gson.toJson(response),HttpStatus.CREATED);
	}
	
	
	
	@GetMapping("/employee_all")
	ResponseEntity<List<EmployeeResponse>> findAllEmployees(){
		List<EmployeeResponse> responses = employeeService.findAllEmployees();
		return ResponseEntity.ok(responses);
	}
	
	@GetMapping("/employee_by_id/{id}")
	ResponseEntity<EmployeeResponse> findEmployeeById(@PathVariable("id")Long id){
		EmployeeResponse response = employeeService.findEmployeeById(id);
		return ResponseEntity.ok(response);
	}
	
}

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
import com.lord.employeeservice.dto.JobRoleDto;
import com.lord.employeeservice.dto.JobRoleResponse;
import com.lord.employeeservice.service.JobRoleService;

@RestController
@RequestMapping("/api/employee")
public class JobRoleController {
	
	@Autowired
	private final JobRoleService jobRoleService;
	
	private static final Gson gson = new Gson();
	
	public JobRoleController(JobRoleService jobRoleService) {
		this.jobRoleService = jobRoleService;
	}

	@PostMapping("/job_role_create")
	ResponseEntity<String> createJobRole(@RequestBody JobRoleDto jobRoleDto){
		String response = jobRoleService.createJobRole(jobRoleDto);
		return new ResponseEntity<String>(gson.toJson(response),HttpStatus.CREATED);
	} 
	
	@GetMapping("/job_role_all")
	ResponseEntity<List<JobRoleResponse>> findAllJobRoles(){
		List<JobRoleResponse> responses = jobRoleService.findallJobRoles();
		return ResponseEntity.ok(responses);
	}
	
	@GetMapping("/job_role_by_id/{id}")
	ResponseEntity<JobRoleResponse> findJobRoleById(@PathVariable("id")Long id){
		JobRoleResponse response = jobRoleService.findJobRoleById(id);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/job_role_by_enterprise_id/{enterpriseId}")
	ResponseEntity<List<JobRoleResponse>> findEnterpriseById(@PathVariable("enterpriseId")Long enterpriseId){
		List<JobRoleResponse> responses = jobRoleService.findByEnterpriseId(enterpriseId);
		return ResponseEntity.ok(responses);
	}

}

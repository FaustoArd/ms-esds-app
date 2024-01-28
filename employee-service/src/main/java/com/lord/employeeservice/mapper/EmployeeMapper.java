package com.lord.employeeservice.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.lord.employeeservice.dto.EmployeeDto;
import com.lord.employeeservice.dto.EmployeeResponse;
import com.lord.employeeservice.model.Employee;

@Mapper
public interface EmployeeMapper {
	
	public static final EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
	
	@Mapping(target="jobRole", source="jobRole.role")
	@Mapping(target = "jobRoleId", source = "jobRole.id")
	public EmployeeResponse employeeToEmployeeResponse(Employee employee); 
	
	@Mapping(target = "jobRole.role", source = "jobRole")
	@Mapping(target="jobRole.id", source="jobRoleId")
	public Employee dtoToEmployee(EmployeeDto employeeDto);
	
	public List<EmployeeResponse> employeesToResponses(List<Employee> employees);

}

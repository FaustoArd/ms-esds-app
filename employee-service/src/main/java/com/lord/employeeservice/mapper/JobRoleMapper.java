package com.lord.employeeservice.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.lord.employeeservice.dto.JobRoleDto;
import com.lord.employeeservice.dto.JobRoleResponse;
import com.lord.employeeservice.model.JobRole;

@Mapper
public interface JobRoleMapper {

	public static final JobRoleMapper INSTANCE = Mappers.getMapper(JobRoleMapper.class);
	
	
	public JobRole dtoToJobRole(JobRoleDto jobRoleDto);
	
	public JobRoleResponse jobRoleToResponse(JobRole jobRole);
	
	public List<JobRoleResponse> jobRolesToResponses(List<JobRole> jobRoles);
}

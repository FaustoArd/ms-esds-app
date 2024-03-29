package com.lord.employeeservice.mapper;

import com.lord.employeeservice.dto.JobRoleDto;
import com.lord.employeeservice.dto.JobRoleResponse;
import com.lord.employeeservice.model.JobRole;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-01T00:16:43-0300",
    comments = "version: 1.6.0.Beta1, compiler: Eclipse JDT (IDE) 3.34.0.v20230523-1233, environment: Java 17.0.7 (Oracle Corporation)"
)
public class JobRoleMapperImpl implements JobRoleMapper {

    @Override
    public JobRole dtoToJobRole(JobRoleDto jobRoleDto) {
        if ( jobRoleDto == null ) {
            return null;
        }

        JobRole jobRole = new JobRole();

        jobRole.setEnterpriseId( jobRoleDto.getEnterpriseId() );
        jobRole.setHoliday( jobRoleDto.getHoliday() );
        jobRole.setHolidayDayPercentage( jobRoleDto.getHolidayDayPercentage() );
        jobRole.setId( jobRoleDto.getId() );
        jobRole.setPayHour( jobRoleDto.getPayHour() );
        jobRole.setPrizePercentage( jobRoleDto.getPrizePercentage() );
        jobRole.setRole( jobRoleDto.getRole() );

        return jobRole;
    }

    @Override
    public JobRoleResponse jobRoleToResponse(JobRole jobRole) {
        if ( jobRole == null ) {
            return null;
        }

        JobRoleResponse jobRoleResponse = new JobRoleResponse();

        jobRoleResponse.setHoliday( jobRole.getHoliday() );
        jobRoleResponse.setHolidayDayPercentage( jobRole.getHolidayDayPercentage() );
        jobRoleResponse.setId( jobRole.getId() );
        jobRoleResponse.setPayHour( jobRole.getPayHour() );
        jobRoleResponse.setPrizePercentage( jobRole.getPrizePercentage() );
        jobRoleResponse.setRole( jobRole.getRole() );

        return jobRoleResponse;
    }

    @Override
    public List<JobRoleResponse> jobRolesToResponses(List<JobRole> jobRoles) {
        if ( jobRoles == null ) {
            return null;
        }

        List<JobRoleResponse> list = new ArrayList<JobRoleResponse>( jobRoles.size() );
        for ( JobRole jobRole : jobRoles ) {
            list.add( jobRoleToResponse( jobRole ) );
        }

        return list;
    }
}

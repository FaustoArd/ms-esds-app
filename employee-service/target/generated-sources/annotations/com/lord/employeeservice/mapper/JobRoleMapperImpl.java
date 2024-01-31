package com.lord.employeeservice.mapper;

import com.lord.employeeservice.dto.JobRoleDto;
import com.lord.employeeservice.dto.JobRoleResponse;
import com.lord.employeeservice.model.JobRole;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-30T22:46:37-0300",
    comments = "version: 1.6.0.Beta1, compiler: Eclipse JDT (IDE) 3.34.0.v20230523-1233, environment: Java 17.0.7 (Oracle Corporation)"
)
public class JobRoleMapperImpl implements JobRoleMapper {

    @Override
    public JobRole dtoToJobRole(JobRoleDto jobRoleDto) {
        if ( jobRoleDto == null ) {
            return null;
        }

        JobRole jobRole = new JobRole();

        jobRole.setId( jobRoleDto.getId() );
        jobRole.setRole( jobRoleDto.getRole() );
        jobRole.setPayHour( jobRoleDto.getPayHour() );
        jobRole.setPayExtraHour50( jobRoleDto.getPayExtraHour50() );
        jobRole.setPayExtraHour100( jobRoleDto.getPayExtraHour100() );
        jobRole.setPrize( jobRoleDto.getPrize() );
        jobRole.setHoliday( jobRoleDto.getHoliday() );

        return jobRole;
    }

    @Override
    public JobRoleResponse jobRoleToResponse(JobRole jobRole) {
        if ( jobRole == null ) {
            return null;
        }

        JobRoleResponse jobRoleResponse = new JobRoleResponse();

        jobRoleResponse.setId( jobRole.getId() );
        jobRoleResponse.setRole( jobRole.getRole() );
        jobRoleResponse.setPayHour( jobRole.getPayHour() );
        jobRoleResponse.setPayExtraHour50( jobRole.getPayExtraHour50() );
        jobRoleResponse.setPayExtraHour100( jobRole.getPayExtraHour100() );
        jobRoleResponse.setPrize( jobRole.getPrize() );
        jobRoleResponse.setHoliday( jobRole.getHoliday() );

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

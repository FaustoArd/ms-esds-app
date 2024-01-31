package com.lord.employeeservice.mapper;

import com.lord.employeeservice.dto.EmployeeDto;
import com.lord.employeeservice.dto.EmployeeResponse;
import com.lord.employeeservice.model.Employee;
import com.lord.employeeservice.model.JobRole;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-31T13:21:32-0300",
    comments = "version: 1.6.0.Beta1, compiler: Eclipse JDT (IDE) 3.34.0.v20230523-1233, environment: Java 17.0.7 (Oracle Corporation)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeResponse employeeToEmployeeResponse(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeResponse employeeResponse = new EmployeeResponse();

        employeeResponse.setJobRole( employeeJobRoleRole( employee ) );
        employeeResponse.setJobRoleId( employeeJobRoleId( employee ) );
        employeeResponse.setDni( employee.getDni() );
        employeeResponse.setEmail( employee.getEmail() );
        employeeResponse.setId( employee.getId() );
        employeeResponse.setLastname( employee.getLastname() );
        employeeResponse.setName( employee.getName() );
        employeeResponse.setPhone( employee.getPhone() );

        return employeeResponse;
    }

    @Override
    public Employee dtoToEmployee(EmployeeDto employeeDto) {
        if ( employeeDto == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setJobRole( employeeDtoToJobRole( employeeDto ) );
        employee.setDni( employeeDto.getDni() );
        employee.setEmail( employeeDto.getEmail() );
        employee.setId( employeeDto.getId() );
        employee.setLastname( employeeDto.getLastname() );
        employee.setName( employeeDto.getName() );
        employee.setPhone( employeeDto.getPhone() );

        return employee;
    }

    @Override
    public List<EmployeeResponse> employeesToResponses(List<Employee> employees) {
        if ( employees == null ) {
            return null;
        }

        List<EmployeeResponse> list = new ArrayList<EmployeeResponse>( employees.size() );
        for ( Employee employee : employees ) {
            list.add( employeeToEmployeeResponse( employee ) );
        }

        return list;
    }

    private String employeeJobRoleRole(Employee employee) {
        JobRole jobRole = employee.getJobRole();
        if ( jobRole == null ) {
            return null;
        }
        return jobRole.getRole();
    }

    private Long employeeJobRoleId(Employee employee) {
        JobRole jobRole = employee.getJobRole();
        if ( jobRole == null ) {
            return null;
        }
        return jobRole.getId();
    }

    protected JobRole employeeDtoToJobRole(EmployeeDto employeeDto) {
        if ( employeeDto == null ) {
            return null;
        }

        JobRole jobRole = new JobRole();

        jobRole.setRole( employeeDto.getJobRole() );
        jobRole.setId( employeeDto.getJobRoleId() );

        return jobRole;
    }
}

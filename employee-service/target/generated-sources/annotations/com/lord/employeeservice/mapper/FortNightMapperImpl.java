package com.lord.employeeservice.mapper;

import com.lord.employeeservice.dto.FortNightDto;
import com.lord.employeeservice.dto.FortNightResponse;
import com.lord.employeeservice.model.Employee;
import com.lord.employeeservice.model.Fortnight;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-31T13:21:32-0300",
    comments = "version: 1.6.0.Beta1, compiler: Eclipse JDT (IDE) 3.34.0.v20230523-1233, environment: Java 17.0.7 (Oracle Corporation)"
)
public class FortNightMapperImpl implements FortNightMapper {

    @Override
    public Fortnight dtoToFortNight(FortNightDto fortNightDto) {
        if ( fortNightDto == null ) {
            return null;
        }

        Fortnight fortnight = new Fortnight();

        fortnight.setEmployee( fortNightDtoToEmployee( fortNightDto ) );
        fortnight.setId( fortNightDto.getId() );
        fortnight.setHours( fortNightDto.getHours() );
        fortnight.setExtrasNumber( fortNightDto.getExtrasNumber() );

        return fortnight;
    }

    @Override
    public FortNightResponse fortNightToResponse(Fortnight fortnight) {
        if ( fortnight == null ) {
            return null;
        }

        FortNightResponse fortNightResponse = new FortNightResponse();

        fortNightResponse.setEmployeeName( FortNightMapper.getEmployeeNameAndLastname( fortnight ) );
        fortNightResponse.setEmployeeId( fortnightEmployeeId( fortnight ) );
        fortNightResponse.setBonificationDiscount( fortnight.getBonificationDiscount() );
        fortNightResponse.setExtras( fortnight.getExtras() );
        fortNightResponse.setFreeDayDiscount( fortnight.getFreeDayDiscount() );
        fortNightResponse.setHours( fortnight.getHours() );
        fortNightResponse.setInss( fortnight.getInss() );
        fortNightResponse.setInsurance( fortnight.getInsurance() );
        fortNightResponse.setLoanDiscount( fortnight.getLoanDiscount() );
        fortNightResponse.setPrize( fortnight.getPrize() );
        fortNightResponse.setRetirement( fortnight.getRetirement() );
        fortNightResponse.setSocialShare( fortnight.getSocialShare() );
        fortNightResponse.setSocialWork( fortnight.getSocialWork() );
        fortNightResponse.setTotalDeduction( fortnight.getTotalDeduction() );
        fortNightResponse.setTotalRetribution( fortnight.getTotalRetribution() );

        return fortNightResponse;
    }

    @Override
    public List<FortNightResponse> fortNightsToResponses(List<Fortnight> fortNights) {
        if ( fortNights == null ) {
            return null;
        }

        List<FortNightResponse> list = new ArrayList<FortNightResponse>( fortNights.size() );
        for ( Fortnight fortnight : fortNights ) {
            list.add( fortNightToResponse( fortnight ) );
        }

        return list;
    }

    protected Employee fortNightDtoToEmployee(FortNightDto fortNightDto) {
        if ( fortNightDto == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setId( fortNightDto.getEmployeeId() );

        return employee;
    }

    private Long fortnightEmployeeId(Fortnight fortnight) {
        Employee employee = fortnight.getEmployee();
        if ( employee == null ) {
            return null;
        }
        return employee.getId();
    }
}

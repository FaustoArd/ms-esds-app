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
    date = "2024-01-31T23:59:45-0300",
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
        fortnight.setHoursQuantity( fortNightDto.getHoursQuantity() );
        fortnight.setExtrasQuantity50( fortNightDto.getExtrasQuantity50() );
        fortnight.setExtrasQuantity100( fortNightDto.getExtrasQuantity100() );
        fortnight.setDate( fortNightDto.getDate() );

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
        fortNightResponse.setDate( fortnight.getDate() );
        fortNightResponse.setExtras100( fortnight.getExtras100() );
        fortNightResponse.setExtras50( fortnight.getExtras50() );
        fortNightResponse.setExtrasQuantity100( fortnight.getExtrasQuantity100() );
        fortNightResponse.setExtrasQuantity50( fortnight.getExtrasQuantity50() );
        fortNightResponse.setFreeDayDiscount( fortnight.getFreeDayDiscount() );
        fortNightResponse.setHolidayDay( fortnight.getHolidayDay() );
        fortNightResponse.setHours( fortnight.getHours() );
        fortNightResponse.setHoursQuantity( fortnight.getHoursQuantity() );
        fortNightResponse.setInss( fortnight.getInss() );
        fortNightResponse.setInsurance( fortnight.getInsurance() );
        fortNightResponse.setLastDepositDate( fortnight.getLastDepositDate() );
        fortNightResponse.setLoanDiscount( fortnight.getLoanDiscount() );
        fortNightResponse.setPrize( fortnight.getPrize() );
        fortNightResponse.setRetirement( fortnight.getRetirement() );
        fortNightResponse.setSocialShare( fortnight.getSocialShare() );
        fortNightResponse.setSocialWork( fortnight.getSocialWork() );
        fortNightResponse.setTotalDeduction( fortnight.getTotalDeduction() );
        fortNightResponse.setTotalPay( fortnight.getTotalPay() );
        fortNightResponse.setTotalPayText( fortnight.getTotalPayText() );
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

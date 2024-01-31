package com.lord.employeeservice.mapper;

import com.lord.employeeservice.dto.DeductionDto;
import com.lord.employeeservice.dto.DeductionResponse;
import com.lord.employeeservice.model.Deduction;
import com.lord.employeeservice.model.JobRole;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-30T22:46:37-0300",
    comments = "version: 1.6.0.Beta1, compiler: Eclipse JDT (IDE) 3.34.0.v20230523-1233, environment: Java 17.0.7 (Oracle Corporation)"
)
public class DeductionMapperImpl implements DeductionMapper {

    @Override
    public Deduction dtoToDeduction(DeductionDto deductionDto) {
        if ( deductionDto == null ) {
            return null;
        }

        Deduction deduction = new Deduction();

        deduction.setJobRole( deductionDtoToJobRole( deductionDto ) );
        deduction.setId( deductionDto.getId() );
        deduction.setRetirement( deductionDto.getRetirement() );
        deduction.setInss( deductionDto.getInss() );
        deduction.setSocialWork( deductionDto.getSocialWork() );
        deduction.setSocialShare( deductionDto.getSocialShare() );
        deduction.setInsurance( deductionDto.getInsurance() );
        deduction.setFreeDayDiscount( deductionDto.getFreeDayDiscount() );
        deduction.setBonificationDiscount( deductionDto.getBonificationDiscount() );
        deduction.setLoanDiscount( deductionDto.getLoanDiscount() );

        return deduction;
    }

    @Override
    public DeductionResponse deductionToResponse(Deduction deduction) {
        if ( deduction == null ) {
            return null;
        }

        DeductionResponse deductionResponse = new DeductionResponse();

        deductionResponse.setJobRole( deductionJobRoleRole( deduction ) );
        deductionResponse.setId( deduction.getId() );
        deductionResponse.setRetirement( deduction.getRetirement() );
        deductionResponse.setInss( deduction.getInss() );
        deductionResponse.setSocialWork( deduction.getSocialWork() );
        deductionResponse.setSocialShare( deduction.getSocialShare() );
        deductionResponse.setInsurance( deduction.getInsurance() );
        deductionResponse.setFreeDayDiscount( deduction.getFreeDayDiscount() );
        deductionResponse.setBonificationDiscount( deduction.getBonificationDiscount() );
        deductionResponse.setLoanDiscount( deduction.getLoanDiscount() );

        return deductionResponse;
    }

    @Override
    public List<DeductionResponse> deductionsToResponses(List<Deduction> deductions) {
        if ( deductions == null ) {
            return null;
        }

        List<DeductionResponse> list = new ArrayList<DeductionResponse>( deductions.size() );
        for ( Deduction deduction : deductions ) {
            list.add( deductionToResponse( deduction ) );
        }

        return list;
    }

    protected JobRole deductionDtoToJobRole(DeductionDto deductionDto) {
        if ( deductionDto == null ) {
            return null;
        }

        JobRole jobRole = new JobRole();

        jobRole.setId( deductionDto.getJobRoleId() );

        return jobRole;
    }

    private String deductionJobRoleRole(Deduction deduction) {
        JobRole jobRole = deduction.getJobRole();
        if ( jobRole == null ) {
            return null;
        }
        return jobRole.getRole();
    }
}

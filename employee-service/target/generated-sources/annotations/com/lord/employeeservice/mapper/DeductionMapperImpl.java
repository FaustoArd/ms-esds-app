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
    date = "2024-01-29T11:22:13-0400",
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
        deduction.setBonificationDiscount( deductionDto.getBonificationDiscount() );
        deduction.setFreeDayDiscount( deductionDto.getFreeDayDiscount() );
        deduction.setId( deductionDto.getId() );
        deduction.setInss( deductionDto.getInss() );
        deduction.setInsurance( deductionDto.getInsurance() );
        deduction.setLoanDiscount( deductionDto.getLoanDiscount() );
        deduction.setRetirement( deductionDto.getRetirement() );
        deduction.setSocialShare( deductionDto.getSocialShare() );
        deduction.setSocialWork( deductionDto.getSocialWork() );

        return deduction;
    }

    @Override
    public DeductionResponse deductionToResponse(Deduction deduction) {
        if ( deduction == null ) {
            return null;
        }

        DeductionResponse deductionResponse = new DeductionResponse();

        deductionResponse.setJobRole( deductionJobRoleRole( deduction ) );
        deductionResponse.setBonificationDiscount( deduction.getBonificationDiscount() );
        deductionResponse.setFreeDayDiscount( deduction.getFreeDayDiscount() );
        deductionResponse.setId( deduction.getId() );
        deductionResponse.setInss( deduction.getInss() );
        deductionResponse.setInsurance( deduction.getInsurance() );
        deductionResponse.setLoanDiscount( deduction.getLoanDiscount() );
        deductionResponse.setRetirement( deduction.getRetirement() );
        deductionResponse.setSocialShare( deduction.getSocialShare() );
        deductionResponse.setSocialWork( deduction.getSocialWork() );

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

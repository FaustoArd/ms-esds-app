package com.lord.employeeservice.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.lord.employeeservice.dto.DeductionDto;
import com.lord.employeeservice.dto.DeductionResponse;
import com.lord.employeeservice.model.Deduction;

@Mapper
public interface DeductionMapper {

	public static final DeductionMapper INSTANCE = Mappers.getMapper(DeductionMapper.class);
	
	@Mapping(target = "jobRole.id", source = "jobRoleId")
	public Deduction dtoToDeduction(DeductionDto deductionDto);
	
	@Mapping(target="jobRole", source="jobRole.role")
	public DeductionResponse deductionToResponse(Deduction deduction);
	
	public List<DeductionResponse> deductionsToResponses(List<Deduction> deductions);
}

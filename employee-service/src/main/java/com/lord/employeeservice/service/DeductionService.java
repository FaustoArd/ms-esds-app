package com.lord.employeeservice.service;

import java.util.List;

import com.lord.employeeservice.dto.DeductionDto;
import com.lord.employeeservice.dto.DeductionResponse;

public interface DeductionService {

	public String createDeduction(DeductionDto deductionDto);
	
	public DeductionResponse findDeductionbyId(Long id);
	
	public List<DeductionResponse> findAllDeductions();
}

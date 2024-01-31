package com.lord.employeeservice.service;

import com.lord.employeeservice.dto.FortNightDto;
import com.lord.employeeservice.dto.FortNightResponse;
import com.lord.employeeservice.model.Fortnight;

public interface ForthNightService {

	public FortNightResponse createForthNight(FortNightDto fortNightDto);
	
	public Fortnight calculate(FortNightDto fortNightDto);
}

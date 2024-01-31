package com.lord.employeeservice.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import com.lord.employeeservice.dto.FortNightDto;
import com.lord.employeeservice.dto.FortNightResponse;
import com.lord.employeeservice.model.Fortnight;

@Mapper
public interface FortNightMapper {

	public static final FortNightMapper INSTANCE = Mappers.getMapper(FortNightMapper.class);
	
	@Mapping(target = "retirement", ignore = true)
	@Mapping(target = "inss", ignore = true)
	@Mapping(target = "socialWork", ignore = true)
	@Mapping(target = "extras", ignore = true)
	@Mapping(target = "prize", ignore = true)
	@Mapping(target = "socialShare", ignore = true)
	@Mapping(target = "insurance", ignore = true)
	@Mapping(target = "freeDayDiscount", ignore = true)
	@Mapping(target = "bonificationDiscount", ignore = true)
	@Mapping(target = "loanDiscount", ignore = true)
	@Mapping(target = "employee.id", source="employeeId")
	public Fortnight dtoToFortNight(FortNightDto fortNightDto);
	
	@Mapping( target = "employeeName",source=".", qualifiedByName = "getEmployeeNameAndLastname")
	@Mapping(target = "employeeId", source="employee.id")
	public FortNightResponse fortNightToResponse(Fortnight fortnight);
	
	public List<FortNightResponse> fortNightsToResponses(List<Fortnight> fortNights);
	
	@Named("getEmployeeNameAndLastname")
	public static String getEmployeeNameAndLastname(Fortnight fortnight) {
		return fortnight.getEmployee().getName() + " " + fortnight.getEmployee().getLastname();
	}
}

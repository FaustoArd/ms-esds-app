package com.lord.enterpriseservice.mapper;

import java.util.List;

import com.lord.enterpriseservice.dto.EnterpriseDto;
import com.lord.enterpriseservice.dto.EnterpriseResponse;
import com.lord.enterpriseservice.model.Address;
import com.lord.enterpriseservice.model.Enterprise;

public interface EnterpriseMapper {
	
	public Enterprise dtoToEnterprise(EnterpriseDto enterpriseDto);
	
	public EnterpriseResponse enterpriseToResponse(Enterprise enterprise);
	
	public EnterpriseResponse enterpriseToFullResponse(Enterprise enterprise,Address address);
	
	public List<EnterpriseResponse> enterprisesToResponses(List<Enterprise> enterprises);

}

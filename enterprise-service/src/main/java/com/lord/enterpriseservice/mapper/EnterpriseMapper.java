package com.lord.enterpriseservice.mapper;

import com.lord.enterpriseservice.dto.EnterpriseDto;
import com.lord.enterpriseservice.dto.EnterpriseResponse;
import com.lord.enterpriseservice.model.Address;
import com.lord.enterpriseservice.model.Enterprise;

public interface EnterpriseMapper {
	
	public Enterprise dtoToEnterprise(EnterpriseDto enterpriseDto);
	
	public EnterpriseResponse enterpriseToResponse(Enterprise enterprise,Address address);

}

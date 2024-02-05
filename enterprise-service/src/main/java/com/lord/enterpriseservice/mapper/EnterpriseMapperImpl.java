package com.lord.enterpriseservice.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.lord.enterpriseservice.dto.EnterpriseCreateResponse;
import com.lord.enterpriseservice.dto.EnterpriseDto;
import com.lord.enterpriseservice.dto.EnterpriseResponse;
import com.lord.enterpriseservice.model.Address;
import com.lord.enterpriseservice.model.Enterprise;

@Component
public class EnterpriseMapperImpl implements EnterpriseMapper {

	@Override
	public Enterprise dtoToEnterprise(EnterpriseDto enterpriseDto) {
		if(enterpriseDto==null) {
			return null;
		}
		Enterprise enterprise = new Enterprise();
		enterprise.setId(enterpriseDto.getId());
		enterprise.setSocialName(enterpriseDto.getSocialName());
		enterprise.setResponsible(enterpriseDto.getResponsible());
		enterprise.setStartDate(enterpriseDto.getStartDate());
		enterprise.setCuil(enterpriseDto.getCuil());
		enterprise.setCuit(enterpriseDto.getCuit());
		return enterprise;
	}
	
	@Override
	public EnterpriseResponse enterpriseToResponse(Enterprise enterprise) {
		if(enterprise==null) {
			return null;
		}
		EnterpriseResponse response = new EnterpriseResponse();
		response.setId(enterprise.getId());
		response.setCuil(enterprise.getCuil());
		response.setCuit(enterprise.getCuit());
		response.setResponsible(enterprise.getResponsible());
		response.setSocialName(enterprise.getSocialName());
		response.setStartDate(enterprise.getStartDate());
		response.setUserId(enterprise.getUserId());
		return response;
	}

	@Override
	public EnterpriseResponse enterpriseToFullResponse(Enterprise enterprise,Address address) {
		if(enterprise==null) {
			return null;
		}
		EnterpriseResponse response = new EnterpriseResponse();
		response.setId(enterprise.getId());
		response.setAddress(address);
		response.setCuil(enterprise.getCuil());
		response.setCuit(enterprise.getCuit());
		response.setResponsible(enterprise.getResponsible());
		response.setSocialName(enterprise.getSocialName());
		response.setStartDate(enterprise.getStartDate());
		response.setUserId(enterprise.getUserId());
		return response;
	}
	

	@Override
	public List<EnterpriseResponse> enterprisesToResponses(List<Enterprise> enterprises) {
		if(enterprises==null) {
			return null;
		}
		List<EnterpriseResponse> responses = enterprises.stream().map(this::enterpriseToResponse).toList();
		return responses;
	}

	@Override
	public EnterpriseCreateResponse enterpriseToEnterpriseCreateResponse(Enterprise enterprise) {
		if(enterprise==null) {
			return null;
		}
		EnterpriseCreateResponse response = new EnterpriseCreateResponse();
		response.setId(enterprise.getId());
		response.setSocialName(enterprise.getSocialName());
		return response;
	}

	



}

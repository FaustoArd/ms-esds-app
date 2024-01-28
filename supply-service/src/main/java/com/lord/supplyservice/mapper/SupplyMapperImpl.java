package com.lord.supplyservice.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.lord.supplyservice.dto.SupplyDto;
import com.lord.supplyservice.dto.SupplyResponse;
import com.lord.supplyservice.model.Supply;

@Component
public class SupplyMapperImpl implements SupplyMapper {

	@Override
	public Supply dtoToSupply(SupplyDto supplyDto) {
		if (supplyDto == null) {
			return null;
		}
		Supply supply = new Supply();
		supply.setId(supplyDto.getId());
		supply.setProviderId(supplyDto.getProviderId());
		supply.setType(supplyDto.getType());
		supply.setProviderName(supplyDto.getProviderName());
		supply.setBrand(supplyDto.getBrand());
		supply.setDescription(supplyDto.getDescription());
		supply.setPrice(supplyDto.getPrice());

		return supply;

	}

	@Override
	public SupplyResponse supplyToResponse(Supply supply) {
		if (supply == null) {
			return null;
		}
		SupplyResponse response = new SupplyResponse();
		response.setId(response.getId());
		response.setProviderId(response.getProviderId());
		response.setType(response.getType());
		response.setProviderName(response.getProviderName());
		response.setBrand(response.getBrand());
		response.setDescription(response.getDescription());
		response.setPrice(response.getPrice());

		return response;
	}

	@Override
	public List<SupplyResponse> dtoListToResponse(List<Supply> supplies) {
		if (supplies == null) {
			return null;
		}
		List<SupplyResponse> responses = supplies.stream().map(this::supplyToResponse).toList();
		return responses;
	}

}

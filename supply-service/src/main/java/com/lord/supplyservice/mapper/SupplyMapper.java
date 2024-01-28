package com.lord.supplyservice.mapper;

import java.util.List;

import com.lord.supplyservice.dto.SupplyDto;
import com.lord.supplyservice.dto.SupplyResponse;
import com.lord.supplyservice.model.Supply;

public interface SupplyMapper {

	public Supply dtoToSupply(SupplyDto supplyDto);
	
	public SupplyResponse supplyToResponse(Supply supply);
	
	public List<SupplyResponse> dtoListToResponses(List<Supply> supplies);
}

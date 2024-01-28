package com.lord.supplyservice.service;

import java.util.List;

import com.lord.supplyservice.dto.SupplyDto;
import com.lord.supplyservice.dto.SupplyResponse;

public interface SupplyService {
	
	public String createSupply(SupplyDto supplyDto);
	
	public List<SupplyResponse> findByProviderId(Long providerId);

}

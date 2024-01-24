package com.lord.providerservice.mapper;

import com.lord.providerservice.dto.ProviderDto;
import com.lord.providerservice.model.Provider;

public interface ProviderMapper {
	
	public Provider toProvider(ProviderDto providerDto);
	
	public ProviderDto toDto(Provider provider);

}

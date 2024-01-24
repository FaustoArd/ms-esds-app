package com.lord.distanceservice.mapper;

import com.lord.distanceservice.dto.DistanceDto;
import com.lord.distanceservice.model.Distance;


public interface DistanceMapper {
	
	public Distance dtoToDistance(DistanceDto distanceDto);
	
	

}

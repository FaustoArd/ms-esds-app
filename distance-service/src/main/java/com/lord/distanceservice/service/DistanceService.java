package com.lord.distanceservice.service;

import java.util.ArrayList;

import com.lord.distanceservice.dto.DistanceDto;
import com.lord.distanceservice.dto.TotalDistanceResponse;
import com.lord.distanceservice.model.Distance;
import com.lord.distanceservice.model.DistanceMatrixResponse;
import com.lord.distanceservice.model.GeocodingResult;

public interface DistanceService {
	
	public TotalDistanceResponse getTotalDistance(DistanceDto distanceDto);
	
	public DistanceMatrixResponse getDistanceFromMaps(DistanceDto distanceDto);
	
	public GeocodingResult getAddressCoordinates(String address);
	
	

}

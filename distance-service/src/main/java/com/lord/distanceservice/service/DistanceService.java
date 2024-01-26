package com.lord.distanceservice.service;

import java.util.List;

import com.lord.distanceservice.dto.AddressCompleteResultResponse;
import com.lord.distanceservice.dto.DistanceDto;
import com.lord.distanceservice.dto.TotalDistanceResponse;
import com.lord.distanceservice.model.DistanceMatrixResponse;
import com.lord.distanceservice.model.GeocodingResult;
import com.lord.distanceservice.model.PlacesTextSearchResponse;

public interface DistanceService {
	
	public TotalDistanceResponse getTotalDistance(DistanceDto distanceDto);
	
	public DistanceMatrixResponse getDistanceFromMaps(DistanceDto distanceDto);
	
	public GeocodingResult getAddressCoordinates(String address);
	
	public List<AddressCompleteResultResponse> matchAddress(String address);
	
	public List<AddressCompleteResultResponse> getFullAddressesFromTextSearchResponse(PlacesTextSearchResponse results);
	
	

}

package com.lord.distanceservice.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lord.distanceservice.dto.DistanceDto;
import com.lord.distanceservice.model.DistanceMatrixResponse;
import com.lord.distanceservice.model.GeocodingResult;
import com.lord.distanceservice.model.PlacesTextSearchResponse;
import com.lord.distanceservice.service.DistanceService;

@RestController
@RequestMapping("/api/distance")
public class DistanceController {
	
	@Autowired
	private final DistanceService distanceService;

	public DistanceController(DistanceService distanceService) {
		this.distanceService = distanceService;
	}
	
	@GetMapping("/distance")
	ResponseEntity<DistanceMatrixResponse> getDistanceFromMaps(@RequestBody DistanceDto distanceDto){
		DistanceMatrixResponse response = distanceService.getDistanceFromMaps(distanceDto);
		return new ResponseEntity<DistanceMatrixResponse>(response,HttpStatus.OK);
	}
	
	@GetMapping("/coordinates/address")
	ResponseEntity<GeocodingResult> getAddressCoordinates(@RequestParam("address")String address){
		GeocodingResult results = distanceService.getAddressCoordinates(address);
		return new ResponseEntity<GeocodingResult>(results,HttpStatus.OK);
	}
	@GetMapping("/coordinates/place_id")
	ResponseEntity<GeocodingResult> getPlaceIdCoordinates(@RequestParam("place_id")String placeId){
		GeocodingResult results = distanceService.getAddressCoordinates(placeId);
		return new ResponseEntity<GeocodingResult>(results,HttpStatus.OK);
	}
	
	@GetMapping("/address_search")
	ResponseEntity<PlacesTextSearchResponse> searchAddress(@RequestParam("query")String query){
		PlacesTextSearchResponse results = distanceService.matchAddress(query);
		return new ResponseEntity<PlacesTextSearchResponse>(results,HttpStatus.OK);
	}
	
	
	
}

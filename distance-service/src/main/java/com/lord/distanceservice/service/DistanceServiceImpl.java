package com.lord.distanceservice.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.lord.distanceservice.configuration.KeyManager;
import com.lord.distanceservice.dao.DistanceDao;
import com.lord.distanceservice.dto.DistanceDto;
import com.lord.distanceservice.dto.TotalDistanceResponse;
import com.lord.distanceservice.mapper.DistanceMapper;
import com.lord.distanceservice.model.DistanceMatrixResponse;
import com.lord.distanceservice.model.GeocodingResult;

import reactor.core.publisher.Mono;

@Service
public class DistanceServiceImpl implements DistanceService {
	
	@Autowired
	private final DistanceDao distanceDao;

	@Autowired
	private final DistanceMapper distanceMapper;
	
	
	private final WebClient webClient;
	
	private final  KeyManager keyManager;
	
	
	
	public DistanceServiceImpl(DistanceDao distanceDao,DistanceMapper distanceMapper,WebClient.Builder webClientBuilder,KeyManager keyManager) {
		this.distanceDao = distanceDao;
		this.distanceMapper= distanceMapper;
		this.webClient = webClientBuilder.baseUrl("https://maps.googleapis.com").build();
		this.keyManager = keyManager;
	
	}

	@Override
	public TotalDistanceResponse getTotalDistance(DistanceDto distanceDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DistanceMatrixResponse getDistanceFromMaps(DistanceDto distanceDto) {

		ArrayList<String> destinations = new ArrayList<>();
		destinations.add(distanceDto.getDestination()) ;
		ArrayList<String> origins = new ArrayList<>();
		origins.add(distanceDto.getOrigin()) ;
	
		String API_KEY = keyManager.getKey();
		Mono<DistanceMatrixResponse> matrixResponse =  webClient.get().uri("/maps/api/distancematrix/json", uriBuilder ->
		uriBuilder
		.queryParam("destinations",destinations)
		.queryParam("origins", origins)
		.queryParam("key", API_KEY)
		.build()).accept(MediaType.APPLICATION_JSON).retrieve()
		.bodyToMono(DistanceMatrixResponse.class);
		
		return matrixResponse.block();
	}

	@Override
	public GeocodingResult getAddressCoordinates(String address) {
		
		Mono<GeocodingResult> results = webClient.get().uri("/maps/api/geocode/json",uriBuilder -> uriBuilder
				.queryParam("address", address)
				.queryParam("key", keyManager.getKey())
				.build()).accept(MediaType.APPLICATION_JSON).retrieve()
				.bodyToMono(GeocodingResult.class);
		return results.block();
				
	}
	
	
}

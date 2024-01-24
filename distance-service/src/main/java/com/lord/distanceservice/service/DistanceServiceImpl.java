package com.lord.distanceservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.distanceservice.dao.DistanceDao;
import com.lord.distanceservice.dto.DistanceDto;
import com.lord.distanceservice.dto.TotalDistanceResponse;
import com.lord.distanceservice.mapper.DistanceMapper;

@Service
public class DistanceServiceImpl implements DistanceService {
	
	@Autowired
	private final DistanceDao distanceDao;

	@Autowired
	private final DistanceMapper distanceMapper;
	
	
	
	public DistanceServiceImpl(DistanceDao distanceDao,DistanceMapper distanceMapper) {
		this.distanceDao = distanceDao;
		this.distanceMapper= distanceMapper;
	}

	@Override
	public TotalDistanceResponse getTotalDistance(DistanceDto distanceDto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

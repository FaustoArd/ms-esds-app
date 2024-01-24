package com.lord.distanceservice.mapper;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

import com.lord.distanceservice.dto.DistanceDto;
import com.lord.distanceservice.model.Distance;

@Component
public class DistanceMapperImpl implements DistanceMapper {

	@Override
	public Distance dtoToDistance(DistanceDto distanceDto) {
		if(distanceDto==null) {
			return null;
		}
		Distance distance = new Distance();
		distance.setId(new ObjectId(distanceDto.getId()));
		distance.setMode(distanceDto.getMode());
		distance.setOrigin(distanceDto.getOrigin());
		distance.setDestination(distanceDto.getDestination());
		return distance;
	}

}

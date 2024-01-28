package com.lord.supplyservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.supplyservice.dao.SupplyDao;
import com.lord.supplyservice.dto.SupplyDto;
import com.lord.supplyservice.dto.SupplyResponse;
import com.lord.supplyservice.mapper.SupplyMapper;
import com.lord.supplyservice.model.Supply;

@Service
public class SupplyServiceImpl implements SupplyService{
	
	@Autowired
	private final SupplyDao supplyDao;
	
	@Autowired
	private final SupplyMapper supplyMapper;
	
	public SupplyServiceImpl(SupplyDao supplyDao,SupplyMapper supplyMapper) {
		this.supplyDao = supplyDao;
		this.supplyMapper = supplyMapper;
	}

	@Override
	public String createSupply(SupplyDto supplyDto) {
		Supply supply = supplyMapper.dtoToSupply(supplyDto);
		Supply savedSupply = supplyDao.save(supply);
		return savedSupply.getDescription();
	}

	@Override
	public List<SupplyResponse> findByProviderId(Long providerId) {
		return (List<SupplyResponse>)supplyMapper.dtoListToResponses(supplyDao.findByProviderId(providerId));
	}

	@Override
	public List<SupplyResponse> findAllSupplies() {
		return supplyMapper.dtoListToResponses(supplyDao.findAll());
	}

}

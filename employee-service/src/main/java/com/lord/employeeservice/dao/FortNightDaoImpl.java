package com.lord.employeeservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.employeeservice.exception.ItemNotFoundException;
import com.lord.employeeservice.model.Fortnight;
import com.lord.employeeservice.repository.ForthNightRepository;

@Service
public class FortNightDaoImpl implements ServiceDao<Fortnight> {
	
	@Autowired
	private final ForthNightRepository forthNightRepository;
	
	private static final String fortNightNotFound = "Forthnight not found";
	
	public FortNightDaoImpl(ForthNightRepository forthNightRepository) {
		this.forthNightRepository = forthNightRepository;
	}

	@Override
	public Fortnight save(Fortnight fortnight) {
		return forthNightRepository.save(fortnight);
	}

	@Override
	public Fortnight findyId(Long id) {
		return forthNightRepository.findById(id).orElseThrow(()-> new ItemNotFoundException(fortNightNotFound));
	}

	@Override
	public List<Fortnight> findAll() {
	return (List<Fortnight>)forthNightRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		if(forthNightRepository.existsById(id)) {
			forthNightRepository.deleteById(id);
		}else {
			throw new ItemNotFoundException(fortNightNotFound);
		}
		
	}

}

package com.lord.employeeservice.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.employeeservice.exception.ItemNotFoundException;
import com.lord.employeeservice.model.Deduction;
import com.lord.employeeservice.model.JobRole;
import com.lord.employeeservice.repository.DeductionRepository;

@Service
public class DeductionDaoImpl implements DeductionDao{

	@Autowired
	private final DeductionRepository deductionRepository;

	private static final String deductionNotFound = "Deduction not found";

	public DeductionDaoImpl(DeductionRepository deductionRepository) {
		this.deductionRepository = deductionRepository;
	}

	@Override
	public Deduction save(Deduction deduction) {
		return deductionRepository.save(deduction);
	}

	@Override
	public Deduction findById(Long id) {
		return deductionRepository.findById(id).orElseThrow(() -> new ItemNotFoundException(deductionNotFound));
	}

	@Override
	public List<Deduction> findAll() {
		return (List<Deduction>) deductionRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		if (deductionRepository.existsById(id)) {
			deductionRepository.deleteById(id);
		} else {
			throw new ItemNotFoundException(deductionNotFound);
		}

	}

	@Override
	public Deduction findByJobRole(JobRole jobRole) {
		return deductionRepository.findByJobRole(jobRole)
				.orElseThrow(() -> new ItemNotFoundException(deductionNotFound));
	}

}

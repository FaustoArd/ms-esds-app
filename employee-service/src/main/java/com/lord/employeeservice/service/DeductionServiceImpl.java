package com.lord.employeeservice.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lord.employeeservice.dao.DeductionDao;
import com.lord.employeeservice.dao.JobRoleDao;
import com.lord.employeeservice.dto.DeductionDto;
import com.lord.employeeservice.dto.DeductionResponse;
import com.lord.employeeservice.mapper.DeductionMapper;
import com.lord.employeeservice.model.Deduction;
import com.lord.employeeservice.model.JobRole;

@Service
public class DeductionServiceImpl implements DeductionService {

	@Autowired
	private final DeductionDao deductionDao;
	
	@Autowired
	private final JobRoleDao jobRoleDao;
	
	private static final Logger log = LoggerFactory.getLogger(DeductionServiceImpl.class);
	
	public DeductionServiceImpl(DeductionDao deductionDao, JobRoleDao jobRoleDao) {
		this.deductionDao = deductionDao;
		this.jobRoleDao = jobRoleDao;
	}

	@Override
	public String createDeduction(DeductionDto deductionDto) {
		log.info("Create Deduction");
		Deduction deduction = DeductionMapper.INSTANCE.dtoToDeduction(deductionDto);
		JobRole jobRole = jobRoleDao.findById(deductionDto.getJobRoleId());
		deduction.setJobRole(jobRole);
		Deduction savedDeduction = deductionDao.save(deduction);
		log.info("Deduction saved sucessfully");
		return savedDeduction.getJobRole().getRole();
	}

	@Override
	public DeductionResponse findDeductionbyId(Long id) {
		log.info("Find deduction by id");
		Deduction deduction = deductionDao.findById(id);
		return DeductionMapper.INSTANCE.deductionToResponse(deduction);
	}

	@Override
	public List<DeductionResponse> findAllDeductions() {
		log.info("Find all deductions");
		List<Deduction> deductions = deductionDao.findAll();
		return DeductionMapper.INSTANCE.deductionsToResponses(deductions);
	}

	@Override
	public List<DeductionResponse> findByEnterpriseId(Long enterpriseId) {
		List<Deduction> deductions = deductionDao.findByEnterpriseId(enterpriseId);
		return DeductionMapper.INSTANCE.deductionsToResponses(deductions);
	}

}

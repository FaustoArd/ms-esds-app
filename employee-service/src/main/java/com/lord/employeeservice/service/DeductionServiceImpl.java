package com.lord.employeeservice.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lord.employeeservice.dao.ServiceDao;
import com.lord.employeeservice.dto.DeductionDto;
import com.lord.employeeservice.dto.DeductionResponse;
import com.lord.employeeservice.mapper.DeductionMapper;
import com.lord.employeeservice.model.Deduction;
import com.lord.employeeservice.model.JobRole;

@Service
public class DeductionServiceImpl implements DeductionService {

	@Autowired
	private final ServiceDao<Deduction> deductionDao;
	
	@Autowired
	private final ServiceDao<JobRole> jobRoleDao;
	
	private static final Logger log = LoggerFactory.getLogger(DeductionServiceImpl.class);
	
	public DeductionServiceImpl(ServiceDao<Deduction> deductionDao, ServiceDao<JobRole> jobRoleDao) {
		this.deductionDao = deductionDao;
		this.jobRoleDao = jobRoleDao;
	}

	@Override
	public String createDeduction(DeductionDto deductionDto) {
		log.info("Create Deduction");
		Deduction deduction = DeductionMapper.INSTANCE.dtoToDeduction(deductionDto);
		JobRole jobRole = jobRoleDao.findyId(deductionDto.getJobRoleId());
		deduction.setJobRole(jobRole);
		Deduction savedDeduction = deductionDao.save(deduction);
		log.info("Deduction saved sucessfully");
		return savedDeduction.getJobRole().getRole();
	}

	@Override
	public DeductionResponse findDeductionbyId(Long id) {
		log.info("Find deduction");
		Deduction deduction = deductionDao.findyId(id);
		return DeductionMapper.INSTANCE.deductionToResponse(deduction);
	}

	@Override
	public List<DeductionResponse> findAllDeductions() {
		log.info("Find all deductions");
		List<Deduction> deductions = deductionDao.findAll();
		return DeductionMapper.INSTANCE.deductionsToResponses(deductions);
	}

}

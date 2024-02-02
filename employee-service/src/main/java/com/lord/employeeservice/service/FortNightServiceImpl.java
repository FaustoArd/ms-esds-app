package com.lord.employeeservice.service;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lord.employeeservice.dao.DeductionDao;
import com.lord.employeeservice.dao.EmployeeDao;
import com.lord.employeeservice.dao.FortNightDao;
import com.lord.employeeservice.dao.JobRoleDao;
import com.lord.employeeservice.dto.FortNightDto;
import com.lord.employeeservice.dto.FortNightResponse;
import com.lord.employeeservice.mapper.FortNightMapper;
import com.lord.employeeservice.model.Deduction;
import com.lord.employeeservice.model.Employee;
import com.lord.employeeservice.model.Fortnight;
import com.lord.employeeservice.model.JobRole;

@Service
public class FortNightServiceImpl implements ForthNightService {
	
	@Autowired
	private final FortNightDao fortNightDao;
	
	@Autowired
	private final JobRoleDao jobRoleDao;
	
	 @Autowired
	private final DeductionDao deductionDao;
	 
	 @Autowired
	 private final EmployeeDao employeeDao;
	
	public FortNightServiceImpl(FortNightDao fortNightDao,JobRoleDao jobRoleDao,DeductionDao deductionDao, EmployeeDao employeeDao) {
		this.fortNightDao = fortNightDao;
		this.jobRoleDao = jobRoleDao;
		this.deductionDao = deductionDao;
		this.employeeDao = employeeDao;
	}

	@Override
	public FortNightResponse createForthNight(FortNightDto fortNightDto) {
		Employee employee = employeeDao.findById(fortNightDto.getEmployeeId());
		JobRole jobRole = jobRoleDao.findById(employee.getJobRole().getId());
		Deduction deduction = deductionDao.findByJobRole(jobRole);
		Fortnight fortnight = calculate(fortNightDto, jobRole, deduction);
		fortnight.setEmployee(employee);
		Fortnight savedFortnight = fortNightDao.save(fortnight);
		return FortNightMapper.INSTANCE.fortNightToResponse(savedFortnight);
		
		
	}

	@Override
	public Fortnight calculate(FortNightDto fortNightDto, JobRole jobRole,Deduction deduction) {
		Fortnight fortnight = new Fortnight();
		BigDecimal hours = jobRole.getPayHour().multiply(new BigDecimal(fortNightDto.getHoursQuantity()));
		fortnight.setHours(hours);
		BigDecimal payHour50 = jobRole.getPayHour().multiply(jobRole.getPayHour().multiply(new BigDecimal(50)).divide(new BigDecimal(100)));
		BigDecimal payHour100 = jobRole.getPayHour().multiply(new BigDecimal(2));
		
		fortnight.setExtras50(payHour50.multiply(new BigDecimal(fortNightDto.getExtrasQuantity50())));
		fortnight.setExtras100(payHour100.multiply(new BigDecimal(fortNightDto.getExtrasQuantity100())));
		fortnight.setPrize(fortnight.getHours().multiply(jobRole.getPrizePercentage()).divide(new BigDecimal(100)));
		fortnight.setHolidayDay(fortnight.getHours().multiply(jobRole.getHolidayDayPercentage()).divide(new BigDecimal(100)));
		
		BigDecimal totalExtras = fortnight.getExtras50().add(fortnight.getExtras50())
				.add(fortnight.getExtras100()).add(fortnight.getPrize()).add(fortnight.getHolidayDay());
		
		fortnight.setTotalRetribution(hours.add(totalExtras));
		fortnight.setRetirement(fortnight.getTotalRetribution().multiply(deduction.getRetirement()).divide(new BigDecimal(100)));
		fortnight.setInss(fortnight.getTotalRetribution().multiply(deduction.getInss()).divide(new BigDecimal(100)));
		fortnight.setSocialWork(fortnight.getTotalRetribution().multiply(deduction.getSocialWork()).divide(new BigDecimal(100)));
		fortnight.setSocialShare(fortnight.getTotalRetribution().multiply(deduction.getSocialShare()).divide(new BigDecimal(100)));
		fortnight.setTotalDeduction(fortnight.getRetirement().add(fortnight.getInss().add(fortnight.getSocialWork().add(fortnight.getSocialShare()))));
		fortnight.setTotalPay(fortnight.getTotalRetribution().subtract(fortnight.getTotalDeduction()));
		return fortnight;
	}

	@Override
	public FortNightResponse findFortNightById(Long id) {
		Fortnight fortnight =  fortNightDao.findById(id);
		return FortNightMapper.INSTANCE.fortNightToResponse(fortnight);
	}

}

package com.lord.employeeservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.lord.employeeservice.dao.DeductionDao;
import com.lord.employeeservice.dao.EmployeeDao;
import com.lord.employeeservice.dao.JobRoleDao;
import com.lord.employeeservice.dto.FortNightDto;
import com.lord.employeeservice.dto.FortNightResponse;
import com.lord.employeeservice.model.Deduction;
import com.lord.employeeservice.model.Employee;
import com.lord.employeeservice.model.JobRole;
import com.lord.employeeservice.service.ForthNightService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class FortNightServiceTest {

	@Autowired
	private ForthNightService forthNightService;

	@Autowired
	private JobRoleDao jobRoleDao;

	@Autowired
	private EmployeeDao employeeDao;

	@Autowired
	private DeductionDao deductionDao;

	private Employee savedEmployee;

	private JobRole savedJobRole;

	private Deduction savedDeduction;

	@Order(1)
	@Test
	void setup() {
		JobRole jobRole = new JobRole();
		
		jobRole.setRole("Capataz");
		jobRole.setPayHour(new BigDecimal(1923));
	
		jobRole.setPrizePercentage(new BigDecimal(20));
		jobRole.setHolidayDayPercentage(new BigDecimal(10));
		jobRole.setHoliday(15);
		 savedJobRole =  jobRoleDao.save(jobRole);
		
		Deduction deduction = new Deduction();
		deduction.setRetirement(new BigDecimal(11));
		deduction.setInss(new BigDecimal(3));
		deduction.setSocialWork(new BigDecimal(3));
		deduction.setSocialShare(new BigDecimal(2.50));
		deduction.setJobRole(savedJobRole);
		savedDeduction = deductionDao.save(deduction);
		
		Employee employee = new Employee();
		employee.setName("Alberto");
		employee.setLastname("Rojas");
		employee.setPhone("1123456789");
		employee.setEmail("albert@gmail.com");
		employee.setDni("24.345.234");
		employee.setJobRole(savedJobRole);
		savedEmployee = employeeDao.save(employee);
		
		assertEquals(savedJobRole.getRole(), "Capataz");
		assertEquals(savedJobRole.getPayHour().intValue(), 1923);
	
		
	}
	
	@Test
	@Order(2)
	void testFortNight() {
		FortNightDto fortNightDto = new FortNightDto();
		fortNightDto.setEmployeeId(1L);
		fortNightDto.setExtrasQuantity50(0);
		fortNightDto.setExtrasQuantity100(0);
		fortNightDto.setHoursQuantity(90);
		FortNightResponse fortNightResponse = forthNightService.createForthNight(fortNightDto);
		
		assertEquals(fortNightResponse.getEmployeeName(), "Alberto Rojas");
		assertEquals(fortNightResponse.getHours().doubleValue(), 173070.00);
		assertEquals(fortNightResponse.getExtras50().doubleValue(), 0.00);
		assertEquals(fortNightResponse.getExtras100().doubleValue(), 0.00);
		assertEquals(fortNightResponse.getPrize().doubleValue(), 34614.00);
		assertEquals(fortNightResponse.getHolidayDay().doubleValue(), 17307.00);
		assertEquals(fortNightResponse.getRetirement().doubleValue(), 24749.01);
		assertEquals(fortNightResponse.getInss().doubleValue(), 6749.73);
		assertEquals(fortNightResponse.getSocialWork().doubleValue(), 6749.73);
		assertEquals(fortNightResponse.getSocialShare().doubleValue(), 5624.775);
		assertEquals(fortNightResponse.getTotalRetribution().doubleValue(), 224991.00);
		assertEquals(fortNightResponse.getTotalDeduction().doubleValue(), 43873.245);
		assertEquals(fortNightResponse.getTotalPay().doubleValue(), 181117.755);
	}

}

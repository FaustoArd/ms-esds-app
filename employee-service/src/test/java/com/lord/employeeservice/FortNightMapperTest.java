package com.lord.employeeservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.lord.employeeservice.dto.FortNightResponse;
import com.lord.employeeservice.mapper.FortNightMapper;
import com.lord.employeeservice.model.Employee;
import com.lord.employeeservice.model.Fortnight;

@SpringBootTest
public class FortNightMapperTest {
	
	
	@Test
	void mustResturnEmployeeNameAndLastName() {
		Employee employee = new Employee();
		employee.setName("Rodrigo");
		employee.setId(3L);
		employee.setLastname("Maracano");
		Fortnight fortnight = new Fortnight();
		fortnight.setHours(50);
		fortnight.setEmployee(employee);
		FortNightResponse response = FortNightMapper.INSTANCE.fortNightToResponse(fortnight);
		
		assertEquals(response.getEmployeeName(),"Rodrigo Maracano");
		assertEquals(response.getEmployeeId(),3L);
		
	}

}

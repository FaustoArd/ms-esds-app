package com.lord.distanceservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DistanceTest {

	
	@Test
	void completeAddressSpaces() {
		String word =  "Av.  San Martín 1934, B1678GPV Caseros, Provincia de Buenos Aires";
		
		//word = word.replace(".", " ").replace(",", " ");
		String result = word.replaceAll(" ", "%20");
		
				
		assertEquals(result, "Av.%20San%20Martín%201934,%20B1678GPV%20Caseros,%20Provincia%20de%20Buenos%20Aires");
	}
}

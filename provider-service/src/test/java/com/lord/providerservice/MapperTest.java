package com.lord.providerservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.lord.providerservice.dto.AddressResponse;
import com.lord.providerservice.dto.ProviderResponse;
import com.lord.providerservice.mapper.ProviderMapper;
import com.lord.providerservice.model.Provider;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
@TestInstance(Lifecycle.PER_CLASS)
public class MapperTest {

	@Autowired
	private ProviderMapper providerMapper;

	private Provider provider;

	private Provider provider2;

	private AddressResponse addressResponse;

	private AddressResponse addressResponse2;

	@Test
	@Order(1)
	void setup() {
		provider = new Provider();
		provider.setSocialName("Mega Corp S.A");
		provider.setFantasyName("Mega");
		provider.setId(1L);
		provider.setEmail("mega@mail.com");
		provider.setPhone("1522978456");

		provider2 = new Provider();
		provider2.setSocialName("Ali baba S.R.L");
		provider2.setFantasyName("Ali");
		provider2.setId(2L);
		provider2.setPhone("1123456789");
		provider2.setEmail("ali@mail.com");

		addressResponse = new AddressResponse();
		addressResponse.setStreet("Hamilton");
		addressResponse.setHouseNumber("2231");
		addressResponse.setLocality("Palomar");
		addressResponse.setCity("Buenos Aires");
		addressResponse.setProviderId(1L);

		addressResponse2 = new AddressResponse();
		addressResponse2.setStreet("Gordena");
		addressResponse2.setHouseNumber("5541");
		addressResponse2.setLocality("Ciudadela");
		addressResponse2.setCity("Buenos Aires");
		addressResponse2.setProviderId(2L);

	}

	
}

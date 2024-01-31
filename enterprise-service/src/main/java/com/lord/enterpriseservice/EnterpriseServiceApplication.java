package com.lord.enterpriseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EnterpriseServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EnterpriseServiceApplication.class, args);
	}

}

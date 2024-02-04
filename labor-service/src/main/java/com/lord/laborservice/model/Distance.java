package com.lord.laborservice.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="labor_distances")
public class Distance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String origin;
	
	private String destination;
	
	private double distance;
	
	private BigDecimal totalFuelPrice;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public BigDecimal getTotalFuelPrice() {
		return totalFuelPrice;
	}

	public void setTotalFuelPrice(BigDecimal totalFuelPrice) {
		this.totalFuelPrice = totalFuelPrice;
	}
	
	

}

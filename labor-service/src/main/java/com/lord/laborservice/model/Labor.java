package com.lord.laborservice.model;

import java.math.BigDecimal;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "labors")
public class Labor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Long customerId;

	private String customerName;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "supply_labor_junction", joinColumns = {
			@JoinColumn(name = "labor_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "supply_id", referencedColumnName = "id") })
	private List<Supply> supplies;

	private BigDecimal totalSuppliesPrice;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "distance_labor_junction", joinColumns = {
			@JoinColumn(name = "labor_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "distance_id", referencedColumnName = "id") })
	private List<Distance> distances;
	
	private BigDecimal totalDistancePrice;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "employee_labor_junction", joinColumns = {
			@JoinColumn(name = "labor_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "employee_id", referencedColumnName = "id") })
	private List<Employee> employees;

	private BigDecimal totalEmployeeSalary;

	private BigDecimal fuelPricePerLiter;

	private BigDecimal totalFuelPrice;

	private BigDecimal totalLaborPrice;

	private BigDecimal totalWithEarn;

	private BigDecimal earnPercentaje;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<Supply> getSupplies() {
		return supplies;
	}

	public void setSupplies(List<Supply> supplies) {
		this.supplies = supplies;
	}

	public BigDecimal getTotalSuppliesPrice() {
		return totalSuppliesPrice;
	}

	public void setTotalSuppliesPrice(BigDecimal totalSuppliesPrice) {
		this.totalSuppliesPrice = totalSuppliesPrice;
	}

	public List<Distance> getDistances() {
		return distances;
	}

	public void setDistances(List<Distance> distances) {
		this.distances = distances;
	}

	public BigDecimal getTotalDistancePrice() {
		return totalDistancePrice;
	}

	public void setTotalDistancePrice(BigDecimal totalDistancePrice) {
		this.totalDistancePrice = totalDistancePrice;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public BigDecimal getTotalEmployeeSalary() {
		return totalEmployeeSalary;
	}

	public void setTotalEmployeeSalary(BigDecimal totalEmployeeSalary) {
		this.totalEmployeeSalary = totalEmployeeSalary;
	}

	public BigDecimal getFuelPricePerLiter() {
		return fuelPricePerLiter;
	}

	public void setFuelPricePerLiter(BigDecimal fuelPricePerLiter) {
		this.fuelPricePerLiter = fuelPricePerLiter;
	}

	public BigDecimal getTotalFuelPrice() {
		return totalFuelPrice;
	}

	public void setTotalFuelPrice(BigDecimal totalFuelPrice) {
		this.totalFuelPrice = totalFuelPrice;
	}

	public BigDecimal getTotalLaborPrice() {
		return totalLaborPrice;
	}

	public void setTotalLaborPrice(BigDecimal totalLaborPrice) {
		this.totalLaborPrice = totalLaborPrice;
	}

	public BigDecimal getTotalWithEarn() {
		return totalWithEarn;
	}

	public void setTotalWithEarn(BigDecimal totalWithEarn) {
		this.totalWithEarn = totalWithEarn;
	}

	public BigDecimal getEarnPercentaje() {
		return earnPercentaje;
	}

	public void setEarnPercentaje(BigDecimal earnPercentaje) {
		this.earnPercentaje = earnPercentaje;
	}
	
	

}

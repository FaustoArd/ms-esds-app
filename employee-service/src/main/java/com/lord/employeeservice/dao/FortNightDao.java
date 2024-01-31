package com.lord.employeeservice.dao;

import java.util.List;


import com.lord.employeeservice.model.Fortnight;

public interface FortNightDao {

	public Fortnight save(Fortnight fortnight);
	
	public Fortnight findById(Long id);

	public List<Fortnight> findAll();
	
	public void deleteById(Long id);
}

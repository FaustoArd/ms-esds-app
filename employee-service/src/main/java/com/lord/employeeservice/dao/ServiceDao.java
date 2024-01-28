package com.lord.employeeservice.dao;

import java.util.List;

public interface ServiceDao<T> {

	public T save(T object);
	
	public T findyId(Long id);

	public List<T> findAll();
	
	public void deleteById(Long id);
}

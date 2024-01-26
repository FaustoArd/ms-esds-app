package com.lord.laborservice.dao;

import java.util.List;

import com.lord.laborservice.exception.ItemNotFoundException;

public  interface  ServiceDao<T> {

	public List<T> findAll();
	
	public T save(T object);
	
	public T findById(Long id);
	
	public void deleteById(Long id) throws ItemNotFoundException;
	
}

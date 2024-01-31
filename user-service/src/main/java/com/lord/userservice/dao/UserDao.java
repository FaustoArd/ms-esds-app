package com.lord.userservice.dao;

import java.util.List;

import com.lord.userservice.model.UserApp;

public interface UserDao {
	
	public UserApp save(UserApp userApp);
	
	public UserApp findById(Long id);
	
	public List<UserApp> findAll();
	
	public void deleteById(Long id);

}

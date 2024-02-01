package com.lord.userservice.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.lord.userservice.dao.UserDao;
import com.lord.userservice.dto.UserAppDto;
import com.lord.userservice.model.UserAppResponse;

public class UserServiceImpl implements UserService {

	@Autowired
	private final UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public String createUser(UserAppDto userAppDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Long> getEnterprisesId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserAppResponse findUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveEnterprisesId(Set<Long> enterprisesId) {
		// TODO Auto-generated method stub
		return null;
	}

}

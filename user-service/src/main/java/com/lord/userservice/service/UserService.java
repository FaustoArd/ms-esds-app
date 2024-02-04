package com.lord.userservice.service;

import java.util.Set;

import com.lord.userservice.dto.LoginResponse;
import com.lord.userservice.dto.UserAppDto;
import com.lord.userservice.dto.UserAppResponse;
import com.lord.userservice.exception.UserNotFoundException;


public interface UserService {
	
	public String registerUser(UserAppDto userAppDto);
	
	public LoginResponse loginUser(UserAppDto userAppDto)throws UserNotFoundException;
	
	public Set<Long> getEnterprisesId(Long userId);
	
	public String saveEnterprisesId(Set<Long> enterprisesId);
	
	public UserAppResponse findUserById(Long id);
	

}

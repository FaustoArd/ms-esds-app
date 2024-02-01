package com.lord.userservice.service;

import java.util.Set;

import com.lord.userservice.dto.UserAppDto;
import com.lord.userservice.model.UserAppResponse;

public interface UserService {
	
	public String createUser(UserAppDto userAppDto);
	
	public Set<Long> getEnterprisesId(Long userId);
	
	public String saveEnterprisesId(Set<Long> enterprisesId);
	
	public UserAppResponse findUserById(Long id);

}

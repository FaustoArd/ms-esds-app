package com.lord.userservice.mapper;

import org.springframework.stereotype.Component;

import com.lord.userservice.dto.LoginResponse;
import com.lord.userservice.dto.UserAppDto;
import com.lord.userservice.dto.UserAppResponse;
import com.lord.userservice.model.UserApp;

@Component
public class UserMapperImpl implements UserMapper {

	@Override
	public UserApp dtoToUser(UserAppDto userAppDto) {
		if(userAppDto==null) {
			return null;
		}
		UserApp userApp = new UserApp();
		userApp.setId(userAppDto.getId());
		userApp.setName(userAppDto.getName());
		userApp.setLastname(userAppDto.getLastname());
		userApp.setUsername(userAppDto.getUsername());
		userApp.setEmail(userAppDto.getEmail());
		userApp.setPassword(userAppDto.getPassword());
		userAppDto.setEnterprisesId(userAppDto.getEnterprisesId());
		return userApp;
	}

	@Override
	public UserAppResponse userToResponse(UserApp userApp) {
		if(userApp==null) {
			return null;
		}
		UserAppResponse userAppResponse = new UserAppResponse();
		userAppResponse.setId(userApp.getId());
		userAppResponse.setName(userApp.getName());
		userAppResponse.setLastname(userApp.getLastname());
		userAppResponse.setUsername(userApp.getUsername());
		userAppResponse.setEmail(userApp.getEmail());
		userAppResponse.setPassword(userApp.getPassword());
		userAppResponse.setEnterprisesId(userApp.getEnterprisesId());
		return userAppResponse;
		
	}

	

	
	
}

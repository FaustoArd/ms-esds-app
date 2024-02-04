package com.lord.userservice.mapper;

import com.lord.userservice.dto.LoginResponse;
import com.lord.userservice.dto.UserAppDto;
import com.lord.userservice.dto.UserAppResponse;
import com.lord.userservice.model.UserApp;

public interface UserMapper {

	public UserApp dtoToUser(UserAppDto userAppDto);
	
	public UserAppResponse userToResponse(UserApp userApp);
	
	
}

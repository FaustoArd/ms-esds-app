package com.lord.userservice.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.userservice.dao.UserDao;
import com.lord.userservice.dto.LoginResponse;
import com.lord.userservice.dto.UserAppDto;
import com.lord.userservice.dto.UserAppResponse;
import com.lord.userservice.exception.UserNotFoundException;
import com.lord.userservice.mapper.UserMapper;
import com.lord.userservice.model.UserApp;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private final UserDao userDao;
	
	@Autowired
	private final UserMapper userMapper;
	
	public UserServiceImpl(UserDao userDao,UserMapper userMapper) {
		this.userDao = userDao;
		this.userMapper = userMapper;
	}
	
	@Override
	public String registerUser(UserAppDto userAppDto) {
		UserApp user = userMapper.dtoToUser(userAppDto);
		UserApp savedUser = userDao.save(user);
		return savedUser.getName() + " " + savedUser.getLastname();
	}
	

	@Override
	public LoginResponse loginUser(UserAppDto userAppDto)throws UserNotFoundException {
		UserApp user = userDao.findByUsername(userAppDto.getUsername());
		if(user.getPassword().equals(userAppDto.getPassword())) {
			return new LoginResponse(user.getId(), null, "Bienvenido " + user.getName());
		}else {
			throw new UserNotFoundException("Usuario o contraseña incorrectos");
		}
	}

	@Override
	public Set<Long> getEnterprisesId(Long userId) {
		return userDao.findById(userId).getEnterprisesId();
	}

	@Override
	public UserAppResponse findUserById(Long id) {
		UserApp user = userDao.findById(id);
		return userMapper.userToResponse(user);
	}

	@Override
	public String saveEnterprisesId(Set<Long> enterprisesId) {
		// TODO Auto-generated method stub
		return null;
	}


}

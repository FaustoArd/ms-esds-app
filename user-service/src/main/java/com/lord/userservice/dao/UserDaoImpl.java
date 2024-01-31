package com.lord.userservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.userservice.exception.UserNotFoundException;
import com.lord.userservice.model.UserApp;
import com.lord.userservice.repository.UserRepository;

@Service
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private final UserRepository userRepository;
	
	private static final String userNotFound = "User not found";

	public UserDaoImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserApp save(UserApp userApp) {
		return userRepository.save(userApp);
	}

	@Override
	public UserApp findById(Long id) {
		return userRepository.findById(id).orElseThrow(()-> new UserNotFoundException(userNotFound));
	}

	@Override
	public List<UserApp> findAll() {
	return (List<UserApp>)userRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		if(userRepository.existsById(id)) {
			userRepository.deleteById(id);
		}else {
			throw new UserNotFoundException(userNotFound);
		}
	}
	
	

}

package com.lord.userservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.lord.userservice.dto.LoginResponse;
import com.lord.userservice.dto.UserAppDto;
import com.lord.userservice.dto.UserAppResponse;
import com.lord.userservice.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private final UserService userService;
	
	private static final Gson gson = new Gson();

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	
	
	@PostMapping("/register")
	ResponseEntity<String> registerUser(@RequestBody UserAppDto userAppDto){
		String userFullName = userService.registerUser(userAppDto);
		return new ResponseEntity<String>(gson.toJson(userFullName), HttpStatus.CREATED);
	}
	@PostMapping("/login")
	ResponseEntity<LoginResponse> loginUser(@RequestBody UserAppDto userAppDto){
		LoginResponse response = userService.loginUser(userAppDto);
		return new ResponseEntity<LoginResponse>(response,HttpStatus.CREATED);
	}
	
	@GetMapping("/by_id/{id}")
	ResponseEntity<UserAppResponse> findUserById(@PathVariable("id")Long id){
		UserAppResponse response = userService.findUserById(id);
		return ResponseEntity.ok(response);
	}
}

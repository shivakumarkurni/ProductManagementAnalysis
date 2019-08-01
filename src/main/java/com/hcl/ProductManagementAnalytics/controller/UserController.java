package com.hcl.ProductManagementAnalytics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ProductManagementAnalytics.dto.UserDTO;
import com.hcl.ProductManagementAnalytics.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/user/registration")
	public ResponseEntity<String> userRegistration(@RequestBody UserDTO userDto) {

		return new ResponseEntity<>(userService.userRegistration(userDto), HttpStatus.CREATED);

	}
	
	@PostMapping("/user/{username}/password/{password}")
	public ResponseEntity<String> userLogin(@PathVariable String username,@PathVariable String password){
		
		return new ResponseEntity<>(userService.userLogin(username, password),HttpStatus.OK);
		
	}

}

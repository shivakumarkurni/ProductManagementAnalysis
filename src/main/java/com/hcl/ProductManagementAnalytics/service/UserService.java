package com.hcl.ProductManagementAnalytics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ProductManagementAnalytics.dto.UserDTO;
import com.hcl.ProductManagementAnalytics.entiy.User;
import com.hcl.ProductManagementAnalytics.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public String userRegistration(UserDTO userDto) {

		User user = new User();
		user.setUserId(userDto.getUserId());
		user.setName(userDto.getName());
		user.setPassword(userDto.getPassword());
		user.setGender(userDto.getGender());
		user.setEmail(userDto.getEmail());
		user.setAddress(userDto.getAddress());

		if (userRepository.save(user) != null)
			return "User Registration Done Successfully";

		else
			return "Some thing went wrong Please try again";

	}

	public String userLogin(String username, String password) {

		User user = userRepository.findByName(username);

		if (user != null) {

			if (user.getName().equalsIgnoreCase(username) && user.getPassword().equals(password))

				return "User Successfully logged in";

			else
				return "Username or password is incorrect";

		}

		else
			return "User not exists";
	}
}

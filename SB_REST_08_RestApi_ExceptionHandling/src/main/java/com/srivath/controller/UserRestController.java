package com.srivath.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.srivath.exceptions.UserNotFoundException;

@RestController
public class UserRestController {

	@GetMapping("/user/{userId}")
	public String getUserName(@PathVariable("userId") Integer userId) throws UserNotFoundException {
		if(userId==100) {
			return "John";
		}else if (userId==200) {
			return "Smith";
		}else {
			throw new UserNotFoundException("User not found...!");
		}
		
	}
}

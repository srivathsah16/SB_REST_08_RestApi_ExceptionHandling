package com.srivath.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/")
	public String getWelcomeMsg() {
		int num = 10/0;
		return "Welcome to REST APIs..";
	}
}

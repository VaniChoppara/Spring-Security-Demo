package com.demo.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelocomeController {

	@GetMapping("/welcome")
	public String show() {
		return "Welcome to My Page!";
		
	}
}

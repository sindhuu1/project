package com.example.samplep;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class demosample {
	@GetMapping("/get")
	public String show() {
		String s = "Welcome to Amdocs";
		return s +"Id : 12890";
		
	}

	@GetMapping("/in")
	public String show1() {
		String s = "Dockerize the springboot Application";
		return s  +"Id : 12380";
		
	}
	
	
}

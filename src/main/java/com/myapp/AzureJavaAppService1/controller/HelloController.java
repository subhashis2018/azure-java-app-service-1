package com.myapp.AzureJavaAppService1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

	@GetMapping("/hello")
	public String getHello() {
		return "hello";
	}
	@GetMapping("/test")
	public String getTest() {
		return "test";
	}
	
}

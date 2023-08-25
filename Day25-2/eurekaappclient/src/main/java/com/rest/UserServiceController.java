package com.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceController {
	
	@GetMapping("/")
	public String home()
	{
		return "hello from eureka client";
	}

}

package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.model")
public class UserServiceControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceControllerApplication.class, args);
	}

}

package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Configserverdemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Configserverdemo1Application.class, args);
	}

}

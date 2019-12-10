package com.tempstructure.hello;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(HelloApplication.class);
		  app.setDefaultProperties(Collections
		          .singletonMap("server.port", "8083"));
		        app.run(args);
		System.out.println("Hello!!");
	}

}

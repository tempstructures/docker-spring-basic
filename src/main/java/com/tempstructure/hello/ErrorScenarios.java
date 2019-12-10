package com.tempstructure.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/error")
public class ErrorScenarios {
	@GetMapping
	public String error() {
		return "oopsiee!!!!";
	}
}

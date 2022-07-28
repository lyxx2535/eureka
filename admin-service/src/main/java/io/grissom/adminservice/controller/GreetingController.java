package io.grissom.adminservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.grissom.adminservice.service.GreetingService;

@RestController
public class GreetingController {

	@Autowired
	private GreetingService greetingService;

	@GetMapping("/greeting")
	public Object greeting() {
		return greetingService.greeting();
	}
}

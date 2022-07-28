package io.grissom.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.grissom.userservice.service.GreetingService;

@RestController
public class GreetingController {

	@Autowired
	private GreetingService greetingService;

	@GetMapping("/greeting")
	public Object greeting() {
		System.out.println("运行greeting-service1的greeting");
		return greetingService.greeting();
	}
}

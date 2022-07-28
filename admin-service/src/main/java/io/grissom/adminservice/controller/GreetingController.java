package io.grissom.adminservice.controller;

import io.grissom.adminservice.dto.GreetingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.grissom.adminservice.service.GreetingService;

@RestController
public class GreetingController {

	@Autowired
	private GreetingService greetingService;

	@GetMapping("/greeting")
	public Object greeting(@RequestBody GreetingDto greetingDto) {
		return greetingService.greeting(greetingDto);
	}
}

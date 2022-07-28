package io.grissom.userservice.controller;

import io.grissom.userservice.dto.GreetingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.grissom.userservice.service.GreetingService;

/**
 * @author Grissom
 *
 */
@RestController
public class GreetingController {

	@Autowired
	private GreetingService greetingService;

	@GetMapping("/greeting")
	public Object greeting(GreetingDto greetingDto) {
		return greetingService.greeting();
	}
}

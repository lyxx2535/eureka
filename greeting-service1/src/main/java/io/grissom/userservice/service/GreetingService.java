package io.grissom.userservice.service;

import org.springframework.stereotype.Service;

import io.grissom.userservice.domain.Greeting;

/**
 * Author: Grissom
 */
@Service
public class GreetingService {

	public Object greeting(){
		return new Greeting("Hello");
	}
}

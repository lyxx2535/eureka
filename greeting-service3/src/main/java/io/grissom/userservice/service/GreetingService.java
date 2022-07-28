package io.grissom.userservice.service;

import io.grissom.userservice.domain.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	public Object greeting(){
		return new Greeting("Hello");
	}
}

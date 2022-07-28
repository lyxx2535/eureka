package io.grissom.adminservice.service;

import io.grissom.adminservice.dto.GreetingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.grissom.adminservice.feign.GreetingFeign;

/**
 * Author: Grissom
 */
@Service
public class GreetingService {

	@Autowired
	private GreetingFeign greetingFeign;

	public Object greeting(GreetingDto greetingDto){
		return greetingFeign.getGreeting(greetingDto);
	}

}
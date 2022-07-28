package io.grissom.adminservice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.grissom.adminservice.dto.UserDto;
import io.grissom.adminservice.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/user")
	public Object add(@Valid @RequestBody UserDto userDto) {
		return userService.add(userDto);
	}

	@GetMapping("/user")
	public String get(@RequestParam Long id) {
		return userService.get(id);
	}

	@GetMapping("/greeting")
	public Object greeting() {
		return userService.greeting();
	}
}

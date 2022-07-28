package io.grissom.userservice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.grissom.userservice.domain.User;
import io.grissom.userservice.dto.UserDto;
import io.grissom.userservice.service.UserService;

/**
 * @author Grissom
 *
 */
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/user")
	public Object add(@Valid @RequestBody UserDto userDto) {
		User user = new User();
		user.setName(userDto.getName());
		user.setPwd(userDto.getPwd());
		return userService.add(user);
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

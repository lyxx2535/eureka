package io.grissom.adminservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.grissom.adminservice.dto.UserDto;
import io.grissom.adminservice.feign.UserFeign;

/**
 * Author: Grissom
 */
@Service
public class UserService {

	@Autowired
	private UserFeign userFeign;

	public Object add(UserDto userDto) {
		return userFeign.add(userDto);
	}

	public String get(Long id) {
		return this.userFeign.get(id);
	}

	public Object greeting(){
		return this.userFeign.greeting();
	}

}

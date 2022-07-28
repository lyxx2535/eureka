package io.grissom.userservice.service;

import io.grissom.userservice.domain.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.grissom.userservice.dao.UserDao;
import io.grissom.userservice.domain.User;

/**
 * Author: Grissom
 */
@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public User add(User user) {
		User result = userDao.save(user);
		return result;
	}

	public String get(Long userId) {
		User u = userDao.getOne(userId);
		if (u != null) {
			return u.getName();
		} else {
			return "Not Found!";
		}
	}

	public Object greeting(){
		return new Greeting("Hello");
	}
}

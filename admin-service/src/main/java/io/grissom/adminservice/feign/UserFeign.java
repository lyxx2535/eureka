package io.grissom.adminservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import io.grissom.adminservice.dto.UserDto;

/**
 * Author: Garroshh date: 2020/7/8 5:33 下午
 */
@Component
@FeignClient("user-service")
public interface UserFeign {
	@PostMapping("/user")
	Object add(@RequestBody UserDto userDto);

	@GetMapping("/user")
	String get(@RequestParam("id") Long id);

	@GetMapping("/greeting")
	Object greeting();
}

package io.grissom.adminservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient("user-service")
public interface GreetingFeign {

	@GetMapping("/greeting")
	Object greeting();
}

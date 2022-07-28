package io.grissom.adminservice.feign;
import io.grissom.adminservice.dto.GreetingDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient("greeting-service")
public interface GreetingFeign {

    @GetMapping("/greeting")
    Object getGreeting(@RequestBody GreetingDto greetingDto);

}

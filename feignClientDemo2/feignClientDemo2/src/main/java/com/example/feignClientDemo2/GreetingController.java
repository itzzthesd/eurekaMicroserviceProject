package com.example.feignClientDemo2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("spring-cloud-eureka-feign-client-1")
public interface GreetingController {

    @RequestMapping("/client1/test")
    ResponseEntity<String> test();
    
} 
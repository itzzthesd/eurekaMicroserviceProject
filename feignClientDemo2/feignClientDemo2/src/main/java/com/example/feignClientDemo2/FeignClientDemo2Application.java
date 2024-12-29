package com.example.feignClientDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignClientDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientDemo2Application.class, args);
	}

}

package com.hms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class SampleApplication {

	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}
	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

}

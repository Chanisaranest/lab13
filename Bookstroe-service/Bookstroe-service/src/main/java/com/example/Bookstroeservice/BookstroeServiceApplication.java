package com.example.Bookstroeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BookstroeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstroeServiceApplication.class, args);
	}

	@RequestMapping("/recommended")
	public String recommended(){
		return "Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)";
	}
}

package com.example.Devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping
	public String sayHello() {
		return "Hi bro";
	}

}

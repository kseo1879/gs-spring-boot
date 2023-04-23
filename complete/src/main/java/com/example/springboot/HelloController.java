package com.example.springboot;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring boot!";
	}

	@GetMapping("/hello/{name}")
	@ResponseBody
	public String hello(
		@PathVariable String name
	) {
		return "Hello " + name + "!";
	}
}


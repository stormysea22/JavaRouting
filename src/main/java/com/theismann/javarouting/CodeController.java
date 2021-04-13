package com.theismann.javarouting;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/coding")
public class CodeController {
	
	@RequestMapping("")
	public String index() {
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping("/python")
	public String python() {
		return "Python/Django was awesome!!!";
	}
	
	@RequestMapping("/java")
	public String java() {
		return "Java/ Spring is wayyy better!";
	}
}

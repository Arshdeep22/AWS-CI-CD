package com.in28minutes.unittesting.unittesting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "<img src='https://images.contentstack.io/v3/assets/blt300387d93dabf50e/blt6aaaab200d5013ff/59131a0f59b80e7305b104bd/one-does-not-simply-implement-continuous-delivery.jpg?format=webp&width=1200' />";
	}
	
}

package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping ("/api/hello/string")
public String sayhello()
{ 
		return "hello danial";
		} 
	@RequestMapping ("/api/hello/objects")
	public HelloObject sayHelloObject() {
		HelloObject bird = new HelloObject ("hello danial");
		return bird;
	}
}


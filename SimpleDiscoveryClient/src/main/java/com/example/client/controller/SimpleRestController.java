package com.example.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/")
public class SimpleRestController {
	
	@GetMapping("get")
	public String getSimpleResponse() {
		return "Hello from SimpleRestController of SimpleDiscoveryClient";
	}
	

}

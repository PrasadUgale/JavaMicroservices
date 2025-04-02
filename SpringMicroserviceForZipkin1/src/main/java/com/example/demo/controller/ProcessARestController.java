package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/v1/api/")
public class ProcessARestController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/showA")
	public String getMethodName() {
		String resp = restTemplate.getForEntity("http://localhost:9998/v1/api/showB", String.class).getBody();
		return "Response From A .... "+ resp;
	}
	
}

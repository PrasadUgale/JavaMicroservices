package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/v1/api/")
public class ProcessBController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/showB")
	public String getMethodName() {
		String resp = restTemplate.getForEntity("http://localhost:9997/v1/api/showC", String.class).getBody();
		return "Response From B .... "+ resp;
	}
	
}

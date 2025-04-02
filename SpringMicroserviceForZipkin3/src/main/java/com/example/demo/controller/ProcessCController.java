package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/v1/api/")
public class ProcessCController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/showC")
	public String getMethodName() {
		return "Response From C .... ";
	}
}

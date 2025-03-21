package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/")
public class ConfigClientController {
	
	@Value("${eureka.client.service-url.defaultZone}")
	private String defaultZone;
	
	@GetMapping("/get")
	public String getInfo() {
		String res = "Response from Config Client. value from github for eureka.client.service-url.defaultZone: "+ defaultZone;
		return res;
	}
}

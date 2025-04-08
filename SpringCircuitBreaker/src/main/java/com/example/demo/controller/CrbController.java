package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Controller
@RequestMapping("/v1/api/")
public class CrbController {
		
	private static final String SERVICE_NAME = "breakable_service"; 
	
	@GetMapping("/get")
	@CircuitBreaker(name = SERVICE_NAME, fallbackMethod = "serviceFallback")
	public String apiCall() {
		String response = new RestTemplate().getForObject("http://localhost:8081/v1/api/get", String.class);
		return response;
	}
	
	public ResponseEntity<String> serviceFallback(Exception e){
		return ResponseEntity.ok("Service is down! Please wait for some time");
	}
	
	
	
	
}

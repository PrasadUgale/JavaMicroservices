package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.LoadBalancerService;

@RestController
@RequestMapping("/v1/api/")
public class LoadBalancerDemoController {
	
	@Autowired
	private LoadBalancerService loadBalancerService;
	
	@GetMapping("/get")
	public String getCommunication() {
		return loadBalancerService.communicate();
	}
	
	
	
}

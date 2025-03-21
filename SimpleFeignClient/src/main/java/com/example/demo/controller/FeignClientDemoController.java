package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IConsumer;

@RestController
@RequestMapping("/v1/api/")
public class FeignClientDemoController {
	
	@Autowired
	private IConsumer iConsumer;
	
	@GetMapping("get")
	public String getResponse() {
		return iConsumer.getResponse();
	}
	
	
	
}

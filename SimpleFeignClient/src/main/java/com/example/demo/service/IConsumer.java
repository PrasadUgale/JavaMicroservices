package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SimpleDiscoveryClient")
public interface IConsumer {
	
//	Method Signature and mapping should be same as parent
	@GetMapping("/v1/api/get")
	public String getResponse();
	
}

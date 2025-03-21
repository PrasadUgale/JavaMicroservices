package com.example.demo.service;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class LoadBalancerService {
	
	@Autowired
	private LoadBalancerClient balancerClient;
	
	public String communicate() {
		// Gets ServiceInstances with less load associated with a particular serviceId
		ServiceInstance instance =  balancerClient.choose("SimpleDiscoveryClient");
		
		// Create a request and send it using rest template
		URI uri = instance.getUri();
		String url = uri + "/v1/api/get";
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> responseEntity = rt.getForEntity(url, String.class);
		
		return responseEntity.getBody();
	}
}

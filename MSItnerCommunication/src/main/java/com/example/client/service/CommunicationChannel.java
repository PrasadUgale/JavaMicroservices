package com.example.client.service;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CommunicationChannel {
	
	@Autowired
	private DiscoveryClient client;
	
	public String communicate() {
		// Gets all ServiceInstances associated with a particular serviceId
		List<ServiceInstance> list =  client.getInstances("SimpleDiscoveryClient");
		ServiceInstance instance = list.get(0);
		
		// Create a request and send it using rest template
		URI uri = instance.getUri();
		String url = uri + "/v1/api/get";
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> responseEntity = rt.getForEntity(url, String.class);
		
		return responseEntity.getBody();
	}
	
	
}

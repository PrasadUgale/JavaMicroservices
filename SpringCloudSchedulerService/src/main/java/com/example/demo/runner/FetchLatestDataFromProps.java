package com.example.demo.runner;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class FetchLatestDataFromProps {
	
	//Schedule after every 10 second
	@Scheduled(cron = "10 * * * * *")
	public void fetch() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>("{}", headers);
		
		RestTemplate rt = new RestTemplate();
		String response = rt.postForEntity("http://localhost:8111/actuator/refresh", entity, String.class).getBody();
		System.out.println(response);
	}
	
}

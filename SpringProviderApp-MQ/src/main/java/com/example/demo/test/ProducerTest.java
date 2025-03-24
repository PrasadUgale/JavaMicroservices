package com.example.demo.test;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.demo.service.ProducerService;

@Component
public class ProducerTest {
	
	@Autowired
	private ProducerService service;
	
	@Scheduled(cron = "*/10 * * * * *")
	public void sendMessage() {
		service.sendData("Hello :: "+new Date());
		System.out.println("Data Sent to MQ.....");
	}
	
}

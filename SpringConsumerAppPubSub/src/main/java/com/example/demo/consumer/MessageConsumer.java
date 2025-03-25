package com.example.demo.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
	
	@JmsListener(destination = "${my.app.desti-name}")
	public void readMessage(String message) {
		System.out.println("Current Message as pubsub model => " + message);
	}
	
}

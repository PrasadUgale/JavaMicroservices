package com.example.demo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.demo.model.KafkaMessage;
import com.example.demo.service.JsonUtil;

@Component
public class ConsumerService {

	@KafkaListener(topics = "${my.topic.name}", groupId = "tempGroup")
	public void readData(String message) {
		
		System.out.println("Reading message ********************** from topic ${my.topic.name} with group id as ${spring.kafka.consumer.group-id}" );
		System.out.println(message);
		
		//You can use the object is further processing.
		KafkaMessage kafkaMessage = JsonUtil.convertJsontoObjcet(message);
		
		System.out.println(kafkaMessage.toString());
	}
	
}

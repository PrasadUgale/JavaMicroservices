package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.KafkaMessage;
import com.example.demo.producer.ProducerService;
import com.example.demo.util.JsonUtil;

@RestController
@RequestMapping("/v1/api/")
public class KafkaRestController {

	@Autowired
	private ProducerService service;
	
	@GetMapping("/post")
	public String getMethodName(@RequestParam String key, @RequestParam String value) {
		//Create a object for the input
		KafkaMessage message = new KafkaMessage();
		message.setId(key);
		message.setMessage(value);
		
		//Convert object to jsonString format and send to service 
		String toSend = JsonUtil.convertObjectToJson(message);
		
		if(message != null) {
			service.sendMessage(toSend);
			return "SUCCESS";
		} 
		else
			return "FAIL";
		
	}
	
	
}

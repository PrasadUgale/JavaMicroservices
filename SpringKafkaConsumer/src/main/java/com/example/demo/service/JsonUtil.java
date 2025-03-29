package com.example.demo.service;

import com.example.demo.model.KafkaMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	
	public static KafkaMessage convertJsontoObjcet( String json ) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(json, KafkaMessage.class);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
}

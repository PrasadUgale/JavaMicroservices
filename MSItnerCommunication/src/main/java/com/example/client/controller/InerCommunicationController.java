package com.example.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.client.service.CommunicationChannel;

@RestController
@RequestMapping("/v1/api/")
public class InerCommunicationController {
	
	@Autowired
	CommunicationChannel channel;
	
	@GetMapping("/get")
	public String getInfoFromMS() {
		return channel.communicate();
	}
	
}

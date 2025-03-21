package com.example.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SimpleDiscoveryClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleDiscoveryClientApplication.class, args);
	}

}

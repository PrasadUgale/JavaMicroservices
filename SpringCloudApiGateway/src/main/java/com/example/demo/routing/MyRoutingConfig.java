package com.example.demo.routing;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRoutingConfig {
	
	@Bean
	public RouteLocator configureRoute(RouteLocatorBuilder builder) {
		return builder.routes()
		.route("ServiceName1", r -> r.path("/v1/api/mapping1/**").uri("lb://Service-Id1"))
		.route("ServiceName2", r -> r.path("/v1/api/mapping2/**").uri("lb://Service-Id2"))
		.build();
	}
	
}

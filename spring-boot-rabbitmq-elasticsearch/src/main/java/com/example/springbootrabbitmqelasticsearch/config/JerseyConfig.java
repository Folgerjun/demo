package com.example.springbootrabbitmqelasticsearch.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.example.springbootrabbitmqelasticsearch.controller.HelloJerseyController;

@Configuration
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(HelloJerseyController.class);
	}
}

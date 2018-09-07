package com.example.springbootrabbitmqelasticsearch.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

	@Bean
	public Queue fooQueue() {
		return new Queue("foo");
	}
}

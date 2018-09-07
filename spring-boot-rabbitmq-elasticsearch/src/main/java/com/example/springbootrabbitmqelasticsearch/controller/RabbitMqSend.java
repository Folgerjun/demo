package com.example.springbootrabbitmqelasticsearch.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqSend {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	// @Scheduled(fixedDelay = 1000L)
	public void send() {
		this.rabbitTemplate.convertAndSend("foo", "Hello RabbitMQ");
	}
}

package com.example.springbootrabbitmqelasticsearch.service.impl;

import org.springframework.stereotype.Service;

import com.example.springbootrabbitmqelasticsearch.service.HelloJerseyService;

@Service
public class HelloJerseyServiceImpl implements HelloJerseyService {

	@Override
	public String hello(String name) {
		return "Hello " + name;
	}

}

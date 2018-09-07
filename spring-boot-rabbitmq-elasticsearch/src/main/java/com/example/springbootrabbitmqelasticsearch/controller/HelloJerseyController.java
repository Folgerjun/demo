package com.example.springbootrabbitmqelasticsearch.controller;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springbootrabbitmqelasticsearch.service.HelloJerseyService;

@Component
@Path("/hello")
public class HelloJerseyController {

	@Autowired
	private HelloJerseyService helloJerseyService;

	@GET
	@Path("/test")
	public String message(@QueryParam("name") @NotNull String name) {
		return helloJerseyService.hello(name);
	}

}

package com.example.springbootmail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMailApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringBootMailApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMailApplication.class, args);
		log.info("-----started-----");
	}

}

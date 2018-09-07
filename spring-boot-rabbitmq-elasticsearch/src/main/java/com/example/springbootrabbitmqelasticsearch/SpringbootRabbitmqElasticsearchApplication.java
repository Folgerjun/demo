package com.example.springbootrabbitmqelasticsearch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "com.example.springbootrabbitmqelasticsearch.repository")
public class SpringbootRabbitmqElasticsearchApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringbootRabbitmqElasticsearchApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRabbitmqElasticsearchApplication.class, args);
		System.out.println("启动成功...");
		log.info("启动成功！！");

	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		// Do any additional configuration here
		return builder.build();
	}
}

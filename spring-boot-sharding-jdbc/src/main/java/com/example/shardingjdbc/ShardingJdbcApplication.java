package com.example.shardingjdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShardingJdbcApplication {

	private static final Logger log = LoggerFactory.getLogger(ShardingJdbcApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ShardingJdbcApplication.class, args);
		log.info("----------启动成功----------");
	}

}

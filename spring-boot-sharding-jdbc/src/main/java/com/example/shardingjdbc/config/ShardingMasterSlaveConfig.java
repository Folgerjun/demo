package com.example.shardingjdbc.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.zaxxer.hikari.HikariDataSource;

import io.shardingjdbc.core.api.config.MasterSlaveRuleConfiguration;
import lombok.Data;

@Data
@ConfigurationProperties(prefix = "sharding.jdbc")
public class ShardingMasterSlaveConfig {

	private Map<String, HikariDataSource> dataSources = new HashMap<>();

	private MasterSlaveRuleConfiguration masterSlaveRule;
}

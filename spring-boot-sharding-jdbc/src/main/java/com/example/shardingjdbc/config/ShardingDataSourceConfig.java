package com.example.shardingjdbc.config;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;

@Configuration
@EnableConfigurationProperties(ShardingMasterSlaveConfig.class)
@ConditionalOnProperty({ "sharding.jdbc.data-sources.ds_master.jdbc-url",
		"sharding.jdbc.master-slave-rule.master-data-source-name" })
public class ShardingDataSourceConfig {

	private static final Logger log = LoggerFactory.getLogger(ShardingDataSourceConfig.class);

	@Autowired(required = false)
	private ShardingMasterSlaveConfig shardingMasterSlaveConfig;

	@Bean("dataSource")
	public DataSource masterSlaveDataSource() throws SQLException {
		shardingMasterSlaveConfig.getDataSources().forEach((k, v) -> configDataSource(v));
		Map<String, DataSource> dataSourceMap = new HashMap<>();
		dataSourceMap.putAll(shardingMasterSlaveConfig.getDataSources());
		DataSource dataSource = MasterSlaveDataSourceFactory.createDataSource(dataSourceMap,
				shardingMasterSlaveConfig.getMasterSlaveRule(), new HashMap<>());
		log.info("masterSlaveDataSource config complete");
		return dataSource;
	}

	private void configDataSource(HikariDataSource dataSource) {
		dataSource.setMaximumPoolSize(20);
		dataSource.setMinimumIdle(5);
	}
}

package com.example.springbootrabbitmqelasticsearch.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data // 自动生成 setter getter toString 等方法
@AllArgsConstructor // 自动生成带有所有参数构造器
@NoArgsConstructor // 无参构造
@Builder // build 模式
@Document(indexName = "man", type = "man", shards = 1, replicas = 0, refreshInterval = "-1")
public class Man {

	@NonNull // 不能为null
	@Id
	private String name;

	private String sex;

	private int age;

}

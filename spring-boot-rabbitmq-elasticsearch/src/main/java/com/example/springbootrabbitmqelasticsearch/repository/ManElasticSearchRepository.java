package com.example.springbootrabbitmqelasticsearch.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.springbootrabbitmqelasticsearch.bean.Man;

public interface ManElasticSearchRepository extends ElasticsearchRepository<Man, String> {

	Man findByName(String name);

	List<Man> findByAge(int age);

}

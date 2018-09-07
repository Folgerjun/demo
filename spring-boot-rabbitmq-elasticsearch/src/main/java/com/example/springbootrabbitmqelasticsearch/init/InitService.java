package com.example.springbootrabbitmqelasticsearch.init;

import java.util.Date;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.springbootrabbitmqelasticsearch.bean.Man;
import com.example.springbootrabbitmqelasticsearch.repository.ManElasticSearchRepository;

/**
 * 初始化程序
 * 
 * @author ffj
 *
 */
@Component
@Order(1) // 数字越小执行顺序越早
@RabbitListener(queues = "foo")
@EnableScheduling
public class InitService implements CommandLineRunner { // 主类启动之前执行

	@Autowired
	private ManElasticSearchRepository repository;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public void run(String... args) throws Exception {

		// testElasticSearch();
		// testJersey();
	}

	/**
	 * 测试 rabbitmq
	 */
	@RabbitHandler
	public void process(@Payload String foo) {
		println(new Date() + ": " + foo);
	}

	/**
	 * 测试 Jersey
	 */
	private void testJersey() {

		ResponseEntity<String> entity = restTemplate.getForEntity("http://localhost:8080/hello/test?name=Jersey",
				String.class);
		println("内容为 ：" + entity.getBody());
	}

	/**
	 * 测试 ElasticSearch
	 */
	private void testElasticSearch() {
		// 先删除数据
		repository.deleteAll();
		saveMan();
		printAllMan();
		printMan();
	}

	/**
	 * 存储数据
	 */
	private void saveMan() {
		// 调用构造器
		Man man = new Man("ffj", "男", 23);
		// build 模式
		Man buildMan = Man.builder().age(23).name("ffj2").sex("男").build();

		repository.save(man);
		repository.save(buildMan);

	}

	/**
	 * 输出所有数据
	 */
	private void printAllMan() {
		println("----------输出所有 Man 数据-------------");
		for (Man man : repository.findAll())
			println(man.toString());
		println("----------所有 Man 数据输出完毕-------------");
		println("");
	}

	/**
	 * 输出指定条件数据
	 */
	private void printMan() {
		println("----------输出指定 name = ffj 的 Man 数据-------------");
		println(repository.findByName("ffj").toString());
		println("----------指定 name = ffj 的 Man 数据输出完毕-------------");
		println("");
		println("----------输出指定 age = 23 的 Man 数据-------------");
		for (Man man : repository.findByAge(23))
			println(man.toString());
		println("----------指定 age = 23 的 Man 数据输出完毕-------------");
		println("");
	}

	private void println(String str) {
		System.out.println(str);
	}

}

package com.example.springbootmail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMailApplicationTests {

	@Test
	public void contextLoads() {
	    String filePath = "C:/Users/zjj/Desktop/github/materials/blog/img/WC-GZH.jpg";
        String fileName = filePath.substring(filePath.lastIndexOf("/") + 1);
        System.out.println("fileName:" + fileName);
	}

}

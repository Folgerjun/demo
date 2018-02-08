package com.example.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	private MockMvc mvc;

	@Before
	public void setUp() throws Exception {
		// mvc = MockMvcBuilders.standaloneSetup(new HelloWorld()).build();
	}

	@Test
	public void contextLoads() throws Exception {

		// mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
		// .andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();
	}

}

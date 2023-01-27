package com.java.spring.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkinsApplicationTests {

	static Logger logger =
	LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);


	@Test
	 void contextLoads() {
		logger.info(" TEST CASE EXECUTING ");
		assertEquals(true,true);
	}

}

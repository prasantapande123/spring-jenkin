package com.springjenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringJenkinsApplicationTests {

	
	static Logger logger =LoggerFactory.getLogger(SpringJenkinsApplication.class);
	@Test
	public void contextLoads() {
		logger.info("Test case executed");
		//assertEquals(true,true);
	}

}

package com.shankrish.jenkinscicdpipeline;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsCiCdPipelineApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsCiCdPipelineApplicationTests.class);

	@Test
	public void contextLoads() {

		System.out.println("@SpringBootTest @Test - 1234");
		logger.info("Test case executing...");

	}

	@Test
	public void testRestApi() {

		System.out.println("test my testRestApi - 2222");
		logger.info("Test case of testRestApi...");

	}

}

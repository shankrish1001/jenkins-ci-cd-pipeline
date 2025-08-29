package com.shankrish.jenkinscicdpipeline;

import com.shankrish.jenkinscicdpipeline.service.TestService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsCiCdPipelineApplicationTests {

	@Autowired
	private TestService testService;
	public static Logger logger = LoggerFactory.getLogger(JenkinsCiCdPipelineApplicationTests.class);

	@Test
	void testRestApiTest() {
		logger.info("Test case executing 11...");
		assertEquals("It is from - TestService - getText11 - a1", testService.getText11("a1"));
	}

	@Test
	void testRestApiTest22() {
		logger.info("Test case of testRestApi 2222...");
		assertEquals("It is from - TestService - getText22 - b2", testService.getText22("b2"));
	}

}

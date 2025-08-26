package com.shankrish.jenkinscicdpipeline;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsCiCdPipelineApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsCiCdPipelineApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing...");
	}

}

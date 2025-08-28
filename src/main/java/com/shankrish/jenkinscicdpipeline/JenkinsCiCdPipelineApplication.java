package com.shankrish.jenkinscicdpipeline;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsCiCdPipelineApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsCiCdPipelineApplication.class);

	@PostConstruct
	public void testBegin() {
		logger.info("Jenkins application - PostConstruct");
	}

	public static void main(String[] args) {
		logger.info("Jenkins application - begin");
		SpringApplication.run(JenkinsCiCdPipelineApplication.class, args);

	}

}

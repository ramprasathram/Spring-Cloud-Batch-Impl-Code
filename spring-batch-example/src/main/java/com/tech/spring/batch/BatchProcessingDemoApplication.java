package com.tech.spring.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BatchProcessingDemoApplication {
	public static void main(String[] args) {
		System.out.println("BatchProcessingDemoApplication:main: Start");
		SpringApplication.run(BatchProcessingDemoApplication.class, args);
		System.out.println("BatchProcessingDemoApplication:main: End");
	}

}

package com.tian.springbatch.input.overview;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class InputOverviewDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(InputOverviewDemoApplication.class, args);
	}

}

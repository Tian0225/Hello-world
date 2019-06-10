package com.qianfeng.itemreaderdb;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class itemreaderdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(itemreaderdbApplication.class, args);
	}

}

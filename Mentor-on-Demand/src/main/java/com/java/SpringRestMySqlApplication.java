package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class SpringRestMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestMySqlApplication.class, args);
	}
}

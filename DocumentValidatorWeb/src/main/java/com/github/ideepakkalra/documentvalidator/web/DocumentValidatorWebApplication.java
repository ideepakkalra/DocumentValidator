package com.github.ideepakkalra.documentvalidator.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.github.ideepakkalra.documentvalidator.web.controller, com.github.ideepakkalra.documentvalidator.web.db")
@EntityScan(basePackages="com.github.ideepakkalra.documentvalidator.core")
public class DocumentValidatorWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocumentValidatorWebApplication.class, args);
	}
}

package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({ "com.application.repository.*", "com.application.controller"})
@SpringBootApplication
public class ApplicationProfile {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationProfile.class, args);
		System.out.println("ApplicationProfile");
	}

}

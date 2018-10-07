package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaServer
@SpringBootApplication
public class EurekarerverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekarerverApplication.class, args);
	}
}

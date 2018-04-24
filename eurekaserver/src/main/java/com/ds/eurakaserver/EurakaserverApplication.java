package com.ds.eurakaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurakaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurakaserverApplication.class, args);
	}
}

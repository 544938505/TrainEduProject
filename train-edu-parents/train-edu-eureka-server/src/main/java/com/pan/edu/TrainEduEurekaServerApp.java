package com.pan.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TrainEduEurekaServerApp {

	public static void main(String[] args) {
		SpringApplication.run(TrainEduEurekaServerApp.class, args);
	}

}

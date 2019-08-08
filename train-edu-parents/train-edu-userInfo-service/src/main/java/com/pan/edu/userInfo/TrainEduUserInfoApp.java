package com.pan.edu.userInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TrainEduUserInfoApp {
	public static void main(String[] args) {
		SpringApplication.run(TrainEduUserInfoApp.class, args);
	}
}

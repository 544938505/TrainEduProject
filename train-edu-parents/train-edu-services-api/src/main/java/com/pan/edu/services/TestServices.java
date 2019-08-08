package com.pan.edu.services;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "train-edu-userInfo-service")
public interface TestServices {
	
	@GetMapping("/HelloWord/{info}")
	public String get(@PathVariable("info") String info);
}

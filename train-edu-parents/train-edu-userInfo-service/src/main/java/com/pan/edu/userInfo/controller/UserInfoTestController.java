package com.pan.edu.userInfo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoTestController {

	@RequestMapping("/HelloWord/{info}")
	public String get(@PathVariable("info") String info) {
		return "userInfo ask: " + info;
	}
}

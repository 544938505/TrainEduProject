package com.pan.edu.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pan.edu.services.TestServices;

@RestController
public class TestController {

	@Autowired
	private TestServices testServices;

	@GetMapping("/HelloWord/{info}")
	public String get(@PathVariable("info") String info) {
		return testServices.get(info);
	}

}

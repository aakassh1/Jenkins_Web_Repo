package com.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class JenkinsController {

	@GetMapping({"/status","/health"})
	public String healthCheck() {
		return "Application is running";
	}
	
	@GetMapping("/about")
	public String aboutPage() {
		return "This is about jenkins page";
	}
	
}

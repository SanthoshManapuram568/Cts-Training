package com.cts.traing.spring.web.controller;


	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	@Controller
	@RequestMapping("/employee")
	public class EmployeeController {
	@RequestMapping("/dash")
	public String home() {
	return "emp-home";
	}
	}


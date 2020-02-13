package com.cts.training.mavenweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return  "home";
	}
	
	
	@RequestMapping("/main")
	public String main() {
		return "main-menu";
	}
	
	}


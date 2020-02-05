package com.cts.traing.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
@RequestMapping("/tes")
public String test() {
	return "home-page";
}
}

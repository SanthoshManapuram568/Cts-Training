package com.cts.traing.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/student")
public class StudentController {
@RequestMapping("/dashboard")
public String home() {
return "student-home";
}
@RequestMapping()
public String parent() {
return "student-home";
}
@RequestMapping("*")
public String fallback() {
return "student-error";
}
}


package com.cts.training.maven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.training.maven.dao.IStudentDao;
import com.cts.training.maven.entity.Student;

	@Controller
	@RequestMapping("/student")
	public class StudentController {

	@Autowired
	private IStudentDao studentDao;
	
	@RequestMapping("/all")
	public String showAll(Model model) {
	List<Student> students =this.studentDao.findAll();
	model.addAttribute("students",students);
	
	return "student-list";
}
}

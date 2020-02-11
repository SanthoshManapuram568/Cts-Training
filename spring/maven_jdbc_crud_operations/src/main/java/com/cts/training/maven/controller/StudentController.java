package com.cts.training.maven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.training.maven.dao.IStudentDao;
import com.cts.training.maven.entity.Student;
import com.cts.training.maven.services.IStudentService;

	@Controller
	@RequestMapping("/student")
	public class StudentController {

		@Autowired
		private IStudentService studentService;
		
	@RequestMapping("/all")
	public String showAll(Model model) {
		List<Student> students = this.studentService.findAllStudents();
	model.addAttribute("students",students);
	
	return "student-list";
	
}
	@RequestMapping("/entry")
	public String entry(Model model) {
		Student student=new Student();
		model.addAttribute("student", student);
		return "student-entry";
	}
	@RequestMapping("/save")
	public String save(Student student) {
		this.studentService.addStudent(student);
		return "redirect:/student/all";
	}
	@RequestMapping("/update")
	public String update(@RequestParam Integer id, Model model) {
	Student student = this.studentService.findStudentById(id);
	model.addAttribute("student", student);
	return "student-update";
	}
	@RequestMapping("/save-update")
	public String saveUpdate(@ModelAttribute Student student) {
		this.studentService.updateStudent(student);
		return "redirect:/student/all";
	}
	@RequestMapping("/delete/{studentId}")
	public String delete(@PathVariable Integer studentId) {
		this.studentService.deleteStudent(studentId);
		return "redirect:/student/all";
	}
}

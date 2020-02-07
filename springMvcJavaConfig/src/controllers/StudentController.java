package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import models.*;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/dashboard")
	public String home() {
		return "student-home";
	}
	
	@RequestMapping("/profile")
	public String profile(Model model) {
		Student student = new Student();
	
		model.addAttribute("student", student);
		return "student-profile";
	}
	
	@RequestMapping("/save")
	//@valid for auto validation
	//and result will be in the bind result
	
	public String save(@Valid @ModelAttribute Student student,BindingResult result) {
		
		/*
		 check weather the result has error or not ,
		if it has errors then return back the form ,
		else send confirmation page
		*/
		if(result.hasErrors()) {
			return "student-profile";
		}
		System.out.println("NAME : " + student.getUname());
		System.out.println("EMAIL : " + student.getEmail());

		return "student-confirm";
	}
	
	
	//interceptor was like a filter which filters  the data
	
	@InitBinder //used to register the method as interceptor
	
	public void initBinder(WebDataBinder binder) {
		//the string trimmer method was used to trim the leading , trailing spaces
		//boollean true converts empty string into null
		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		//when ever there is string then apply the trimmer 
		binder.registerCustomEditor(String.class, trimmer);
	}
	
}

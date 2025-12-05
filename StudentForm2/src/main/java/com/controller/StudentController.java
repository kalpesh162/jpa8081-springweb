package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Student;

@Controller
public class StudentController {
	
	@RequestMapping("/")
	public String openWelcomePage() {
		return "welcome";
	}
	
	@RequestMapping(value = "/open")
	public String openStudentForm(Model model) {
		Student student=new Student();
		model.addAttribute("stud", student);
		return "studform";
	}
	
	@RequestMapping(value = "/save" , method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute("stud")Student student) {
		return "display";
	}
	
	
	
}

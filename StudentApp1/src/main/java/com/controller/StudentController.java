package com.controller;
// @GetMapping =@RequestMapping(value = "/new", method = RequestMethod.GET)
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Student;

@RequestMapping("/students")
@Controller
public class StudentController {

	// http://localhost:8080/StudentApp/students/
	@GetMapping("/")//@RequestMapping("/")  // 
	public String openForm() {
		return "welcome";
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String studentRegistrationForm(Model model) {
		model.addAttribute("stud", new Student());
		return "studform";
	}
	
}

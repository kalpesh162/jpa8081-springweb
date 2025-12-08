package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
// @GetMapping =@RequestMapping(value = "/new", method = RequestMethod.GET)
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Student;
import com.service.StudentService;

@RequestMapping("/students")
@Controller
public class StudentController {

	private StudentService service;

	// http://localhost:8080/StudentApp/students/
	@GetMapping("/") // @RequestMapping("/") //
	public String openForm() {
		return "welcome";
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String studentRegistrationForm(Model model) {
		model.addAttribute("stud", new Student());
		return "studform";
	}

	// @RequestMapping(value = "/save", method = RequestMethod.POST)
	@PostMapping("/save")
	public String saveRecord(@ModelAttribute("stud") Student student) {
		System.out.println("  -->  " + student);
		service.addStudent(student);
		return "";
	}
	
	// http://localhsot:8080/StudentApp1/students/delete/11
	@GetMapping("/delete/{id}")
	public String deleteRecord(@PathVariable("id")int id) {
		service.deleteStudent(id);
		return "";
	}

	
	
	public StudentService getService() {
		return service;
	}

	@Autowired
	public void setService(StudentService service) {
		this.service = service;
	}

}

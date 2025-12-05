package com.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Student;

@Controller
public class StudentController {

	@RequestMapping(value = "/open", method = RequestMethod.GET)
	public String studentForm() {
		return "studform";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveStudent(HttpServletRequest request, Model model) {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		double marks = Double.parseDouble(request.getParameter("marks"));
		model.addAttribute("sid", id);
		model.addAttribute("sname", name);
		model.addAttribute("smarks", marks);

		return "display";
	}

	@RequestMapping(value = "/save2", method = RequestMethod.POST)
	public String saveStudent2(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("marks") double marks, Model model) {

		model.addAttribute("sid", id);
		model.addAttribute("sname", name);
		model.addAttribute("smarks", marks);
		return "display";
	}

	// For This We need to Create Student Class
	@RequestMapping(value = "/save3", method = RequestMethod.POST)
	public String saveStudent3(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("marks") double marks, Model model) {
		Student student = new Student(id, name, marks);
		model.addAttribute("stud", student);
		return "display";
	}
	
	// For This We need to Create Student Class
	@RequestMapping(value = "/save4", method = RequestMethod.POST)
	public ModelAndView saveStudent4(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("marks") double marks) {
		Student student = new Student(id, name, marks);

		ModelAndView mav = new ModelAndView("display", "stud", student);

		return mav;
	}

}

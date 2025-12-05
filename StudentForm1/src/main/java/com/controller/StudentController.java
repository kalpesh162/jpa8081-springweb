package com.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

	@RequestMapping(value = "/open",method = RequestMethod.GET)
	public String studentForm() {	
		return "studform";
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String saveStudent(HttpServletRequest request,Model model) {
			int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
			double marks=Double.parseDouble(request.getParameter("marks"));
				model.addAttribute("sid", id);
				model.addAttribute("sname", name);
				model.addAttribute("smarks", marks);
		
		return "display";
	}
	
	
	
}

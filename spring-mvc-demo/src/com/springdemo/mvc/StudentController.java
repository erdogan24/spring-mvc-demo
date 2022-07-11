package com.springdemo.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/student")
public class StudentController {

	@ReguestMapping("/showForm")
	public String showForm(Model theModel) {

		// create a student object
		Student theStudent = new Student();
		// add student object to the model
		theModel.addAttribute("student", theStudent);

		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {

		System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());
		return "student-confirmation";
	}
}

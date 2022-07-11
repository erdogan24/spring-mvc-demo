package com.springdemo.mvc;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// need a controller method to show the initial HTML form

	@RequestMapping("/showForm")
	public String showForm() {

		return "helloworld-form";
	}
	// need a controller method to process the HTML form

	@RequestMapping("/processForm")
	public String RequestMapping() {
		return "helloworld";
	}

	// new a controller method to read form data and
	// add data to the model

	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {

		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");

		// convert the data to all caps
		theName = theName.toUpperCase();

		// create the message
		String result = "hey" + theName;

		// add message to the model
		model.addAttribute("message", result);

		return "helloworld";
	}

	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {

		// convert the data to all caps
		theName = theName.toUpperCase();

		// create the message
		String result = "hey bro" + theName;

		// add message to the model
		model.addAttribute("message", result);

		return "helloworld";
	}
}

package com.springdemo.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class SillyController {

	@RequestMapping("/showForm")
	public String displayTheForm() {
		return "silly";
	}
}

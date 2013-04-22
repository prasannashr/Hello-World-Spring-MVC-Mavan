package com.ace.amadeus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ace.amadeus.services.TestService;

@Controller
public class HelloController {
	
	@Autowired
	TestService testService;

	@RequestMapping(method = RequestMethod.GET, value = "abc")
	public String printWelcome(ModelMap model) {
		
		String str = "Hello World";
		str = testService.printString(str);
		model.addAttribute("message", str);
		return "hello";
	}

	@RequestMapping(method = RequestMethod.GET, value = "cde")
	public String printWelcome2(ModelMap model) {

		model.addAttribute("message", "Hello CDE");
		return "hello";

	}
	
}
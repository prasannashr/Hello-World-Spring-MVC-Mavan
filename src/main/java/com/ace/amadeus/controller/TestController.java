package com.ace.amadeus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/test")
	public String printWelcome(ModelMap model) {
		
		String str = "Hello World test controller";
		model.addAttribute("message", str);
		return "hello";
	}

}

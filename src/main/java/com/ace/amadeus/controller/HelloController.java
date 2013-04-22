package com.ace.amadeus.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ace.amadeus.beans.TestBean;
import com.ace.amadeus.services.TestService;

@Controller
public class HelloController {
	
	@Autowired
	TestService testService;

	
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String index(HttpServletRequest request,HttpServletResponse response,ModelMap model) {
		
		String str = "Simple SpringMVC Index";
		//str = testService.printString(str);
		model.addAttribute("message", str);
		return "hello";
	}
	@RequestMapping(method = RequestMethod.GET, value = "/hello/abc")
	public String printWelcome(ModelMap model) {
		TestBean tb = new TestBean();
		tb.setTest("Hello");
		//String str = "Hello World";
		String str = testService.printString(((TestBean) tb).getTest());
		
		model.addAttribute("message", str);
		return "hello";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/hello/add")
	public String printWelcome2(HttpServletRequest request,HttpServletResponse response,ModelMap model) {
		
		int  a = Integer.parseInt(request.getParameter("a"));
		int  b = Integer.parseInt(request.getParameter("b"));
		int sum = testService.add(a, b);
		model.addAttribute("message", "Addition");
		model.addAttribute("a", a);
		model.addAttribute("b", b);
		model.addAttribute("sum", sum);
		return "hello";

	}
	
}
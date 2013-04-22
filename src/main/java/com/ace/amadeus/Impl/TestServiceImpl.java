package com.ace.amadeus.Impl;

import org.springframework.stereotype.Service;

import com.ace.amadeus.services.TestService;

@Service
public class TestServiceImpl implements TestService{

	
	public String printString(String str) {
				
		str+=" Acetravels.com speaking..";
		return str;
		
	}

}

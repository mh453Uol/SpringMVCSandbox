package com.in28minutes.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
// This is a controller mapping url should look like
// http://localhost:8080/About/Index this makes a logical
// urls (ASP.NET uses this routing convention)
@RequestMapping(value = "/about") 
public class AboutController {
	
	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String About(){
		return "/about";
	}
}

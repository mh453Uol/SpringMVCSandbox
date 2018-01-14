package com.in28minutes.springmvc;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
	
	//@RequestMapping(value = "/greeting") dispatcherServlet 
	//chooses controller based on value. It looks at trailing url and compares
	
	@RequestMapping(value = "/greeting",method = RequestMethod.GET)
	public String Welcome(@RequestParam(required = false) String name,
			ModelMap model,
			HttpServletRequest request){
		
		String ip = request.getRemoteAddr();
		String ipBehindProxy = request.getHeader("X-FORWARDED-FOR");
		
		model.put("name", name);
		model.put("ip", ip);
		model.put("ipBehindProxy", ipBehindProxy);
		
		return "greeting";
	}
	
	@RequestMapping(value = "/bye", method = RequestMethod.GET)
	public ModelAndView bye(){
		
		//Data displayed on the ui. Constructor I pass view name
		ModelAndView model = new ModelAndView("bye");
		model.addObject("message", "See you again!");
		
		return model;
	}
	
	//{pathVariable} this means the url is dynamic we can have 
	///welcome/en-GB or /welcome/aue
	//This is called a path variable we can get path value by 
	//using the annotation. Path variable are required!
	@RequestMapping(value = "/welcome/{countryISOCode}")
	public ModelAndView Index(
			@PathVariable("countryISOCode") String isoCode){
		
		ModelAndView model = new ModelAndView("index");
		model.addObject("isoCode",isoCode);
		
		return model;
	}
	
	@RequestMapping(value = "/welcome/{countryISOCode}/{region}")
	@ResponseBody //This method will return output - HTTPResponse
	public String IndexMap(@PathVariable Map<String,String> paths){
		String output = "";
		output += paths.get("countryISOCode") + ":";
		output += paths.get("region");
		return output;
	}
}

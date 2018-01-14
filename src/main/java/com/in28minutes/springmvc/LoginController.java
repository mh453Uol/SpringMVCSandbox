package com.in28minutes.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.in28minutes.jee.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService service; //Dependency Injection

	/*
	 * @RequestMapping(value = "/login")
	 * 
	 * @ResponseBody // By Default string is the view or a url // however we
	 * want to return "Hello World so add annotation public String sayHello(){
	 * return "Hello World "; }
	 */

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String postLogin(@RequestParam String name, @RequestParam String password, ModelMap model) {

		if (!service.validateUser(name, password)) {
			model.put("errorMessage", "Could not valid user");
			return "login";
		}
		model.put("name", name);
		model.put("password", password);
		return "welcome";
	}
}

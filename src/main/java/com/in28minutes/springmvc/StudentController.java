package com.in28minutes.springmvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.in28minutes.models.Student;

@Controller
@RequestMapping(value = "/student")
public class StudentController {
	
	@RequestMapping(value = "/admission", method = RequestMethod.GET)
	public String getAdmissionForm(){
		return "/student/admission";
	}
	
	/*
	 * 	*************Refactored Below******************* 
	//RequestParam(value = "bindTo", 
	//required=boolean, 
	//defaultValue=if not specified us this)
	@RequestMapping(value = "/admission", method = RequestMethod.POST)
	public ModelAndView postAdmissionForm(
			@RequestParam(value = "country", defaultValue = "England") String country,
			@RequestParam Map<String,String> params){
		
		String errors = "";
		ModelAndView model = new ModelAndView();
		
		if(params.get("firstname").isEmpty()){
			errors += "Firstname is required \n";
		}
		
		if(params.get("surname").isEmpty()){
			errors += "Surname is required \n";
		}
		
		if(params.get("dob").isEmpty()){
			errors += "Date of birth is required \n";
		}
				
		model.addObject("firstname", params.get("firstname") == null ? "" : params.get("firstname"));
		model.addObject("surname", params.get("surname") == null ? "" : params.get("surname"));
		model.addObject("dob", params.get("dob") == null ? "" : params.get("dob"));
		model.addObject("country", country);
		
		if(errors.length() > 0){
			model.setViewName("/student/admission");
			model.addObject("error", errors);
			return model;
		}
		
		model.setViewName("/student/success");
		return model;
	}
	*/
	
	/* *****Refactored rather than getting request param seperatly we 
	 * can allow Spring to bind it to a student object like asp.net ******
	@RequestMapping(value = "/admission", method = RequestMethod.POST)
	public ModelAndView postAdmissionForm(
			@RequestParam(value = "country", defaultValue = "England") String country,
			@RequestParam Map<String,String> params) throws ParseException{
		
		String errors = "";
		ModelAndView model = new ModelAndView();
		
		if(params.get("firstname").isEmpty()){
			errors += "Firstname is required \n";
		}
		
		if(params.get("surname").isEmpty()){
			errors += "Surname is required \n";
		}
		
		if(params.get("dob").isEmpty()){
			errors += "Date of birth is required \n";
		}
		
		//Creating a model which a jsp view uses;
		Student student = new Student(
				params.get("firstname"),
				params.get("surname"),
				params.get("dob"),
				country);
		
		model.addObject("student",student);
				
		if(errors.length() > 0){
			model.setViewName("/student/admission");
			model.addObject("error", errors);
			return model;
		}
		
		model.setViewName("/student/success");
		return model;
	}
	*/
	
	@RequestMapping(value = "/admission", method = RequestMethod.POST)
	public ModelAndView postAdmissionForm(
			//For model binding to work the names of the input and object
			//must be the same!!!
			
			//@Valid when doing data binding execute annotation
			
			@Valid @ModelAttribute("student") Student student,
			BindingResult result,
			ModelAndView model) {
		
		//**IMPORTANT**
		//BindingeResult has to be directly after @ModelAttribute
		//BindingResult contains all the binding errors so it may try to 
		//convert abc to long BindingResult will catch this
		
		if(result.hasErrors()){
			model.setViewName("/student/admission");
			return model;
		}
		
//		if(!student.isValid()){
//			model.setViewName("/student/admission");
//			model.addObject("error", student.error);
//			return model;
//		}
		
		model.setViewName("/student/success");
		return model;
	}
	

}

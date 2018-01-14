package com.in28minutes.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String>{

	@Override
	public void initialize(IsValidHobby arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		if(arg0 == null){
			return false;
		}
		
		if(arg0.matches("Music|Football|Cricket|Hockey")){
			return true;
		} else {			
			return false;
		}
	}
}

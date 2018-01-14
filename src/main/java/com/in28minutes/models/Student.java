package com.in28minutes.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.in28minutes.validators.IsValidHobby;

public class Student {
	//These must be object so Integer not int!
	
	//Validation annotation same as ASP.NET
	@NotEmpty
	@Size(min=2,max=150)
	@Pattern(regexp = "[^0-9]*") //Not any number
	private String firstname;
	
	@NotEmpty
	@IsValidHobby
	private String surname;
    
	@DateTimeFormat(pattern = "yyy-MM-dd")
    @Past
	private Date dateOfBirth;
	
	@NotEmpty
	private String country;
	
	@NotEmpty
	private ArrayList<String> skills = new ArrayList<String>();
	
	public String error;
	
	@Max(1000)
	private Long mobile;
	
	private Address address;

	public Student(){}
	
	public Student(String firstname, String surname, String dateOfBirth, String country) throws ParseException {
		super();
		this.firstname = firstname;
		this.surname = surname;
		if(dateOfBirth != null && !dateOfBirth.isEmpty()){	
			SimpleDateFormat parse = new SimpleDateFormat("yyyy-dd-MM");
			this.dateOfBirth = parse.parse(dateOfBirth);
		}
		this.country = country;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public boolean isValid(){
		String error = "";
		boolean isValid = true;
		
		if(firstname == null || firstname.isEmpty()){
			isValid = false;
			error += "Firstname is required,";
		}
		
		if(surname == null || surname.isEmpty()){
			isValid = false;
			error += "Surname is required,";
		}
		
		if(dateOfBirth == null){
			isValid = false;
			error += "Date of birth is required";
		}
		
		if(mobile == null){
			isValid = false;
			error += "Mobile is required";
		}
		if(skills == null || skills.size() == 0){
			isValid = false;
			error += "At least one skill me be selected";
		}
		this.error = error;
		return isValid;
	}
}

package com.in28minutes.models;

import org.hibernate.validator.constraints.NotEmpty;

public class Address {
	@NotEmpty
	private String country;
	
	@NotEmpty
	private String city;
	
	@NotEmpty
	private String street;
	
	@NotEmpty
	private String pincode;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
}

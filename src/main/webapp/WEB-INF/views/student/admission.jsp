<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- This tag libary is used for the errors output which spring mvc gives us -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>﻿
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admission</title>
</head>
<body>
<h1>Student Admission</h1>
<hr>

<form action="./admission" method="POST">

<!-- Spring MVC will display all errors on server -->

<form:errors path="student.*"/>
<p>${error}</p>
<!-- For ModelAttribute binding the name of the form element have to match object variable names -->
<label for="firstname">Firstname</label>
<input type="text" name="firstname" value="${student.firstname}">
<br>
<label for="surname">Surname</label>
<input type="text" name="surname" value="${student.surname}">
<br>
<label for="dateOfBirth">Date of birth:</label>
<input type="date" name="dateOfBirth" value="${student.dateOfBirth}">
<br>
<label for="country">Contry:</label>
<input type="text" name="country" value="${student.country}">
<br>
<label for="mobile">Mobile:</label>
<input type="text" name="mobile" value="${student.mobile}">
<br>
<label for="skills">Skills:</label>

<select name="skills" multiple>
	<option value="Java Core">Java Core</option>
	<option value="Spring Core">Spring Core</option>
	<option value="Spring MVC">Spring MVC</option>
</select>

<h1>Addres</h1>
<hr>

<label for="address.country">Country:</label>
<input type="text" name="address.country" value="${student.address.country}">
<br>
<label for="address.city">City:</label>
<input type="text" name="address.city" value="${student.address.city}">
<br>
<label for="address.street">Street:</label>
<input type="text" name="address.street" value="${student.address.street}">
<br>
<label for="address.pincode">Pincode:</label>
<input type="text" name="address.pincode" value="${student.address.pincode}">
<br>
<input type="submit" value="submit">

</form>
</body>
</html>


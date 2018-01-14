<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Success Admissio</title>
</head>
<body>
<h1>Successful Admission</h1>
<hr>

<p>Firstname: ${student.firstname}</p>
<p>Surname: ${student.surname}</p>
<p>Date of birth: ${student.dateOfBirth}</p>
<p>Country: ${student.country}</p>
<p>Mobile: ${student.mobile}</p>
<p>Skills: ${student.skills}</p>

<h1>Address</h1>

<p>Country: ${student.address.country}</p>
<p>City: ${student.address.city}</p>
<p>Street: ${student.address.street}</p>
<p>Pincode: ${student.address.pincode}</p>

</body>
</html>
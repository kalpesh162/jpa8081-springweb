<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
<link href="<c:url value='/css/form.css' />" rel="stylesheet">
</head>
<body>
	<h1>Student Registartion Form</h1>

	<form:form action="save" method="post" modelAttribute="stud">
       FirstName : <form:input path="firstName" />
		<br>
       LastName : <form:input path="lastName" />
		<br>
       Gender : <form:radiobutton path="gender" value="MALE" /> Male  <br>
		<form:radiobutton path="gender" value="FEMALE" />Female<br>
       Courses : 
        <form:checkbox path="courses" value="JAVA" />JAVA  <br>
		<form:checkbox path="courses" value="CPP" />CPP    <br>
		<form:checkbox path="courses" value="C#" />C#      <br>
		<form:checkbox path="courses" value="GO" />GO      <br>
      Year Of Passing :
          <form:select path="yearOfPassing">
			<form:option value="20005">2005</form:option>
			<br>
			<form:option value="20006">2006</form:option>
			<br>
			<form:option value="20007">2007</form:option>
			<br>
			<form:option value="20008">2008</form:option>
			<br>
			<form:option value="20009">2009</form:option>
			<br>
		</form:select>
		<input type="submit" value="Register">
	</form:form>



</body>
</html>
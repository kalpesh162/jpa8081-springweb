<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>
<body>
	<h1>Student Form</h1>

	<form:form action="save" method="post" modelAttribute="stud">
		<label> Id</label>
		<form:input path="id" />
		<br>
		<label> Name</label>
		<form:input path="name" />
		<br>
		<label> Marks</label>
		<form:input path="marks" />
		<br>
		<input type="submit" value="SAVE">

	</form:form>
</body>
</html>
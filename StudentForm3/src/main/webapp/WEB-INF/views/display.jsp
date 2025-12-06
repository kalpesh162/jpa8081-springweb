<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>
	 FirstName : ${stud.firstName} <br>
	 LastName : ${stud.lastName} <br>
	 Gender : ${stud.gender} <br>
	 Courses :
	          <c:forEach var="course" items="${stud.courses}">
	             ${course} |
	          </c:forEach>  <br>
 	Year of Passing : ${stud.yearOfPassing }
	</h1>


</body>
</html>
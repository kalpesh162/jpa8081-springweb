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

	<table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>MARKS</th>
			<th>UPDATE</th>
			<th>DELETE</th>
		</tr>
		<c:forEach var="student" items="${studList}">
			<tr>
				<td><c:out value="${student.id}"></c:out></td>
				<td><c:out value="${student.name}"></c:out></td>
				<td><c:out value="${student.marks}"></c:out></td>
				<td><a href='<c:out value="edit/${student.id}"></c:out>'>UPDATE</a></td>

				<td><a href='<c:out value="delete/${student.id}"></c:out>'>DELETE</a></td>
			</tr>
		</c:forEach>
	</table>



</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	String username = (String) request.getAttribute("username");
	String password = (String) request.getAttribute("password");

	out.print(username + " " + password);
	%>

</body>
</html>
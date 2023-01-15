<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>This is Home Page</h1>
<a href="<%=request.getContextPath()%>/home/index">Home</a>
<a href="<%=request.getContextPath()%>/contact/index">Contact</a>
<a href="<%=request.getContextPath()%>/news/index">News</a>
</body>
</html>
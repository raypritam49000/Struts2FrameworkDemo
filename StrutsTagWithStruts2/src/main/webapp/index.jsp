<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Form</title>
</head>
<body>

	<s:url action="hello" var="helloLink">
       <s:param name="firstName">World</s:param>
	</s:url>

	<s:form action="hello" method="post">
		<s:textfield name="firstName" label="Please tell me your name"
			value="world" />
		<s:submit value="submit" />
	</s:form>
	
	<p>
	 <a href="${helloLink}">Do the Hello World</a>
	</p>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Person</title>
</head>
<body>
	<s:label>Add Person</s:label>

	<s:form action="addPerson.action">
		<s:textfield name="person.name" label="name"></s:textfield>
		<s:textfield name="person.city" label="city"></s:textfield>
		<s:textfield name="person.salary" label="salary"></s:textfield>
		<s:submit value="login"></s:submit>

	</s:form>

    <s:a action="listPerson.action">Show Data</s:a>
</body>
</html>
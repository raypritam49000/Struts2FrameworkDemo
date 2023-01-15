<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Thankyou Page</title>
</head>
<body>

	<h3>Thanks for registering!</h3>
	<p>You information submitted was :</p>
	<s:property value="personBean" />
	<s:property value="personBean.firstName" />
	<s:property value="personBean.lastName" />
	<s:property value="personBean.email" />
	<s:property value="personBean.age" />
</body>
</html>
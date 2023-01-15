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
     
     <h2>Hey , why don't you register</h2>

	<s:form action="register" method="post">
		<s:textfield name="personBean.firstName" type="text" label="Enter First Name" placeholder="Enter First Name" />
		<s:textfield name="personBean.lastName" type="text" label="Enter Last Name" placeholder="Enter Last Name" />
		<s:textfield name="personBean.email" type="email" label="Enter Email Name" placeholder="Enter Email Name" />
		<s:textfield name="personBean.age" type="number" label="Enter Your Age" placeholder="Enter Your Age"/>
		<s:submit value="submit" />
	</s:form>
	

</body>
</html>
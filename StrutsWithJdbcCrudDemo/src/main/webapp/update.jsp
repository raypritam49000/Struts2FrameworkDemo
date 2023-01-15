<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body>
	<h2>Struts 2 Create, Read, Update and Delete (CRUD) Example using
		JDBC</h2>
	<form action="updateuser.action" method="post">
		<pre>
<b>Id:         </b><input type="text" name="id"
				value='<s:property value="user.id"/>'>
				
<b>Name:         </b><input type="text" name="name"
				value='<s:property value="user.name"/>'>
		
		
<b>Email:        </b><input type="email" name="email"
				value='<s:property value="user.email"/>'>
				
		      
		
<b>City:     </b><input type="text" name="city"
				value='<s:property value="user.city"/>'>
				
<b>Salary:     </b><input type="text" name="salary"
				value='<s:property value="user.salary"/>'>
		
		<button name="submit" value="update" type="submit">Update</button>
		
		</pre>
	</form>

</body>
</html>
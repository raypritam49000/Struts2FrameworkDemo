<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Report</title>
<style>
table, td, th {
	border: 1px solid black;
}

table {
	border-collapse: collapse;
	width: 60%;
}

th {
	height: 30px;
}

.button-update {
	background-color: #008CBA;
	color: white;
}

.button-delete {
	background-color: red;
	color: white;
}
</style>
</head>
<body>
	<h2>Struts 2 Create, Read, Update and Delete (CRUD) Example using
		JDBC</h2>
	<div style="margin-top: 40px;">
			<table>
				<thead>
					<tr style="background-color: #E0E0E1;">
						<th>Id</th>
						<th>Name</th>
						<th>Email</th>
						<th>City</th>
						<th>Salary</th>
						<th>Action</th>
					</tr>
				</thead>
				<s:iterator value="userList">
					<tr>
						<td><s:property value="id" /></td>
						<td><s:property value="name" /></td>
						<td><s:property value="email" /></td>
						<td><s:property value="city" /></td>
						<td><s:property value="salary" /></td>
						<td>
						
						<a href="updateuserform.action?id=<s:property value="id"/>">
								<button class="button-update">Update</button>
						</a> 
						
						<a href="deleteuser.action?id=<s:property value="id"/>">
								<button class="button-delete">Delete</button>
						</a>
						
						</td>
					</tr>
				</s:iterator>
			</table>
	</div>
</body>
</html>
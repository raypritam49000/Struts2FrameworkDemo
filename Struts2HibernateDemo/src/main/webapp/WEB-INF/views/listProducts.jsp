<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products List</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js"
	integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js"
	integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container text-center">
	    <a class="btn btn-secondary mt-5" href="<%=request.getContextPath()%>/addProductForm">Add PRODUCT</a>
		<h1 class="text-center">Product List</h1>
		<table class="table shadow">
			<thead class="bg-primary text-white">
				<tr>
					<th scope="col">#ID</th>
					<th scope="col">NAME</th>
					<th scope="col">PRICE</th>
					<th scope="col">QUANTITY</th>
					<th scope="col">ACTION</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="product" items="${products}">

					<tr>
						<th scope="row">${product.id}</th>
						<td>${product.name}</td>
						<td>${product.price}</td>
						<td>${product.quantity}</td>
						<td>
						 <a class="btn btn-danger" href="<%=request.getContextPath() %>/deleteProduct?id=${product.id}">DELETE</a>
						 <a class="btn btn-success" href="<%=request.getContextPath() %>/updateFormProduct?id=${product.id}">UPDATE</a>
						</td>
					</tr>

				</c:forEach>

			</tbody>
		</table>
	</div>
</body>
</html>
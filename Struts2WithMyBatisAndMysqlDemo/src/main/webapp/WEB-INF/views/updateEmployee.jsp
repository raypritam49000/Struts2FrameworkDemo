<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
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

<div class="container">
		<div class="row">

			<div class="col col-md-8 offset-md-2">

				<div class="card mt-5">

					<div class="card-header text-center">
					   <h3>Update Employee</h3>
					</div>

					<div class="card-body">

						<!-- Start Form -->


						<form action="updateEmployee" method="post">
						
						    <div class="mb-3">
								<label for="id" class="form-label">Enter Id</label> 
								<input type="text" class="form-control input-sm" id="id" name="id" value="${employee.id}" readonly="readonly">
							</div>
						
							<div class="mb-3">
								<label for="name" class="form-label">Enter Name</label> 
								<input type="text" class="form-control input-sm" id="name" name="name" value="${employee.name}">
							</div>
							
							<div class="mb-3">
								<label for="city" class="form-label">Enter City</label> 
								<input type="text" class="form-control input-sm" id="city" name="city" value="${employee.city}">
							</div>
							
							<div class="mb-3">
								<label for="salary" class="form-label">Enter Salary</label> 
								<input type="text" class="form-control input-sm" id="salary" name="salary" value="${employee.salary}">
							</div>
							
							<button type="submit" class="btn btn-primary">Submit</button>
						</form>

						<!-- End Form -->
					</div>


				</div>


			</div>

		</div>
	</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Product</title>
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
					   <h3>Update Product</h3>
					</div>

					<div class="card-body">

						<!-- Start Form -->


						<form action="updateProduct" method="post">
						
						    <div class="mb-3">
								<label for="name" class="form-label">Product Id</label> 
								<input type="text" class="form-control input-sm" id="name" name="product.id" value="${product.id}">
							</div>
						
							<div class="mb-3">
								<label for="name" class="form-label">Product Name</label> 
								<input type="text" class="form-control input-sm" id="name" name="product.name" value="${product.name}">
							</div>
							
							<div class="mb-3">
								<label for="price" class="form-label">Product Price</label> 
								<input type="text" class="form-control input-sm" id="price" name="product.price" value="${product.price}">
							</div>
							
							<div class="mb-3">
								<label for="quantity" class="form-label">Product Quantity</label> 
								<input type="text" class="form-control input-sm" id="quantity" name="product.quantity" value="${product.quantity}">
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
<html>
	<head>
		<%@include file="./base.jsp" %>
	</head>
	<body>
		<div class="container mt-3">
			<div class="row">
				<div class="col-md-6 offset-md-3">
					<h1 class="text-center mb-3">Fill the Product Details</h1>
					<form action="handleProduct" method="post">
						<div class="form-group">
							<label for="name">Product Name</label>
							<input type="text" id="name" name="name" placeholder="Enter the product name here" class="form-control">
						</div>
						
						<div class="form-group">
							<label for="name">Product Description</label>
							<textarea class="form-control" rows="5" name="description" placeholder="Enter product description"></textarea>
						</div>
						
						<div class="form-group">
							<label for="name">Product Price</label>
							<input type="text" id="name" name="price" placeholder="Enter the product price" class="form-control">
						</div>
						<div class="container text-center">
							<a href="${pageContext.request.contextPath }/" class="btn btn-outline-danger">Back</a>
							<button type="submit" class="btn btn-outline-primary">Add</button>
						</div>
						
					</form>
				</div>
			</div>
		</div>
	</body>
</html>
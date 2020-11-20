<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false" %>
<html>
	<head>
		<%@include file="./base.jsp" %>
	</head>
	<body>
		<div class="container mt-3">
			<div class="row">
				<div class="col-md-6 offset-md-3">
					<h1 class="text-center mb-3">Change Product Details</h1>
					<form action="${pageContext.request.contextPath }/handleProduct" method="post">
						<input type="text" value="${product.id }" name="id">
						<div class="form-group">
							<label for="name">Product Name</label>
							<input value="${product.name }" type="text" id="name" name="name" placeholder="Enter the product name here" class="form-control">
						</div>
						
						<div class="form-group">
							<label for="name">Product Description</label>
							<textarea  class="form-control" rows="5" name="description" placeholder="Enter product description">${product.description }</textarea>
						</div>
						
						<div class="form-group">
							<label for="name">Product Price</label>
							<input value="${product.price }" type="text" id="name" name="price" placeholder="Enter the product price" class="form-control">
						</div>
						<div class="container text-center">
							<a href="${pageContext.request.contextPath }/" class="btn btn-outline-danger">Back</a>
							<button type="submit" class="btn btn-outline-warning">Update</button>
						</div>
						
					</form>
				</div>
			</div>
		</div>
	</body>
</html>
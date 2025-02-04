<%@page import="com.sathya.jdbcex.ProductDao" import="java.util.Base64" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.0/dist/css/bootstrap.min.css" rel="stylesheet"></link>
<title>Product List</title>
</head>
<body>
	<h1 class="text-primary text-center">List of Avalibale product:</h1>
	<div>
	<a class="btn btn-success" href="add_product.html">save product</a></div>
	<br>
	<input type="text" placeholder="search"/>
	<br>
	<c:if test="${saveResult==1}"> 
	<h2 class="text-success text-center">Data Inserted Successfull.....></h2>
	<br>
	</c:if>
	<br>
	<c:if test="${DeleteResult==1}">
	<h1 class="text-danger text-center">Data Delete Successfully....</h1>
	</c:if>
	<br>
	<c:if test="${DeleteResult==0}">
	<h1 class="text-danger text-center">Data Fail....</h1>
	</c:if>
	
	<table class="table table-bordered table-striped" >
	<thead class="thead-dark">
			<tr>
				<th>Product ID</th>
				<th>Product Name</th>
				<th>Product Cost</th>
				<th>Product Brand</th>
				<th>Made In</th>
				<th>Manufacture Date</th>
				<th>Expiry Date</th>
				<th>Image</th>
				<th>Audio</th>
				<th>Video</th>
				 <th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="product" items="<%= new ProductDao().getAllProducts() %>">
				<tr>
					<td>${product.proId}</td>
					<td>${product.proName}</td>
					<td>${product.proPrice}</td>
					<td>${product.proBrand}</td>
					<td>${product.proMadeIn}</td>
					<td>${product.proMfgDate}</td>
					<td>${product.proExpDate}</td>
					<td>
					<img  src="data:image/jpeg; base64,${Base64.getEncoder().encodeToString(product.proImage)}" alt="Product Image" style="max-width:100px;max-height:100px;"></td>
					<td>
					<audio controls src="data:audio/mpeg;base64,${Base64.getEncoder().encodeToString(product.proAudio)}"  style="width:200px;"></audio></td>
					<td>
					<video controls src="data:video/mp4;base64,${Base64.getEncoder().encodeToString(product.proVideo)}" style="width:160px;height:120px;"></video></td>
					<td>
					<a class="btn btn-primary" href="./DeleteproductServlet?proId=${product.proId}">Delete</a>
					<a class="btn btn-primary" href="./EditproductServlet?proId=${product.proId}">Edit</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
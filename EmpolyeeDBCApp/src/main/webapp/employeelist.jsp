<%@page import="com.sathya.servlet.EmployeeDao"  import="java.util.Base64" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.0/dist/css/bootstrap.min.css" rel="stylesheet"></link>
<title>Employee List</title>
</head>
<body>
<h1 class="text-primary text-center">List of Avalibale Employee:</h1>
	<div>
	<a class="btn btn-success" href="add_Employee.html">save employee</a></div>
	<br>
	<input type="text" placeholder="serch"/>
	<br>
	<c:if test="${saveResult==1}"> 
	<h2 class="text-success text-center">Data Inserted Successfull.....></h2>
	</c:if>
	<br>
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
				<th>Employee ID</th>
				<th>Employee Name</th>
				<th>Employee Salary</th>
				<th>Employee Phono</th>
				<th>Employee Date</th>
				
				<th>Image</th>
				<!-- <th>Actions</th> -->
			</tr>
		</thead>
		<tbody>
			<c:forEach var="employee" items="<%= new EmployeeDao().getAllEmployees() %>">
				<tr>
					<td>${employee.empId}</td>
					<td>${employee.empName}</td>
					<td>${employee.empSalary}</td>
					<td>${employee.empPhono}</td>
					<td>${employee.empDate}</td>
					<td>
					<img  src="data:image/jpeg; base64,${Base64.getEncoder().encodeToString(employee.empImage)}" alt="Employee Image" style="max-width:100px;max-height:100px;">
					</td>
					<td>
					<a class="btn btn-primary" href="./DeleteEmployeeServlet?empId=${employee.empId}">Delete</a>
					<a class="btn btn-primary" href="./EditEmployeeServlet?empId=${employee.empId}">Edit</a>
					</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
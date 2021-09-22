<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<!-- reference our style sheet -->
	<title>Save Customers</title> 



	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
		  
		  
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css" />


</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	
	<!--  <img
        src="${pageContext.request.contextPath}/resources/images/pubg.jpg" /> -->
	
		<div id="container">
		<h3>Save Customer</h3>
		<form:form action="saveCustomer" modelAttribute="customer" method="POST">
		
		<!--  here we have used modelAttribute="customer" to load the empty Cutomer object
		it will firstly load the getters after you submit it will load the setters.  -->
						<!-- need to associate this data with customer id -->
						<form:hidden path="id"/>
		
		
		<table>
		<tbody>
			<tr>
					<td><label>FirstName:</label></td>
					<td><form:input path="firstName" type="text"/></td>
			</tr>
			
			
			<tr>
					<td><label>LastName:</label></td>
					<td><form:input path="lastName" /></td>
			</tr>
			
			
			<tr>
					<td><label>email:</label></td>
					<td><form:input path="email" /></td>
			</tr>
			
			
			<tr>
					<td><label></label></td>
					<td><input type="submit" value="save"/></td>
			</tr>
			
		</tbody>
		</table>
		</form:form>
		
		
					<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
		</p>
	
					</div>
		
		
	
	</div>
	

</body>
</html>
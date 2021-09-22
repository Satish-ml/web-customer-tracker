<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Customers</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
					<!--  add button -->
					<input type="button" value="Add Customer"
					onclick="window.location.href='showFormForAdd'; return false;"
					class="add-button"/>
					<br>
		
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${customerss}">
				
				<!-- construct an upate link with customer id -->
			  <c:url var="updatelink" value="/customer/showFormForUpdate">	
			  <c:param name="customerid" value="${tempCustomer.id}"></c:param>
			  </c:url>	
				
				
				
						<!-- construct an delete link with customer id -->
			  <c:url var="deletelink" value="/customer/delete">	
			  <c:param name="customerid" value="${tempCustomer.id}"></c:param>
			  </c:url>	
				
					<tr>
						<td> ${tempCustomer.firstName} </td>
						<td> ${tempCustomer.lastName} </td>
						<td> ${tempCustomer.email} </td>
						
					<!-- display the upate link -->
					<td><a href="${updatelink}">update</a>
					|
					<a href="${deletelink}"
					onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">delete</a></td>	
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>










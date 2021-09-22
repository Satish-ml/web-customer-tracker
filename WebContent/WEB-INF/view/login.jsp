<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>
<head>
	<title>Login form</title>
		

</head>
<body>


	<h1>Login</h1>

		<form:form action="login-suc" modelAttribute="lon"  method="POST">
		
		
		<table>
		<tbody>
			<tr>
					<td><label>FirstName:</label></td>
					<td><form:input path="name" type="text"/></td>
			</tr>
			
			
			<tr>
					<td><label>Password:</label></td>
					<td><form:input path="pass" type="password"/></td>
			</tr>
			
			
			
			
			
			<tr>
					<td><label></label></td>
					<td><input type="submit" value="save"/></td>
			</tr>
			
		</tbody>
		</table>
		
	
</form:form>
</div>
  </body>
</html>

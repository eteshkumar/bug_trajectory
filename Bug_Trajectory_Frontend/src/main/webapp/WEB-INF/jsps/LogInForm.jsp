<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
    <c:set var="path" value="${pageContext.request.contextPath}" scope="application"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LoginPage</title>
</head>
<body>
<form action="LogIn" method="post">
<h1>UserLogIn</h1>
<table>
	<tr>
		<td>User Id:</td>
		<td><input type="number" name="userid" required> </td>
	</tr>
	
	<tr>
		<td>Password:</td>
		<td><input type="password" name="password" required></td>
		</tr>
		<tr>
		<td></td>
		<td><input type="submit" value="LogIn"></td>
		</tr>
</table>
</form>
</body>
</html>
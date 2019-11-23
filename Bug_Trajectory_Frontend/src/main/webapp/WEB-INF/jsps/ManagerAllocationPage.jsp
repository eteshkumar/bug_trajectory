<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ManagerProjectAllocationPage</title>
</head>
<body>
<div align="center" style="color:red">
	<h1>Welcome Manager-${uObj.username} </h1>
	
<form action="Manager" method="post">
	<table>
		<tr>
			<td>Select Project:-</td>
			<td><select name="project" >
			<option value="none">---------Select Project---------</option>
			<c:forEach items="${ProjectList}" var="plist">
			<option value="${plist.p_Id}">
			${plist.p_name}</option>
			</c:forEach>
			</select>
			</td>
		</tr>
		<tr>
			<td>Select Developer:-</td>
			<td><select name="Developer" multiple>
			<option value="none">---------Select Developer---------</option>
			<c:forEach items="${developerList}" var="dlist">
			<option value="${dlist.userid}">
			${dlist.username}</option>
			</c:forEach>
			</select>
			</td>
		</tr>
		
		<tr>
			<td>Select Tester:-</td>
			<td><select name="Tester" multiple>
			<option value="none">---------Select Tester---------</option>
			<c:forEach items="${testerList}" var="tlist">
			<option value="${tlist.userid}">
			${tlist.username}</option>
			</c:forEach>
			</select>
			</td>
		</tr>
		<td></td>
		<td><input type="submit" value="Allocate"></td>
	</table>

</form>	
</div>
</body>
</html>
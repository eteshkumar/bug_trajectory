<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TesterLogInPage</title>
</head>
<body>
<div align="center" style="color:red">
	<h1>Welcome Tester-${uObj.username} </h1>
	

<form action="test">
	
	<table>
		<tr>
			<td>Project List</td>
			<td>Allocate</td>
		</tr>
		
		<c:forEach items="${ProjectList}" var="pList">
		<tr>
			<td>${pList.p_name}</td>
			
			<td><a href="BugAllocate/${pList.p_Id}">Allocate Bug</a></td>
		</tr>
		</c:forEach>
	</table>
		</form>
	</div>
</body>
</html>
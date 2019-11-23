<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DeveloperLogInPage</title>
</head>
<body>
<div align="center" style="color:red">
	<h1>Welcome Developer-${uObj.username} </h1>
	
	<form>
		<table>
			<tr>
				<td>Developer Name:-</td>
				<td><input type="text" value="${uObj.username}" readonly="readonly"></td>
			</tr>
			
		<tr>
			<td>Select Project:-</td>
			<td><select name="project">
			<option value="none">------Select Project------</option>
			<c:forEach items="${developerList}" var="devList">
			<option value="${devList.p_Id}">
			${devList.p_name}
			</option>
			</c:forEach>
			</select>
			</td>
		</tr>
		<tr>
		<td></td>
		<td><input type="submit" value="Send"></td>
		</tr>
		</table>
	</form>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BugReportPage</title>
</head>
<body>
	
	${msg}
	<form action="BugSuccessfullyAllocated" method="get">
		<table>
			<tr>
				<td> Tester Name: </td>
				<td> <input type="text" value="${uObj.username}" readonly="readonly"></td>
			</tr>
			<tr>
				<td> Project Name: </td>
			<td> 
 				<input type="text" value="${projectObj.p_name}" readonly="readonly">

 			</td>
			</tr>
		<tr>
      		<td> Bug Type: </td>
  			<td><select name="bug">
    			<option value="none">-------Select--------</option>
   				<c:forEach items="${bugListObj}" var="bObj">
       			<option value="${bObj.bugtype_id}">${bObj.bug_type}</option>
           		</c:forEach>    
     		</select> 
    </td>
</tr>
<tr>
      <td> Severity : </td>
  <td><select name="severity">
    <option value="none">---------Select--------</option>
   <c:forEach items="${severityList}" var="sObj">
       <option value="${sObj.Severity_id}">${sObj.Severity_name}</option>
           </c:forEach>    
     </select> 
    </td>
</tr>
  <tr>
<td> Description: </td>
<td> <textarea cols="40" rows="10" name="description"></textarea></td>
</tr>
<tr>
       <td></td>
              <td>
                     <input type="submit" value="Report">
              </td>
       </tr>
</table>
</form>

</body>
</html>
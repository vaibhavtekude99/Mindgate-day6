<%@page import="com.mindgate.pojo.Employee"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

  <% Set<Employee> set=(Set<Employee>)session.getAttribute("set"); %>
  <table border="1">
  
      <tr>
        <td>EmployeeId</td>
        <td>Name</td>
        <td>salary</td>
      </tr>
  <%
  for(Employee employee:set)
  { %>
	  <tr>
	    <td><%=employee.getEmployeeId() %></td>
        <td><%=employee.getName() %></td>
        <td><%=employee.getSalary() %></td>
	  </tr>
 <% } %>
</table>
<a href="addemployee.html">Add New Employee</a>
</body>
</html>
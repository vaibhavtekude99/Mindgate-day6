<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>display</title>
</head>
<body>
<%
    String name=(String)session.getAttribute("username");
    String address=request.getParameter("location");
%>
<h3>    Hiii  <%=name %></h3>
<h3>    location  <%=address %></h3>
</body>
</html>
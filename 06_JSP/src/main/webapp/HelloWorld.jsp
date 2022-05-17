<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
<%!String message="Java is the best programming langauge :"; %>
<% double num1=100.55; %>
<% double num2=104.67; %>
<%  LocalDate localDate=LocalDate.now(); %>
   <% 
       for(int i=0;i<10;i++)
       {
   
   %>
    <h3>JSP is simple</h3>
    <% out.println(message); %>
    <%= (num1+num2) %>
    <% out.println(localDate); %>
    
    
    <%} %>
</body>
</html>
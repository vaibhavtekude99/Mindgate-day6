<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page2</title>
</head>
<body>
   <%
       String name=request.getParameter("txtname");
   session.setAttribute("username", name);
   
   
   %>
   
   <h3>Page two</h3>
   
   <form action="display.jsp">
        Address:<input type="text" name="location"><br>
        <input type="submit" value="ok">
   </form>
</body>
</html>
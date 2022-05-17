<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int num; %>

   <%
     num=Integer.parseInt(request.getParameter("num"));
   %>
   <h1>Multiplication table of <%=num %></h1><br>
   <table border="1"  style="background-color: cyan; border:5">
   
   <% for(int i=1;i<=10;i++)
	   
	   {%>
          <tr style="height:100px">
             <td style="width:10%"><h1><%out.print(num); %></h1></td>
             <td style="width:10%"><h1><%=i %></h1></td>
             <td style="width:10%"><h1><%=num*i%></h1></td>
             <%}; %>   
          </tr>
   
   
   
   </table>
   
   
   
   
   
   
</body>
</html>
package com.mindgate.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	
	
	private String userId="";
	private String password="";
    public LoginServlet() {
        super();
    }

	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		userId=request.getParameter("userId");
		password=request.getParameter("password");
		
		if(userId.equals(password))
		{
			
			
			request.getRequestDispatcher("success.jsp").forward(request, response);
		
			//response.sendRedirect("success.jsp");
		}
		else
			request.getRequestDispatcher("failure.jsp").forward(request, response);
	}

}

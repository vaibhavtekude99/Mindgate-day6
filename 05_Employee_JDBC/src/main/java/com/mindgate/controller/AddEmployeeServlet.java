package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindgate.dao.EmployeeDAO;
import com.mindgate.pojo.Employee;

@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
      private String name;
      private double salary;
      private PrintWriter printWriter;
      
      private EmployeeDAO dao=new EmployeeDAO();
      private boolean result;
    public AddEmployeeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
		
		printWriter=response.getWriter();
	 name=request.getParameter("name");
	 salary=Double.parseDouble(request.getParameter("salary"));
	
	
	Employee employee=new Employee(0, name, salary);
	   
	response.setContentType("text/html");
	result=dao.addEmployee(employee);
	if(result)
	{
		response.sendRedirect("GetAllEmployeeServlet");
	}
	
	else
	{
		//response.sendRedirect("addemployeefailed.jsp");
	
	}

	}

}

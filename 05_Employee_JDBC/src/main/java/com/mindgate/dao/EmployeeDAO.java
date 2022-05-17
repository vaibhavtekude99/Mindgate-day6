package com.mindgate.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class EmployeeDAO {
	private Set<Employee> employeeSet=new HashSet<Employee>();
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private String querry = "";
	private String user = "system";
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String password = "mindgate123";
	private int resultCount = 0;
	
	
	public Set<Employee> getAllEmployee()
	{
		try {
			Class.forName(driver);
			connection =DriverManager.getConnection(url, user, password);
			
			
			querry="select * from employee_details";
			preparedStatement=connection.prepareStatement(querry);
			
			resultSet=preparedStatement.executeQuery();
			
			
             while(resultSet.next())
             {
            	 int employeeId=resultSet.getInt("employee_id");
            	 String name=resultSet.getString("name");
            	 Double salary=resultSet.getDouble("salary");
            	 
            	 Employee employee=new Employee(employeeId, name, salary);
             
                    employeeSet.add(employee);
                    
                    
             
             }
             return employeeSet;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(connection!=null)
				{
				connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return null;
		
	}

	public boolean addEmployee(Employee employee) {
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			
			querry="insert into employee_details (name,salary) values (?,?)";
		preparedStatement=	connection.prepareStatement(querry);
		
		preparedStatement.setString(1, employee.getName());
		preparedStatement.setDouble(2, employee.getSalary());

		resultCount=preparedStatement.executeUpdate();
		if(resultCount>0)
			return true;
		else
			return false;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("Exception");
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return false;
	}

}

package com.learn.jdbc.placeholder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update_userinput {

	public static void main(String[] args) throws Exception 
	{
		//values for url,user name,password for establishing the connection
				String url="jdbc:mysql://localhost:3306/employee1"
						+ "";
				String username="root";
				String password="MOUNIKA@123";
				//Taking user input for id,name,salary to be updated in the table
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter the id");
				int id=scan.nextInt();
				System.out.println("Enter the salary");
				int salary=scan.nextInt();
				
				//creating the query to be executed for dynamic data
				String query="update employee set salary=? where id=?";//query with placeholders
				//establishing the connection
		       Connection con=DriverManager.getConnection(url,username,password);
		       System.out.println("connection is established ");
		       //preparing the statement
		       PreparedStatement pstmt=con.prepareStatement(query);
		       //completing the query to be executed 
		       pstmt.setInt(1, salary);//pstmt.setInt(placeholder index,name)
		       pstmt.setInt(2, id);//pstmt.setInt(placeholder index,name)
		       //executing the query
		       pstmt.executeUpdate();
		       System.out.println("Row is executed");
				


	}

}

package com.learn.jdbc.placeholder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.Statement;
import java.util.Scanner;

public class Insertion_userinput {

	public static void main(String[] args) throws Exception
	{
		//values for url,user name,password for establishing the connection
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String username="root";
		String password="MOUNIKA@123";
		//Taking user input for id,name,salary to be inserted in the table
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the id");
		int id=scan.nextInt();
		System.out.println("Enter the name");
		String name=scan.next();
		System.out.println("Enter the salary");
		int salary=scan.nextInt();
		
		//creating the query to be executed for dynamic data
		String query="insert into student values(?,?,?)";//query with placeholders
		//establishing the connection
       Connection con=DriverManager.getConnection(url,username,password);
       System.out.println("connection is established ");
       //preparing the statement
       PreparedStatement pstmt=con.prepareStatement(query);
       //completing the query to be executed 
       pstmt.setInt(1, id);//pstmt.setInt(placeholder index,name)
       pstmt.setString(2,name);//pstmt.setInt(placeholder index,name)
       pstmt.setInt(3, salary);//pstmt.setInt(placeholder index,name)
       //executing the query
       pstmt.executeUpdate();
       System.out.println("Row is executed");
		

	}

}

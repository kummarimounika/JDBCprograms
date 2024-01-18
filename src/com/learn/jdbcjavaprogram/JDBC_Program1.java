package com.learn.jdbcjavaprogram;


import java.sql.*;

public class JDBC_Program1 {

	public static void main(String[] args) {
		
		try
		{
			String url="jdbc:mysql://localhost:3306/jdbc_database";
			String username="root";
			String password="MOUNIKA@123";
   String query="CREATE TABLE STUDENT(ROLL INT,NAME VARCHAR(10))";
 
        Connection con=DriverManager.getConnection(url,username,password);
        System.out.println("connection is established at "+con);
        Statement stmt=con.createStatement();
        stmt.execute(query);
    
        System.out.println("query is executed");
		}
		catch(Exception e)
		{
			e.printStackTrace();

		}
	}

}

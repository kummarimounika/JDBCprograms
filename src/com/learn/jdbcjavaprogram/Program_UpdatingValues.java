package com.learn.jdbcjavaprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Program_UpdatingValues {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub

			String url="jdbc:mysql://localhost:3306/jdbc_database";
			String username="root";
			String password="MOUNIKA@123";
			String query="Update Student set name='Ankit' where name='haneesha'";
        Connection con=DriverManager.getConnection(url,username,password);
        System.out.println("connection is established at "+con);
        Statement stmt=con.createStatement();
        stmt.executeUpdate(query);
    
        System.out.println("query is executed");
		}
		
}

package com.learn.jdbcjavaprogram;
		import java.sql.*;

		public class Program_InsertingValues {

			public static void main(String[] args) {
				
				try
				{
					String url="jdbc:mysql://localhost:3306/jdbc_database";
					String username="root";
					String password="MOUNIKA@123";
					String query="insert into student values(1,'MOUNIKA'),(2,'DEEKSHI'),(3,'HANEESHA')";
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



package com.learn.jdbcjavaprogram;
import java.sql.*;
public class Program_DeletingRow {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
       String url="jdbc:mysql://localhost:3306/jdbc_database";
       String username="root";
       String password="MOUNIKA@123";
       String query="DELETE FROM STUDENT WHERE ROLL=3";
       Connection con=DriverManager.getConnection(url,username,password);
       System.out.println("Connection is established");
       Statement stmt=con.createStatement();
       stmt.executeUpdate(query);
       System.out.println("query is executed");
	}

}

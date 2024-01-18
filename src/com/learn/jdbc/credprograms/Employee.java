package com.learn.jdbc.credprograms;

import java.sql.*;
import java.util.Scanner;

public class Employee {
		
		
		public static void insert(Statement stat) throws Exception
		{
			
			String query="INSERT INTO EMPLOYEE VALUES(1,'AJAY',35000),(2,'ANKIT',45000),(3,'AMIT',55000)";
			stat.executeUpdate(query);
			System.out.println("Data is inserted");
		}
		public static void update(Statement stat) throws Exception
		{
			String query="UPDATE EMPLOYEE SET  SALARY=65000 WHERE ID=3";
			stat.executeUpdate(query);
			System.out.println("Data is updated");
		}
		public static void delete(Statement stat) throws Exception
		{
			String query="DELETE FROM EMPLOYEE WHERE NAME='AJAY'";
			stat.executeUpdate(query);
			System.out.println("Data is deleted");
		}
		public static void select(Statement stat) throws Exception
		{
			String query="SELECT * FROM EMPLOYEE";
			
			ResultSet rs=stat.executeQuery(query);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
				
			}
	}
		public static void main(String[] args) throws Exception
		{
			String url="jdbc:mysql://localhost:3306/employee";
			String username="root";
			String password="MOUNIKA@123";
			Connection conn=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established "+conn);
			Statement stat=conn.createStatement();
			Scanner scan=new Scanner(System.in);
			while(true)
			{
				System.out.println("enter 1 for insertion,2 to update,3 to delete,4 to select and any other number to terminate");
				int choice=scan.nextInt();
				if(choice==1)
				{
					insert(stat);
				}
				else if(choice==2)
				{
					update(stat);
				}
				else if(choice==3)
				{
					delete(stat);
				}
				else if(choice==4)
				{
					select(stat);
				}
				else
				{
					System.out.println("Incorrect data");
					System.exit(0);
				}
			}
			
			
			
			
			
			
		
		
	
		

	}

}

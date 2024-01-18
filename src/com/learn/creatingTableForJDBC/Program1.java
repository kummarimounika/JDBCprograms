package com.learn.creatingTableForJDBC;

import java.sql.*;
import java.util.Scanner;

public class Program1 {
public static void CreatTable(Connection con) {
	try {
		showTable(con);
	System.out.println("this table is creattable");
	Scanner scan=new Scanner(System.in);
	String tableName=scan.next();
	String query="create table "+tableName+"(id int,name varchar(10))";
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery(query);
	while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
	}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
public static void showTable(Connection con) {
	try {
	String query="show tables";
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery(query);
	while(rs.next()) {
		System.out.println(rs.getString(1));
	}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
public static void read(Connection con) {
	showTable(con);
	try {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the table name");
	String tableName=scan.next();
	String query="select * from "+tableName;
  Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery(query);
	while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
	}
	}
	catch(Exception e) {
		e.printStackTrace();
	}

}
public static void insert(Connection con) {
	showTable(con);
	try {
		System.out.println("this table is inserting");
		Scanner scan=new Scanner(System.in);
		String tableName=scan.next();
		String query="insert into "+tableName+"values(1,'mouni'),(2,'shivayya'),(3,'asi')";
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
public static void update(Connection con) 
{
	showTable(con);
	try {
		System.out.println("this table is updating");
		Scanner scan=new Scanner(System.in);
		String tableName=scan.next();
		String query="update "+tableName+" set name='balayya' where id=2 ";
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getInt(2));
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
public static void dalete(Connection con) 
{
	showTable(con);
	try {
		System.out.println("this table is deleting");
		Scanner scan=new Scanner(System.in);
		String tableName=scan.next();
		String query="dalete from"+tableName+" where id=3 ";
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getInt(2));
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}

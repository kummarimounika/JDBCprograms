package com.learn.creatingTableForJDBC;
import java.sql.*;
import java.util.Scanner;
public class ProgramApp {
	public static void main(String[] args) throws Exception {
String url="jdbc:mysql://localhost:3306/jdbc_database";		
String username="root";
String password="MOUNIKA@123";
Connection con=null;
try {
con=DriverManager.getConnection(url,username,password);
System.out.println("connection is established");
Scanner scan=new Scanner(System.in);
System.out.println("enter 1 show table, 2 for creat,3 for read,4 for insert,5 for update,6 for dalete");
int choice=scan.nextInt();
switch(choice) {
case 1:Program1.showTable(con);
break;
case 2:Program1.CreatTable(con);
break;
case 3:Program1.read(con);
break;
case 4:Program1.insert(con);
break;
case 5:Program1.update(con);
break;
case 6:Program1.dalete(con);
break;
default:System.out.println("incorrect values");

}
  }
catch(Exception e) {
	e.printStackTrace();
}
}
}
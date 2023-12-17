package com.Callable;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	static Connection conn=null;
	
	public static Connection getconnect()
	{
		try
		{
		   Class.forName("com.mysql.cj.jdbc.Driver");//load driver
		   System.out.println("Driver loaded...");
		   conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/companydb2", "root", "1surajMali@123");//Getting Connection
		   System.out.println("Connection Done...");
		}
		catch( Exception e)
		{
			System.out.println(e);
		}
		return conn;
	}
	public static void main(String[] args) {
		getconnect();
		
	}

}
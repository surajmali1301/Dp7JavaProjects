package com.Callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import com.JDBC.DBconnection;

public class FunctionCall {

	ResultSet rs;
	Statement st;
	CallableStatement cst;
	public Connection conn = null;
	static Scanner sc = new Scanner(System.in);

	public FunctionCall() {
		conn = DBconnection.getconnect();
		try {

			st = conn.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void calTotalSalaryDeptWise() {
		System.out.println("Enter the Department Id: ");
		int id = sc.nextInt();
		
		try {
			cst = conn.prepareCall("{?= call totalSalaryDept(?)}");
			cst.registerOutParameter(1, Types.INTEGER);
			cst.setInt(2, id);
			
			boolean status = cst.execute();
			if(!status) {
				System.out.println("Total Salary of department "+id+" is: "+cst.getInt(1));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void getEmployeeDetails() {
		try {
			cst = conn.prepareCall("{call empDetails(?)}");
			
			boolean status = cst.execute();
			
			if(status) {
				rs=cst.getResultSet();
				while (rs.next()) {
					System.out.println(rs.getString(1)+" "+rs.getString(2));
					
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionCall fc  = new FunctionCall();
		fc.calTotalSalaryDeptWise();
//		fc.getEmployeeDetails();

	}

}

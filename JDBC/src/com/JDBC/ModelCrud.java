package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ModelCrud {

	static Connection conn = null;
	PreparedStatement pst;// get Statement
	ResultSet rs;
	Statement st;
	static Scanner sc = new Scanner(System.in);


	public ModelCrud() {
		conn = DBconnection.getconnect();
		try {
			st = conn.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public void fetchModelDetails() {
		try {
			rs = st.executeQuery("select * from model");

			System.out.println("-----------Model-----------");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void insertModel() {
		System.out.println("Enter Model id: ");
		int mId = sc.nextInt();

		System.out.println("Enter Model Name: ");
		String mName = sc.next();

		System.out.println("Enter Model Cost: ");
		int cost = sc.nextInt();

		try {
			pst = conn.prepareStatement("insert into model values(?,?,?)");
			pst.setInt(1, mId);
			pst.setString(2, mName);
			pst.setInt(3, cost);

			int noOfRowsInserted = pst.executeUpdate();
			if (noOfRowsInserted > 0) {
				System.out.println("New Bike Model Added");
			} else {
				System.out.println("Error While Inserting.....");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public boolean searchById(int id) {

		boolean isFound = false;

		try {
			pst = conn.prepareStatement("select * from model where modelId=?");
			pst.setInt(1, id);

			rs = pst.executeQuery();

			while (rs.next()) {
				isFound = true;
				System.out.println("Model id :" + rs.getInt(1));
				System.out.println("Model name:" + rs.getString(2));
				System.out.println("Model Cost: " + rs.getInt(3));
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return isFound;

	}

	public void updateModelCost() {
		System.out.println("Enter model Id to update Cost: ");
		int mId = sc.nextInt();
		
		if(searchById(mId)) {
			System.out.println("Enter New Prize: ");
			int cost = sc.nextInt();
			
			try {
				pst = conn.prepareStatement("update model where modelId=? set cost=?");
				pst.setInt(1, mId);
				pst.setInt(3, cost);
				
				 int noOfRowsUpdated= pst.executeUpdate();
				   if(noOfRowsUpdated>0)
				   {
					   System.out.println("Model Updated .....");
					   searchById(mId);
				   }
				   else
				   {
					   System.out.println("Error in updating Model Prize....");
				   }
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public void deleteModelByName()
	{
		System.out.println("Enter the Model name to be deleted:");
		String mname=sc.next();
		
		try
		{					
			int noOfRowsDeleted= st.executeUpdate("delete from model where modelName='"+mname+"';");
			
			if(noOfRowsDeleted>0)
			{
				System.out.println("Course "+mname+ " is deleted");
				fetchModelDetails();
			}
			else
			{
				System.out.println("Error in deleting course...");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ModelCrud m = new ModelCrud();
		int ch;
		char choice;

		do {
			System.out.println("1. Add Model");
			System.out.println("2. Update Model Cost");
			System.out.println("3. View Model Details");
			System.out.println("4. Delete Model by Name");
			System.out.println("5. Exit");

			System.out.println("Enter Your Choice: ");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				m.insertModel();
				break;
			case 2:
				m.updateModelCost();
				break;
			case 3:
				m.fetchModelDetails();
				break;
			case 4:
				m.deleteModelByName();
				break;

			default:
				break;
			}
			System.out.println("Do You Want to Perform more Operation?(Y-yes/N-No");
			choice = sc.next().charAt(0);

		} while (choice == 'Y' || choice == 'y');

	}

}

package com.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CourseCrud {

	static Connection conn = null;
	PreparedStatement pst;
	ResultSet rs;
	Statement st;
	static Scanner sc = new Scanner(System.in);

	public CourseCrud() {
		conn = DBconnection.getconnect();
//		System.out.println("Connection done.....");
		try {
			st = conn.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public void fetchCourseDetails() {
		try {
			rs = st.executeQuery("select * from coursecopy");

			System.out.println("--------------Courses---------------------");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "    " + rs.getInt(4)
						+ "  " + rs.getInt(5));
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void insertCourse() {
		System.out.println("Enter Id: ");
		int id = sc.nextInt();

		System.out.println("Enter Course Name: ");
		String cName = sc.next();

		System.out.println("Enter Course Duration: ");
		String duration = sc.next();
	

		System.out.println("Enter Course Fees: ");
		int cost = sc.nextInt();
		try {

			pst = conn.prepareStatement("insert into coursecopy values(?,?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, cName);
			pst.setString(3, duration);
			pst.setInt(4, 0);
			pst.setInt(5, cost);

			int noOfRowsInserted = pst.executeUpdate();

			if (noOfRowsInserted > 0) {
				System.out.println("Course Added");
			} else {
				System.out.println("Error in Course");
			}
		} catch (Exception e) {
			System.out.println(e);

		}
	}
	public void deleteCourseByName()
	{
		System.out.println("Enter the course name to be deleted:");
		String cname=sc.next();
		
		try
		{					
			int noOfRowsDeleted= st.executeUpdate("delete from course where cname='"+cname+"';");
			
			if(noOfRowsDeleted>0)
			{
				System.out.println("Course "+cname+ " is deleted");
				fetchCourseDetails();
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
	
	public boolean searchCourseById(int id)
	{
		boolean isFound=false;
		try
		{
		   pst= conn.prepareStatement("select * from course where cid=?");
		   pst.setInt(1, id);
		   
		   rs= pst.executeQuery();
		   
		   while(rs.next())
		   {
			   isFound=true;
			  System.out.println("Course id :"+rs.getInt(1));
			  System.out.println("Course name:"+rs.getString(2));
			  System.out.println("Duration:"+rs.getInt(3));
			  System.out.println("Fees:"+rs.getInt(4));
			  System.out.println("Number of students:"+rs.getInt(5));
		   }
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return isFound;
	   
	}
	public void updateCourseFees()
	{
		System.out.println("Enter course id whose fees is to updated:");
		int id= sc.nextInt();
		
		if(searchCourseById(id))
		{
			System.out.println("Ente the new fees:");
			int cost= sc.nextInt();
			
			try
			{
			   pst= conn.prepareStatement("update course set fees=? where modelid=?");
			   pst.setInt(1, id);
			   pst.setInt(3, cost);
			   
			   int noOfRowsUpdated= pst.executeUpdate();
			   if(noOfRowsUpdated>0)
			   {
				   System.out.println("Course updated .....");
				   searchCourseById(id);
			   }
			   else
			   {
				   System.out.println("Error in while updating...");
			   }
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			
		}
		else
		{
			System.out.println("Course "+id+" not found..");
		}
		
		
	}

	public static void main(String[] args) {
		CourseCrud f = new CourseCrud();
		
		
		int ch;
		char choice;
		
		
		do {
			System.out.println("=============================================");
			System.out.println("1. Add New Course");
			System.out.println("2. Delete Course");
			System.out.println("3. Update Course Fees");
			System.out.println("4. View All Courses");
			System.out.println("5. View Course by id");
			System.out.println("6. Exit");
			
			System.out.println("Enter Your Choice: ");
			System.out.println("-----------------------------------------------");
			ch = sc.nextInt();
			
			switch (ch) {
			case 1:f.insertCourse();
				break;
			case 2:f.deleteCourseByName();
				break;
			case 3:f.updateCourseFees();
				break;
			case 4:f.fetchCourseDetails();
				break;
			case 5:
				System.out.println("Enter the course id to be searched: ");
				int id = sc.nextInt();
				break;
			case 6:
				System.out.println("--------Closing the Course Application------------");
				System.exit(0);
				break;
			
				default:System.out.println("Wrong Input");
				break;
			}
			
			System.out.println("Do You Want to Perform more Operation?(Y-yes/N-No");
			choice=sc.next().charAt(0);
			
		} while (choice=='Y' || choice=='y');
	}

}

package com.ResultSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.JDBC.DBconnection;

public class ResultSetDemo {
	static Scanner sc= new Scanner(System.in);
	Statement st;
	ResultSet rs;
	Connection con=null;
	
	ResultSetDemo()
	{
		con= DBconnection.getconnect();
		try {
			
			st= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs= st.executeQuery("select * from coursecopy");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

	public void fetchCourseDetails() {
		try {
//			rs = st.executeQuery("select * from course");
			rs.beforeFirst();
			System.out.println("--------------Courses---------------------");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "    "
						+ rs.getInt(4) + "  " + rs.getInt(5));
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void fetchCourseDetailsReverse() {
		try {
			rs.afterLast();
			System.out.println("--------------Courses---------------------");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "    "
						+ rs.getInt(4) + "  " + rs.getInt(5));
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	
public void insertCourse() {
		
		try {
			rs.moveToInsertRow();
			
			System.out.println("Enter Course Id:");
			int id = sc.nextInt();

			System.out.println("Enter Course Name:");
			String name = sc.next();

			System.out.println("Enter Duration:");
			String dur = sc.next();

			System.out.println("Enter Fees:");
			int fees = sc.nextInt();

			System.out.println("Enter Count:");
			int count = sc.nextInt();
			
			rs.updateInt(1, id);
			rs.updateString(2, name);
			rs.updateString(3, dur);
			rs.updateInt(4, fees);
//			rs.updateInt(5, count);
			rs.insertRow();
			System.out.println("New Course Added");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateCourseFees() {
		System.out.println("Enter the Course name to be updated: ");
		String cName = sc.next();

		try {
			rs.beforeFirst();
			while (rs.next()) {
				if (rs.getString(2).equals(cName)) {
					System.out.println("Old Fees " + rs.getInt(4));
					System.out.println("Enter new Fees: ");
					int fees = sc.nextInt();

					rs.updateInt(4, fees);
					rs.updateRow();
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void deleteCourse() {
		System.out.println("Enter the Course id");
		int id = sc.nextInt();

		try {
			rs.beforeFirst();
			while (rs.next()) {
				if (rs.getInt(1) == id) {
					rs.deleteRow();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ResultSetDemo d = new ResultSetDemo();

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
			case 1:d.insertCourse();
				break;
			case 2:
				d.deleteCourse();
				break;
			case 3:
				d.updateCourseFees();
				break;
			case 4:
				d.fetchCourseDetails();
				break;
			case 5:
				System.out.println("Enter the course id to be searched: ");
				int id = sc.nextInt();
				break;
			case 6:
				System.out.println("--------Closing the Course Application------------");
				System.exit(0);
				break;

			default:
				System.out.println("Wrong Input");
				break;
			}

			System.out.println("Do You Want to Perform more Operation?(Y-yes/N-No");
			choice = sc.next().charAt(0);

		} while (choice == 'Y' || choice == 'y');

	}

}

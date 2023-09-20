package com.LabSession_This_Contructor;
import java.util.*;
class Student{
	private int sid;
	private String sName;
	private String sAddress;
	private String sColleage;
	
	Student(int sid,String sName,String sAddress){
		this.sid=sid;
		this.sName=sName;
		this.sAddress=sAddress;
		this.sColleage="TQ";
	}
	Student(int sid,String sName,String sAddress,String sColleage){
		this.sid=sid;
		this.sName=sName;
		this.sAddress=sAddress;
		this.sColleage=sColleage;
	}
	public int getId() {
		return sid;
	}
	public String getSname() {
		return sName;
	}
	public String getSaddress() {
		return sAddress;
	}
	public String getScolleage() {
		return sColleage;
	}
}
public class StudentMain {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input");
		int ch = sc.nextInt();
		
		Student student;
		if(ch==1) {

			System.out.println("Enter Your Id: ");
			int id = sc.nextInt();
			System.out.println("Enter Student name: ");
			String sName = sc.next();
			System.out.println("Enter Your Address: ");
			String address = sc.next();
			  student = new Student(id,sName,address);
		}
		else if(ch==0) {
			System.out.println("Enter Your Id: ");
			int id = sc.nextInt();
			System.out.println("Enter Student name: ");
			String sName = sc.next();
			System.out.println("Enter Your Address: ");
			String address = sc.next();
			System.out.println("Enter Colleage name");
			String sColleage = sc.next();
			  student = new Student(id,sName,address,sColleage);
		}
		else {
			System.out.println("Enter correct Input...");
			return;
		}
		System.out.println("Student Id: "+student.getId());
		System.out.println("Student Name: "+student.getSname());
		System.out.println("Student Colleage: "+student.getScolleage());
		System.out.println("Student Addrress: "+student.getSaddress());

	}

}

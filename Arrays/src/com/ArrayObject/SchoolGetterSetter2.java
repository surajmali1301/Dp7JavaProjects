package com.ArrayObject;
import java.util.Scanner;
public class SchoolGetterSetter2{
	static Scanner sc = new Scanner(System.in);

	static void display(StudentInfo s) {
		System.out.println("Enter Student id :");
		s.setId(sc.nextInt());

		System.out.println("Enter student name :");
		s.setName(sc.next());

		System.out.println("Enter student marks :");
		s.setMarks(sc.nextFloat());
	}

	
	static void topper(StudentInfo stud[]) 
	{
		float maxMarks = Float.MIN_VALUE;
		StudentInfo st = new StudentInfo();
		
		for (StudentInfo s : stud) {
			if(st.getMarks()>maxMarks) {
				maxMarks = st.getMarks();
				st=s;
			}
			System.out.println(st);
		}
	}
	static void printdetails(StudentInfo str[]) {
		System.out.println("_____________________________");
		for (StudentInfo s : str) {
			System.out.println(s);
		}
	}

	
	static void sortMarks(StudentInfo s[]) {
		
		StudentInfo st = new StudentInfo();
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if(s[i].getMarks()<s[j].getMarks()) {
					st=s[i];
					s[i]=s[j];
					s[j]=st;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		StudentInfo st[]=new StudentInfo[5];//Array is created of size 5
		
		for(StudentInfo s:st)
		{
			System.out.println(s);
		}

		System.out.println("_______________________________________");
		System.out.println("Topper in class");
		topper(st);
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}
		
		System.out.println("_______________________________________");
		System.out.println("Sorting marks");
         sortMarks(st);
         for(int i=0;i<st.length;i++)
			{
				System.out.println(st[i]);
			}
		
		

	}

}



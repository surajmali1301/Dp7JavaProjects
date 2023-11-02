package com.ArrayListAssignment;

import java.util.ArrayList;
import java.util.*;
public class CheckString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String>aList=new ArrayList<>();
		
		aList.add("Suraj");
		aList.add("Vishal");
		aList.add("Kailas");
		aList.add("Anuj");
		aList.add("Hrishikesh");
		aList.add("Shivam");
		
		System.out.println("Enter Name to Check: ");
		String check = sc.next();
		int getIndex=aList.indexOf(check);
		for (int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(getIndex)+" is present at index "+getIndex);
			break;
		}
	}

}

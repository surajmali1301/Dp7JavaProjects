package com.LinkedList;

import java.util.*;

public class ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> emp = new LinkedList<String>();
		
		emp.add("Suraj");
		emp.add("Aniket");
		emp.add("Vishal");
		emp.add("Hrishikesh");
		emp.add("Kailas");
		
		System.out.println(emp);
		
		for (int i = 0; i < emp.size(); i++) {
			
			System.out.println(emp.get(i));
		}
		
		for (String str : emp) {
			System.out.println(str);
		}
		
		Iterator<String> itr=emp.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		Iterator<String> itr2 = emp.descendingIterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
//		ListIterator<String> list1 = emp.listIterator();
		
	}

}

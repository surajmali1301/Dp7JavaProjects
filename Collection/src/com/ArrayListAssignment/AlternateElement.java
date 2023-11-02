package com.ArrayListAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class AlternateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>aList=new ArrayList<>();//No elements after creating list
		
		for (int i = 1; i <= 10; i++) {//Adding Elements 1 to 50 
			aList.add(i);
		}
		
		for (int i = 1; i < aList.size(); i+=2) {//print alternate elements
			System.out.println(aList.get(i));
		}
		
		System.out.println("------------------------");
		Iterator<Integer> a = aList.iterator();
		
		while(a.hasNext()) {
			
			int num = a.next();
			System.out.println(num);
			if(a.hasNext()) {
				a.next();
			}
		}
	}

}

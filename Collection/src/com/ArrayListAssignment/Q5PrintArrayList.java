package com.ArrayListAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Q5PrintArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
	
	Iterator<Integer> al2 = al.iterator();
	
	while (al2.hasNext()) {
		System.out.println(al2.next());
	}
	}

}

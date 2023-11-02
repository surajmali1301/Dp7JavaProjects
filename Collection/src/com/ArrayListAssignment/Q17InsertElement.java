package com.ArrayListAssignment;

import java.util.ArrayList;

public class Q17InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>aList=new ArrayList<>();//No elements after creating list
		
		for (int i = 1; i <= 10; i++) {//Adding Elements 1 to 50 
			aList.add(i);
		}
			
		aList.set(0, 20);
		System.out.println(aList.get(0));
	}

}

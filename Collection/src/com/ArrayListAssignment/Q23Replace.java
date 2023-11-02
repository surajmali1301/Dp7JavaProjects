package com.ArrayListAssignment;

import java.util.ArrayList;

//23. WAP to replace the second element of an ArrayList with the specified element
public class Q23Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> aList = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			aList.add(i);
		}

		aList.set(2, 20);
		System.out.println(aList);
	}

}

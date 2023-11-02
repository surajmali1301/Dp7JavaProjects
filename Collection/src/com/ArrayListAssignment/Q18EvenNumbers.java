package com.ArrayListAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Q18EvenNumbers {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();

		for (int i = 1; i <= 50; i++) {
			a.add(i);
		}

		
		System.out.println(a);
		Iterator<Integer> itr =  a.iterator();

		while (itr.hasNext()) {//tells that is there is next element or not
		//Going 1st element to another element
			System.out.println();
			int even=itr.next();
			if ((even % 2 == 0)) {
				System.out.println(even);
			}
		}
	}

}

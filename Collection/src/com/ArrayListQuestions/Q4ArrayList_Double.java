package com.ArrayListQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q4ArrayList_Double {

	public static void main(String[] args) {

		ArrayList<Double> a = new ArrayList<>();// capacity 10
		a.add(2.0);
		a.add(3.14);
		a.add(20.0);
		a.add(23.0);
		a.add(21.0);
		
		System.out.println(a);

		//2 We can give Our own initial Capacity
		ArrayList<Double> list = new ArrayList<>(2);
		
		list.add(113.0);
		list.add(23.5);
		list.add(33.);
		System.out.println(list.size());
		System.out.println(list);
		
		
		
		//3

		List<Double> originalList = Arrays.asList(13.3,3.14,10.);

		// Create an ArrayList using the collection constructor
		ArrayList<Double> arrayList = new ArrayList<>(originalList);

		// Print the ArrayList
		System.out.println(arrayList);
	}
}

package com.ArrayListQuestions;

import java.util.ArrayList;

public class Q3ArrayList_Integer {

	public static void main(String[] args) {


		ArrayList<Integer> a = new ArrayList<>();
		
		//Add Method
		a.add(11);
		a.add(12);
		a.add(13);
		a.add(14);
		a.add(15);
		
		//get Element in array Using index
		System.out.println("get(): "+a.get(0));
		
		
		//Set element Using index where want set new element replace with old element
		System.out.println(a);
		a.set(3, 16);
		System.out.println("set(): "+a);
		
		//RetainAll
		ArrayList<Integer> a2 = new ArrayList<>();
		a2.add(10);
		a2.add(21);
		a2.add(13);
		a2.add(11);
		a2.add(10);
		
		a2.retainAll(a);
		System.out.println("retainAll(): "+a2);
		
		//removeAll
		System.out.println(a2.removeAll(a));
		System.out.println(a2);
	}

}

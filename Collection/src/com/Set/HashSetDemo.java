package com.Set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<>();
		hs.add("Java");
		hs.add("Ruby");
//		System.out.println(hs.add("Go"));
		hs.add("Angular");
		hs.add("C#");
//		System.out.println(hs.add("Go"));
		hs.add(null);
		System.out.println(hs);
		System.out.println("---------------");
		
		HashSet<String> hs2 = new HashSet<>();
		hs2.add("Java");
		hs2.add("Ruby");
		hs2.add("Go");
		hs2.add("c++");
		hs2.add(".net");
		hs2.add(null);
		System.out.println(hs2);
		
		//Mathematical Order
		
		//Union
		
//		hs.addAll(hs2);
//		System.out.println(hs);
		
		
		//Difference
		
//		hs.removeAll(hs2);
//		System.out.println(hs);
		
		//InterSection
		hs.retainAll(hs2);//gives Common Elements present both Sets
		System.out.println(hs);
	}

}

package com.ArrayList;

import java.util.ArrayList;

public class MethodArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<>();
		
		System.out.println(al.isEmpty());
		
		al.add("Java");
		al.add("Python");
		al.add("Angular");
		al.add("Spring");
		al.add("Java");
		al.add(null);
		al.add(null);
		
		System.out.println(al.isEmpty());
		System.out.println(al);
		
		al.set(2,"Html");
		System.out.println(al);
		
		al.set(5, "DevOps");
		System.out.println(al);
		
		ArrayList<String> al2 = new ArrayList<>(5);
		
		al2.add(".net");
		al2.add("SQL");
		al2.add("Java");
		
		al.add("React");
		
		al.addAll(2, al2);
		

		ArrayList<String> al3 = new ArrayList<>(5);
		
		al3.add(".net");
		al3.add("SQL");
		al3.add("Java");
		
		al.add("React");
		System.out.println(al);
		
		System.out.println(al.contains("Java"));
		System.out.println(al.containsAll(al3));//All elements of al3 must be present in al
		
		System.out.println(al.size());
		
		System.out.println(al.remove(4));
		
//		System.out.println(al.remove("Html")); return boolean
		
//		al.removeAll(al3); removes all elements which matches al3
//		System.out.println(al);
		
		al.retainAll(al3);//keeps only those elements which matches al3 and removes rest
		System.out.println(al);
		
	}

}

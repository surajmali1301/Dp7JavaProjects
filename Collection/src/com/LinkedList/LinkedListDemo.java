package com.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> itcomp = new LinkedList<>();
		
//		System.out.println(itcomp.getFirst()); NoSuchElementException
		System.out.println(itcomp.peek());//null
		
		itcomp.add("HCL");
		itcomp.add("TCS");
		itcomp.add(null);
		itcomp.add("TCS");
		
		System.out.println(itcomp);
		
		itcomp.addFirst("Infosys");;
		
		System.out.println(itcomp);
		
		itcomp.add(1,"Dell");
		System.out.println(itcomp);
		
		//retrieve
		
		System.out.println("--------------------");
		
		System.out.println("Element: "+itcomp.element());
		System.out.println("Element: "+itcomp.getFirst());
		System.out.println("Element: "+itcomp.peek());
		System.out.println("Element: "+itcomp.peekFirst());
		
		System.out.println(itcomp.get(2));
		
		System.out.println("From Last: "+itcomp.getLast());
	}

}

package com.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque<Float> adq = new ArrayDeque<>();
		
//		adq.addLast(null);; not allows null elements
		adq.add(3.14f);
		adq.offerLast(96.3f); 
		adq.addFirst(33.2f);
		
		//Duplcate method
//		insertion order
		
		System.out.println(adq);
		
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		
		System.out.println(adq.pollLast());
		System.out.println(adq.removeLast());
		
		adq.push(73.3f);
		
		System.out.println(adq);
		
		adq.push(3.14f);
		System.out.println(adq);
		
		
	}

}

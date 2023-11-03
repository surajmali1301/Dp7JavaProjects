package com.Stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {


		Stack<String> names = new Stack<String>();
		names.push("Anuj");
		names.push("Suraj");
		System.out.println(names.push("Pralay"));
		
		names.push("Shivam");
		names.push("Vishal");
		
		System.out.println(names);
		
		System.out.println(names.pop());
		System.out.println(names);
		
	}

}

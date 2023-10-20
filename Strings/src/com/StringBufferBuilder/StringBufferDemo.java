package com.StringBufferBuilder;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb3 = new StringBuffer();
		System.out.println(sb3.capacity());

		StringBuffer sb1 = new StringBuffer(10);
		System.out.println(sb1.capacity());

		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println(sb2.capacity());
		
	}

}

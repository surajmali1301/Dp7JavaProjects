package com.ExceptionDemo2;

public class CheckPropagation4 {
//we can declare multiple Exception using Throws
	void m1() throws Exception {
// throw is keyword It is used raise an exception, We can only raise one exception at time,we raise exception using new keyword like creating object
		throw new ClassNotFoundException("Class Error");

	}

	void m2() throws Exception {
		m1();
		throw new ClassNotFoundException();
	}

	void m3() throws Exception {
//		m2();
	}

	public static void main(String[] args) throws Exception {

		CheckPropagation4 cp = new CheckPropagation4();
		cp.m3();
	}
}

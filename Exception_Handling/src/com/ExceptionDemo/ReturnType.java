package com.ExceptionDemo;

public class ReturnType {

	static int method1(int data) {

		try {
			return 30 / data;
		} catch (Exception e) {

			System.out.println(e);
		}
		return 0;
	}

	static int method2(int data) {

		try {
			return 30 / data;
		} catch (Exception e) {

			System.out.println(e);
			return 0;
		}
	}

	@SuppressWarnings("Finally")
	static int method3(int data) {

		try {
			return 30 / data;
		} catch (Exception e) {

			System.out.println(e);
		} finally {
			System.out.println("Finally");
			return 0;
		}
	}

	public static void main(String[] args) {

		System.out.println(method1(0));
		System.out.println(method2(2));
		System.out.println(method3(1));
	}

}

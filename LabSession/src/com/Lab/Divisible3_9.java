package com.Lab;

public class Divisible3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=100;i++)
		{
			if(i%9==0) {
				System.out.println("Hello");
			}
			else if(i%3==0) {
				System.out.println("Hi");
			}
			else {
				System.out.println(i);
			}
		}
	}

}

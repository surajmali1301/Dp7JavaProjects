package com.Lab_Session;

public class SumOfOdd {

	public static void main(String[] args) {


     int sum =0;
     int count = 0;
     
     for (int i = 552; i >=444; i--) {
		if (i%2!=0) {
			sum=sum+i;
			count++;
		}
	}
     System.out.println(count);
     System.out.println(sum);

	}

}

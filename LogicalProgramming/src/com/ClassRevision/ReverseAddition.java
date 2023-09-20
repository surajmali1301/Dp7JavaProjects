package com.ClassRevision;

public class ReverseAddition {

	public static void main(String[] args) {
		
		int last3Sum=0;
		int first3Sum=0;
		int n=32105;
			
		for(int i=0;i<3;i++){
		  last3Sum=last3Sum+(n%10);
		  n/=10;
		  }
		int rev=0;
		int temp=n;
		while(temp>0) {
		rev=rev*10+n%10;
		temp/=10;
		}
		for(int i=0;i<3;i++){
			  first3Sum=first3Sum+(rev%10);
			  n/=10;
			  }
		System.out.println("Sum of 1st 3 digits: "+first3Sum);
		System.out.println("Sum of last 3 digits: "+last3Sum);
	}
}

package com.Basics;

import java.util.Arrays;

public class Duplicate {
	
	static void duplicate(char a[]) {
		
		int count;

		for(int i=0;i<a.length;i++) 
		{
			if(a[i]=='0') 
				continue;
			count=1;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]='0';
				}
			}
			if(count>=2) {
			System.out.println(a[i]+" Duplicate");
			}
		}
	}
	
static void unique(char a[]) {
		
		int count;

		for(int i=0;i<a.length;i++) 
		{
			if(a[i]=='\0') 
				continue;
			count=1;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]='\0';
				}
			}
			if(count==1) {
			System.out.println(a[i]+" Unique");
			}
		}
	}

	public static void main(String[] args) {


		char arr[]= {'a','b','c','a','e','f','g','h'};

		duplicate(arr);
		System.out.println("-----------");
	 unique(arr);
	}

}

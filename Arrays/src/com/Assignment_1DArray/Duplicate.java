package com.Assignment_1DArray;

import java.util.Arrays;

public class Duplicate {
	
	static void duplicate(int a[]) {
		
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
	


	public static void main(String[] args) {


		int arr[]= {3, 10, 90, 78, 56, 10, 78, 34, 61};

		duplicate(arr);
	
	}

}

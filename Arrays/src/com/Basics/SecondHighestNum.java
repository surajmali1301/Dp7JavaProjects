package com.Basics;

import java.util.Arrays;

public class SecondHighestNum {

static void find2ndHigh(int a[],int max) {
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length-2; j++) 
			{
				
				if(a[i]>max) {
					max=a[i];
				}
			}
		}
		System.out.println("Second Highest Number: "+max);
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,9,3,7,5};
		int max=0;
		find2ndHigh(arr,max);
	}

}

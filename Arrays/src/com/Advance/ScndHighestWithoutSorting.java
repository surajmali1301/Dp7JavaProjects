package com.Advance;

public class ScndHighestWithoutSorting {

	static void scndHigh(int arr[]) {
		
		int highest=Integer.MIN_VALUE;
		int sHighest=Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>highest) 
			{
				sHighest=highest;
				highest=arr[i];
			}
			else if(arr[i]>sHighest)
			{
				sHighest=arr[i];
			}
			
		}
		System.out.println("Second Highest: "+sHighest);
	}
	public static void main(String[] args) {


		int arr[]= {7,6,10,3,1,2,9};
		
		scndHigh(arr);

	}

}

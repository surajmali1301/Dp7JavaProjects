package com.Basics;

public class CountFrequency {
	
	static void count(int a[]) {
		
		int count;
		
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]=='\0') 
				continue;
			count=1;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					a[j]='\0';
					count++;
				}
			}
			System.out.println(a[i]+"--->"+count);
		}
	}

	public static void main(String[] args) {


		int arr[]= {1,2,2,3,3,3,4,4,5};
		
		count(arr);

	}

}

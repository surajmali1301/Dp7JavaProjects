package com.LabSession_Strings;

public class RemoveDuplicate {

	static void duplicate(char a[]) {
	
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]=='\0') 
				continue;
			
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					a[j]='\0';
				}
			}
			System.out.print(a[i]);
		}
		
	}

	public static void main(String[] args) {

		String a = "Hello Java";

		char c[]=a.toCharArray();
		
		duplicate(c);

	}

}

package com.LabSession_Strings;

public class FindLetterFromString {

	static void find(String str) {
	
		char find = 'a';
		int index = -1;

		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)==find) {
				if(index==-1) {
					index=i;
					index++;
				}
				else {
					System.out.println("Second Occurance of 'a' at "+i);
					break;
				}
			}
		}
		
	}

	public static void main(String[] args) {

		String str = "Java Programming";

		find(str);
	}

}

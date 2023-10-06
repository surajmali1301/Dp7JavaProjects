package com.Basics;

public class GreaterCharacter {

	static char check(char a[]) {
		
		char greater='a';
		for (int i = 0; i < a.length; i++) {
			if(a[i]>greater) {
				greater=a[i];
			}
		}
//		System.out.println(greater);
		return greater;
	}
	public static void main(String[] args) {
		
		char c[]= {'a','g','c','d'};

		check(c);
		
		char g = check(c);
		
		System.out.println(g);
		
	}

}

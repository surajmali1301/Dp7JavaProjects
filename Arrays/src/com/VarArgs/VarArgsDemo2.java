package com.VarArgs;

public class VarArgsDemo2 {
	
	//Vargs Rules:
	/*
	 * There can be only one Var-args
	 * Var-Args last argument in the method*/

	static void display(int a[]) {
		for(int i:a) {
			System.out.print(i+" ");
		}
		
		System.out.println();
	}
	
	static void displayElement(int ...a) {
		
		for (int i : a) {
			System.out.println(i+" ");
		}
	}
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		display(a);
		
		displayElement(2,3,4);
		displayElement(5,6);

	}
	

}

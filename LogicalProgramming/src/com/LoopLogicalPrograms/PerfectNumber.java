package com.LoopLogicalPrograms;
import java.util.*;
public class PerfectNumber {
	
	
	static void perfect(int num) {
		
		int sum=0;
		for (int i = 1; i < num; i++) {
			
			if(num%i==0) {
				sum+=i;
			}
			
			if (sum==num) {
				System.out.println("perfect number");
			}
			else {
				System.out.println("not perfect number");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		

	}
}

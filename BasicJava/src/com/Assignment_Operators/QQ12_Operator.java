package com.Assignment_Operators;

public class QQ12_Operator {

	public static void main(String[] args) {
		int a = 34;
		int b = 21;
		int c = a++ + ++b;//56
		//		34	+	22 
		
		System.out.println("c: " + c);//56
		int d = --a + --b + c--;
		//       34	+	21 +  56 
		System.out.println("d: " + d);//111
		int e = a + +b + +c + d--;
		//  	34 + 22 + 54 + 111
		System.out.println("e: " + e);//222
		int f = -a + b-- + -c - d++;
//		//		-34 + 22 + -55 - 111
		System.out.println("f: " + f);//-178
		int sum = a + b + c + d + e + f;
//				-34	+ 22 + -55 + 111+ 222+-178
		System.out.println("sum: "+sum);
	}
}

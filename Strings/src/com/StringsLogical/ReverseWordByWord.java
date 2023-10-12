package com.StringsLogical;

public class ReverseWordByWord {

	static void reverse(String s) {
		String split[] = s.split("\\s");
		
		String rev ="";
		
		for (int i = 0; i < split.length; i++) {
			for (int j = split[i].length()-1;j>=0; j--) {
				rev=rev+split[i].charAt(j);
			}
			rev=rev+" ";
		}
		rev=rev+split[split.length-1];
		System.out.println("After: "+rev);
	}
	public static void main(String[] args) {


		String str ="I like to learn java";
		System.out.println("Before: "+str);
		reverse(str);

	}

}

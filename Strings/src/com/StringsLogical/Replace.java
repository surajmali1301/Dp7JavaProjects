package com.StringsLogical;

public class Replace {

	static void reverse(String s) {
		String split[] = s.split("\\s");
		
		String rev ="";
		rev = rev+split[0]+" ";
		for (int i = 1; i < split.length-1; i++) {
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

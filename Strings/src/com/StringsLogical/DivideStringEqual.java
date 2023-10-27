package com.StringsLogical;
//Array String Oops
import java.util.Arrays;
//2.Do code for --divide String in equal Characters
public class DivideStringEqual {

	static void divideEqual(String st,int noOfc) {
		
		int len=st.length();
		
		System.out.println(len);
		int n=len/noOfc;
		if(len%noOfc!=0) {
			System.out.println("We cannot divide in equal parts");
		}
		else {
		String split[] = new String[n];
		
		int index=0;
		
		for (int i = 0; i < len; i+=noOfc) {
			split[index]=st.substring(i,i+noOfc);
			index++;
		}
		System.out.println(Arrays.toString(split));
		}
	}
	public static void main(String[] args) {

		String str= "IamVerySmart";
		
		String a = str.join("",str);

		int noOfChar=3;
		divideEqual(str,noOfChar);
	}

}

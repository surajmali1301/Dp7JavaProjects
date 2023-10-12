package com.StringsLogical;
//Array String Oops
import java.util.Arrays;
//2.Do code for if String is unEqual
public class DivideStringEqual {

	static void divideEqual(String st,int noOfc) {
		
		int len=st.length();
		
		int n=len/noOfc;
		
		String split[] = new String[n];
		
		int index=0;
		
		for (int i = 0; i < len; i+=noOfc) {
			split[index]=st.substring(i,i+noOfc);
			index++;
		}
		System.out.println(Arrays.toString(split));
	}
	public static void main(String[] args) {

		String str= "IamVerySmart";
		
		String a = str.join("",str);

		int noOfChar=2;
		divideEqual(str,noOfChar);
	}

}

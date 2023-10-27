package com.StringsAssignment;

public class FindCountOfString {

	static void count(String strArr[]) {

		int count=0;
		
		for (int i = 0; i < strArr.length; i++) {
			
			if(strArr[i].equals("Visited"))
				continue;
			count=1;
			for (int j = i+1; j < strArr.length; j++) {
				if(strArr[i].equalsIgnoreCase(strArr[j])) {
					count++;
					strArr[j]="Visited";
				}
			}
			System.out.println(strArr[i]+"-------"+count);
		}
	}

	public static void main(String[] args) {

		String s = "Java is fun fun";

		String strArr[] = s.split("\\s");
		count(strArr);
		
	}
}

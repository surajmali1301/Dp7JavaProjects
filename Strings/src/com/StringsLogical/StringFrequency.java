package com.StringsLogical;

public class StringFrequency {

	static void frequency(String starr[]) {
		
		int count;
		for (int i = 0; i < starr.length; i++) {
			if(starr[i].equals("Visited"))
				continue;
			count=1;
			for (int j = i+1; j < starr.length; j++) {
				if(starr[i].equalsIgnoreCase(starr[j])) {
					count++;
					starr[i]="Visited";
				}
			}
			System.out.println(starr[i]+"---->"+count);
		}
	}
	public static void main(String[] args) {

		String str="A big cat is rolling on a big mat";
		String starr[]=str.split("\\s");
		frequency(starr);

	}

}

package com.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionArrayConversion {
//Array to Collection Conversion
	public static void main(String[] args) {
		
		
		String colours[]= {"Red","Blue","Green","Yellow"};
		
//		Arrays.sort(colours);
		
		System.out.println(Arrays.toString(colours));
		
		//1st Way
		
		List<String> al=Arrays.asList(colours);
		System.out.println(al);

		//2nd Way
		
		ArrayList<String>al2=new ArrayList<>(Arrays.asList(colours));
		System.out.println(al2);
		
		//3rd Way
		
		ArrayList<String>al3=new ArrayList<>();
		Collections.addAll(al3,colours);
	
		System.out.println("-----------------------");
		
		///////////////////////////////////////////
		
		//Array to ArrayList Conversion
		
		Object []col =  al2.toArray();
		System.out.println(al2);
		
		for (int i = 0; i < col.length; i++) {
			col[i]=((String)col[i]).concat("Colour");
		}
		System.out.println(Arrays.toString(col));
		
		//Type Safety is not there
		
		//type Safe
		
		String []col2=new String[al2.size()];
		al2.toArray(col2);
		
		for (int i = 0; i < col2.length; i++) {
			col2[i]=col2[i].concat("Colour2");
		}
		System.out.println(Arrays.toString(col2));
	}

}

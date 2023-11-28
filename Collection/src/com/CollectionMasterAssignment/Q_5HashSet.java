package com.CollectionMasterAssignment;
//5. Output of HashSet program
import java.util.HashSet;

class Country {
	String countryName;

	public Country(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "countryName=" + countryName + "]";
	}

}

public class Q_5HashSet {
	public static void main(String[] str) {
		HashSet myMap = new HashSet();
		String s1 = new String("India");
		String s2 = new String("India");
		Country s3 = new Country("France");
		Country s4 = new Country("France");
		myMap.add(s1);
		myMap.add(s2);
		myMap.add(s3);
		myMap.add(s4);
		System.out.println(myMap);
	}

}

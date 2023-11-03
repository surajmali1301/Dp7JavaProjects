package com.LinkedHashMap;

import java.util.Comparator;

public class mNoComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		return (int) (c1.getmNo()-c2.getmNo());
	}

}



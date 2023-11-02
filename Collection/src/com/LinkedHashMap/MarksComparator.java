package com.LinkedHashMap;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return (int) ((int)s1.getMarks()-s2.getMarks());
	}

}

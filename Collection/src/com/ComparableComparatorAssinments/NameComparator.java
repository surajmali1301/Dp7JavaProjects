package com.ComparableComparatorAssinments;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {

		if (s1.getName().compareTo(s2.getName()) > 0)
			return 1;
		if (s1.getName().compareTo(s2.getName()) < 0)
			return -1;
		else
			return 0;
	}

}

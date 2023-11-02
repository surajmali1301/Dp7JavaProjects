package com.LabSession;

import java.util.Comparator;

public class NameComparator implements Comparator<Bike2>{

	 @Override
     public int compare(Bike2 b1, Bike2 b2) {
         return b1.name.compareTo(b2.name);
     }

}

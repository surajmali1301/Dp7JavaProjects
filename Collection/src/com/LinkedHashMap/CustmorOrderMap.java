package com.LinkedHashMap;

import java.util.Map;
import java.util.TreeMap;

public class CustmorOrderMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Customer,Order> tmap= new TreeMap<>();
				
			tmap.put(new Customer(1,"Anuj",78951412), new Order(121,"laptop",45000));
			tmap.put(new Customer(1,"Anuj",78951412), new Order(111,"Pendrive",450));
			tmap.put(new Customer(2,"Nilam",789514127), new Order(11,"HardDisk",45000));
			tmap.put(new Customer(3,"Pratiksha",789456123), new Order(12,"MobilePhone",45000));
			tmap.put(new Customer(4,"Neha",789578964), new Order(123,"Charger",600));
			tmap.put(new Customer(5,"Dipti",874126963), new Order(101,"HeadPhone",5000));
			
//			for (Map.Entry(Customer, Order) : args) {
//				
//			}
	}

}

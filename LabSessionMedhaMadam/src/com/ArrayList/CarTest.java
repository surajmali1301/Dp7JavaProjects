package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CarTest {

	public static void discount(ArrayList<Car> c) {

		for (Car c1 : c) {
			if (c1.getPrice() > 1000000) {
				float price = (c1.getPrice() - c1.getPrice() * 0.05f);
				c1.setPrice(price);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Car> cList = new ArrayList<>();

		cList.add(new Car(1, "Red", 600000, (new Engine(2011, "Manual"))));
		cList.add(new Car(1, "Blue", 1000000, (new Engine(1011, "Automatic"))));
		cList.add(new Car(1, "White", 800000, (new Engine(2012, "Manual"))));
		cList.add(new Car(1, "Red", 2000000, (new Engine(1012, "Automatic"))));
		cList.add(new Car(1, "Orange", 3000000, (new Engine(2013, "Manual"))));

		ArrayList<Car> auto = new ArrayList<>();
		ArrayList<Car> manual = new ArrayList<>();
		for (Car car : cList) {
			if (car.getEng().getEngineType().equals("Automatic")) {
				auto.add(car);
//				System.out.println(car);
			} else {
				manual.add(car);
//				System.out.println(car);
			}

		}
		for (Car car : auto) {
			System.out.println(car);
		}
		System.out.println("---------------------");
		for (Car car : manual) {
			System.out.println(car);
		}

		System.out.println("-----------------------");

		discount(cList);
		Iterator<Car> itr = cList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------------------");

		//Sorting By price and EngineType
		Collections.sort(cList);
		System.out.println("Using Comprable");
		for (Car car : cList) {
			System.out.println(car);
		}
		System.out.println("--------------------------");

		
		//remove
		Iterator<Car> itr2 = cList.iterator();
		while (itr2.hasNext()) {
			if (itr2.next().getEng().getEngineType().equals("Manual")) {
				itr2.remove();
			}
		}
		for (Car c : cList) {
			System.out.println(c);
		}
		System.out.println("--------------------------");

	}

}

package com.LabSession_Array;

import java.util.*;

public class MovieMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println();
		Theatre t = new Theatre();

		System.out.println("Enter Theatre Name to Release Movie");
		t.setName(sc.next());

		System.out.println("How Many Movie Want to Realease: ");
		int n = sc.nextInt();

		Movie m[] = new Movie[n];

		for (int j = 0; j < m.length; j++) {
			m[j] = new Movie();

			System.out.println("Enter Movie Id: ");
			m[j].setmID(sc.nextInt());

			System.out.println("Enter Movie name: ");
			m[j].setmName(sc.next());

			System.out.println("Enter Movie Rating: ");
			m[j].setRating(sc.nextFloat());

		}

		Theatre t1[] = new Theatre[2];

		for (Movie m1 : m) {
			System.out.println(m1);
		}

//		Movie m1 = new Movie(1,"Jailer",7.5f);
//		Movie m2 = new Movie(1,"Jawan",8.5f);
//
//		
//		t1[0] = new Theatre(1,"PVR",m1);
//		t1[1] = new Theatre(2,"Cineplois",m2);
//		
	}

}

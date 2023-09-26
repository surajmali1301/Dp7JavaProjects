package com.Lab_Session;

import java.util.*;

public class SwitchMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the City Name: ");
		String cName = sc.next();

		switch (cName) {
		case "Pune":
			System.out.println(cName+" MH-12");
			break;
		case "Mumbai":
			System.out.println(cName+" MH-01");
			break;
		case "Nagpur":
			System.out.println(cName+" MH-31");
			break;

		default:
			System.out.println(cName+ " MH-00");
		}

	}

}

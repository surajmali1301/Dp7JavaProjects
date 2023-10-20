package com.LabSession_Strings;

import java.util.*;

public class PassWordValidity {

	static void verify(String pass) {

		for (int i = 0; i < pass.length(); i++) {

			if (pass.length() < 8) {
				System.out.println("Enter 8 Character Password");
				break;
			} else if (pass.contains("#") || (pass.contains("@"))) {
				System.out.println("PassWord: " + pass);
				break;
			}
			else {
				System.out.println("Use Special Character");	
			}
			if (pass.contains("\\s")) {
				System.out.println("Enter passWord Without Space");
				break;
			} 

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the UsernName: ");
//		String uName = sc.next();
//		System.out.println(uName);
		System.out.println("Enter Password");
		String pass = sc.next();
		verify(pass);

	}

}

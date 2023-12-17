package com.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilizableDemo {

	public static void main(String[] args) {
		
		Student s = new Student(1,"Suraj");
		
//		try {
//			FileOutputStream fos = new FileOutputStream("C:\\Users\\suraj\\OneDrive\\Desktop\\DP7 Warriors\\Serilizable.txt");
//			ObjectOutputStream os = new ObjectOutputStream(fos);
//			os.writeObject(s);
//			os.close();
//			fos.close();
//			System.out.println("Serilizable Completed");
//		} catch (Exception e) {
//			System.out.println("Error Occured");
//		}
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\suraj\\OneDrive\\Desktop\\DP7 Warriors\\Serilizable.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student stu = (Student)ois.readObject();
			ois.close();
			fis.close();
			System.out.println("De-serilization Complete");
		} catch (Exception e) {
			System.out.println("Error Occured");
		}
	}
}

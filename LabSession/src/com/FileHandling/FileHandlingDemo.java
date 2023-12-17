package com.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.*;

public class FileHandlingDemo {
	static Scanner sc= new Scanner(System.in);
	
	public void addData(File f) throws Exception{
		
			try {
				if(!f.exists()) {
					f.createNewFile();
				}
				System.out.println("Enter Data To Add: ");
				String fdata = sc.next();
				
				FileOutputStream fOut = new FileOutputStream(f);
				
				byte[] arr = fdata.getBytes();
				
				fOut.write(arr);
				System.out.println("Data Added......");
				fOut.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	
	public void readData(File f) {
		}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileHandlingDemo fd = new FileHandlingDemo();
		
		
		File f = new File("C:\\Users\\suraj\\OneDrive\\Desktop\\DP7 Warriors\\lab.txt");
		fd.addData(f);
		
	
		FileReader fr = new FileReader(f);
		try {
			if(f.exists()) {
				int temp = 0;
				System.out.println("Added Data: ");
				while((temp=fr.read())!=-1) {
					
					System.out.print((char)temp);
				}
			}
		} 
		finally {
			if(fr!=null) {
				fr.close();
			}
		}

	}

}

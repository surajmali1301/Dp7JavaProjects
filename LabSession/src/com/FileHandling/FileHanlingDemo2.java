package com.FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHanlingDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr = null;
		FileWriter fw = null;
		
	
		
		
	
		try {
			fr = new FileReader("C:\\Users\\suraj\\OneDrive\\Desktop\\DP7 Warriors\\lab.txt");
			fw=new FileWriter("C:\\Users\\suraj\\OneDrive\\Desktop\\DP7 Warriors\\labcopy.txt");
			
				int temp;
				System.out.println("Added Data: ");
				while((temp=fr.read())!=-1) {
					
					System.out.print((char)temp);
					fw.write(temp);
				}
			
		} 
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			if(fr!=null) {
				fr.close();
			}
			if(fw!=null) {
				fw.close();
			}
		}
	}

}

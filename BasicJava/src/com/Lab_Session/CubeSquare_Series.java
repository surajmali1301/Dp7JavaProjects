package com.Lab_Session;

public class CubeSquare_Series {

	public static void main(String[] args) {

		
		for(int i=1;i<=10;i++) {
			int series = (int)(Math.pow(i, 3)+ Math.pow(i, 2));
//			int series = i * i * i + i * i;
			System.out.print(series+ " ");
//			2 12 36 80 150 252 392 576 810 1100 
		}

	}

}

package com.LabSession2D_Array;

interface h{
	int a=10;
}
public class TransPose {
	
	static void transpose(int a[][]) {
		
//							    	rows	columns			
		int transp[][] = new int[a.length][a.length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				transp[j][i]=a[i][j];
			}
		}
		
		for (int[] row1 : transp) {
			for (int value : row1) {//value of array
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
		int max = transp[0][0];
		for (int[] row : transp) {
			for (int value : row) {
				if (value > max) { 
					max = value;
					System.out.println("Max: "+max);
				}
			}
		}

		
	}

	public static void main(String[] args) {


		int a[][]= {{1,2,3},{4,5,6}};
		
		transpose(a);

	}

}

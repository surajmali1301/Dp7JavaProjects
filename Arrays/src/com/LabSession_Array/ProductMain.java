package com.LabSession_Array;
import java.util.*;
public class ProductMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ProductImplementation p = new ProductImplementation();
		do {
			
			System.out.println("1.Add Product\n2.Show Product\n3.changeProduct\n4.DeleteProduct\n5.Exit");
			System.out.println("-------------------------------");
			System.out.print("Enter Your Option: ");
			int op = sc.nextInt();
			
			switch(op) {
			case 1:p.addProduct();
				break;
				
			case 2:p.showProduct();
				break;
				
			case 3:p.updateProduct();
				break;
				
			case 4:p.deleteProduct();
				break;
				
			case 5:System.exit(0);
				break;
				
			default :System.out.println("Enter Correct Input");
				break;
			}
		}while(true);
	}

}

package com.LabSession_Array;

import java.util.Arrays;
import java.util.Scanner;

class ProductImplementation implements ProductDetails {

	static Scanner sc = new Scanner(System.in);
	Product p[] = new Product[100];
	int count = 0;

	@Override
	public void addProduct() {

		System.out.print("How Many Product You Want To Add? ");
		int add = sc.nextInt();

		System.out.println("----Add Product----");

		for (int i = 0; i < add; i++) {

			System.out.print("Enter Product Id: ");
			int pId = sc.nextInt();

			System.out.print("Enter Product Name: ");
			String pName = sc.next();

			sc.nextLine();

			System.out.print("Enter Product Category: ");
			String category = sc.nextLine();

			System.out.print("Enter Price Of Product: ");
			float price = sc.nextFloat();

			System.out.print("Enter Stock Details: ");
			int stock = sc.nextInt();

			System.out.println("------------------------------");

			p[count] = new Product(pId, pName, category, price, stock);
			count++;
		}

	}

	@Override
	public void showProduct() {

		for(int i=0;i<count;i++)
		{
			if (p[i]!= null) {
				System.out.println(p[i]);
			}
		}

		System.out.println("-------------------");
	}

	@Override
	public void updateProduct() {

		System.out.println("Enter Product ID You Want Change...");
		int uId = sc.nextInt();

		for (int i = 0; i < count; i++) {

			if (uId == p[i].getpID() && p[i].getpName() != null) {

				System.out.print("Enter Product Name: ");
				p[i].setpName(sc.next());

				sc.nextLine();

				System.out.print("Enter Product Category: ");
				p[i].setpCategory(sc.next());

				sc.next();

				System.out.print("Enter Price Of Product: ");
				p[i].setPrice(sc.nextFloat());

				System.out.print("Enter Stock Details: ");
				p[i].setpStock(sc.nextInt());
			}
		}

	}

	@Override
	public void deleteProduct() {
		
		System.out.println("Enter Product Id You Want Delete");
		int dId = sc.nextInt();

		for (int i = 0; i < count; i++) {

			if (dId==p[i].getpID() &&p[i] != null) {

				p[i] = null;
			}

		}
		System.out.println("Product Deleted..");

	}

}

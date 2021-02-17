package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int add, remove;

		System.out.println("Enter product data:");

		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
//		System.out.print("Quantity in stock: ");
//		int quantity = sc.nextInt(); 14 52 23 34 51 26
		
		Product product = new Product(name, price);

		System.out.println("Product data: " + product);

		System.out.print("Enter the number of products to be added in stock: ");
		add = sc.nextInt();
		product.addProducts(add);
		System.out.println("Updated data: " + product);

		System.out.print("Enter the number of products to be removed from stock:");
		remove = sc.nextInt();
		product.removeProducts(remove);
		System.out.println("Updated data:" + product);

		sc.close();
	}

}

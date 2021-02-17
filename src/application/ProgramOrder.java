package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class ProgramOrder {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("E-mail: ");
		String clientEmail = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY):");
		Date birthDate = sdf.parse(sc.next());

		Client client = new Client(clientName, clientEmail, birthDate);
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = "PROCESSING";

		Date moment = new Date();

		Order order = new Order(moment, OrderStatus.valueOf(status), client);

		System.out.print("How many items to this order? ");
		int nItem = sc.nextInt();
		
		for (int i = 1; i <= nItem; i++) {
			sc.nextLine();
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			String name = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			Product product = new Product(name, price);
			OrderItem oItem = new OrderItem(quantity, price, product);
			order.addItem(oItem);
		}
		
		System.out.println(order);

		sc.close();

	}

}

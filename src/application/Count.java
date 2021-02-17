package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account0;

public class Count {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account0 create;
		
		int number;
		String holder;
		char option;
		double deposit, saque;

		System.out.println("Enter account number: ");
		number = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter account holder: ");
		holder = sc.next();
		
		sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)? ");
		option = sc.next().charAt(0);
		
		
		if(option == 'y') {
			System.out.println("Enter initial deposit value: ");
			deposit = sc.nextDouble();
			create = new Account0(number, holder, deposit);
		} else {
			create = new Account0(number, holder);
		}
		
		System.out.println("Account data: ");
		System.out.println(create);
		
		System.out.println("Enter a deposit value: ");
		deposit = sc.nextDouble();
		create.deposit(deposit);		
		System.out.println("Updated account data: ");
		System.out.println(create);
		
		System.out.println("Enter a withdraw value: ");
		saque = sc.nextDouble();
		create.saque(saque);		
		System.out.println("Updated account data: ");
		System.out.println(create);
		
		sc.close();
	}

}

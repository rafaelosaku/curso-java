package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Converter {

	public static void main (String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Whats is the dollar price? ");
		double price = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double bought = sc.nextDouble();
		
		double amount = CurrencyConverter.converter(price, bought);
		
		System.out.printf("Amount to be paid in reais: %.2f%n", amount);

		sc.close();
	}
}

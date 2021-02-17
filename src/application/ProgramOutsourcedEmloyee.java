package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class ProgramOutsourcedEmloyee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		String name;
		int hours;
		double valuePerHour, additionalCharge;
		char option;
		
		System.out.print("Enter the number of empoyees:");
		int nEmployee = sc.nextInt();
		
		for(int i = 1; i <= nEmployee; i++) {
			sc.nextLine();
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			option = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Hours: ");
			hours = sc.nextInt();
			System.out.print("Value per hour: ");
			valuePerHour = sc.nextDouble();
			
			
			if(option == 'y') {
				System.out.print("Additional charge: ");
				additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else {
				list.add(new Employee(name, hours, valuePerHour));
			}			
		}
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee emp: list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}		
		
		sc.close();

	}

}

package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
		 * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 * 
		 * System.out.print("Enter department's name: "); String departmentName
		 * = sc.nextLine();
		 * 
		 * System.out.print("Enter worker data: "); System.out.print("Name: ");
		 * String workerName = sc.nextLine();
		 * 
		 * System.out.print("Level: "); String workerLevel = sc.nextLine();
		 * 
		 * System.out.print("Base Salary : "); double baseSalary=
		 * sc.nextDouble();
		 * 
		 * Worker worker = new Worker(workerName,
		 * WorkerLevel.valueOf(workerLevel), baseSalary, new
		 * Department(departmentName));
		 * 
		 * System.out.print("How many contracts to this worker? "); int n =
		 * sc.nextInt();
		 * 
		 * for (int i=1; i <= n; i++){ System.out.print("Enter contract #" + i +
		 * " data:"); System.out.print("Date (DD/MM/YYYY): "); Date contractDate
		 * = sdf.parse(sc.next()); System.out.print("Value per hour: "); double
		 * valuePerHour = sc.nextDouble();
		 * System.out.print("Duration (hours): "); int hours = sc.nextInt();
		 * HourContract contract = new HourContract(contractDate, valuePerHour,
		 * hours); worker.addContract(contract); }
		 * 
		 * System.out.println(); System.out.
		 * print("Enter month and year to calculate income (MM/YYYY): "); String
		 * monthAndYear = sc.next(); int month =
		 * Integer.parseInt(monthAndYear.substring(0, 2)); int year =
		 * Integer.parseInt(monthAndYear.substring(3));
		 * 
		 * System.out.println("Name: " + worker.getName());
		 * System.out.println("Department: " +
		 * worker.getDepartment().getName()); System.out.println("Income for " +
		 * monthAndYear + ": " + String.format("%.2f", worker.income(year,
		 * month)));
		 */

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Entre com o preco");
		double preco = sc.nextDouble();
		double desconto;
		desconto = preco * ((preco < 20.00) ? 0.1 : 0.05);
		System.out.println("o desconto ser�: " + desconto);

		sc.close();
	}

}

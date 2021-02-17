package application;

import entities.Account;
import entities.SavingsAccount;

public class ProgramAccount {

	public static void main(String[] args) {

		/**
		 * 
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
//		UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

//		DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(200.0);
		
//		BusinessAccount acc5 = (BusinessAccount) acc3;
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(2000);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		*/
		
		/**
		 * Polimorfismo - variáveis do mesmo tipo, porém com comportamentos diferentes;
		 */
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println("X: " + x.getBalance());
		System.out.println("Y: " + y.getBalance());
		
	}

}

package entities;

public class Account0 {

	private int number;
	private String holder;
	private double balance;

	/**
	 * @param number
	 * @param holder
	 * @param balace 170515033222
	 */
	public Account0(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	/**
	 * @param holder
	 * @param balance
	 */
	public Account0(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double deposit) {
		this.balance += deposit;
	}
	
	public void saque(double saque) {
		this.balance -= saque + 5.00;
	}
	
	public String toString() {
		return "Account " + number 
				+ ", Holder: " + holder 
				+ ", Balance: $ " + String.format("%.2f", balance);
	}

}

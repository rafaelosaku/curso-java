package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	/*M�todo construtor*/
	public Product() {
	}

	/**
	 * Construtor com sobrecarga
	 * @param name
	 * @param price
	 * @param quantity
	 */
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	/**
	 * Construtor com sobrecarga
	 * @param name
	 * @param price
	 */
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}	

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return "Product data: " + name 
				+ ", $ "
				+ String.format("%.2f", price) 
				+ ", "
				+ quantity
				+ " units, Total: "
				+ String.format("%.2f", totalValueInStock());
	}
}

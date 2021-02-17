package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat birth = new SimpleDateFormat("dd/MM/yyyy");

	private Integer id;
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>();

	private Client client;

	public Order() {

	}

	public Order(Integer id, Date moment, OrderStatus status) {
		this.setId(id);
		this.setMoment(moment);
		this.setStatus(status);
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.setMoment(moment);
		this.setStatus(status);
		this.setClient(client);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
//	public String toString() {
//		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
//	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMARY:\n");
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + " (" + birth.format(client.getBirthDate()) + ") - "
				+ client.getEmail() + "\n");
		sb.append("Order items:\n");
		for (OrderItem p : items) {
			sb.append(p.getProduct().getName() + ",  $" + String.format("%.2f", p.getPrice()) + ", Quantity: " + p.getQuantity()
					+ ", Subtotal: $" + String.format("%.2f", p.subTotal()) + ":\n");
		}
		sb.append("Total price: $" + String.format("%.2f", total()));
		return sb.toString();
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public double total() {
		double total = 0;
		for (OrderItem i : items) {
			total += i.subTotal();
		}
		return total;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}

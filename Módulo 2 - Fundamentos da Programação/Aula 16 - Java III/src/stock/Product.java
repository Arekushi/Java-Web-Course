package stock;

public class Product {
	private String name;
	private double price;
	private int quantity;
	private String status;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.status = "Created";
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
		this.status = "Added";
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
		this.status = "Removed";
	}
	
	@Override
	public String toString() {
		return String.format(
				"Status: %s, Product: %s, Price: %.2f, Quantity: %d, Total: %.2f%n",
				status, name, price, quantity, totalValueInStock());
	}

}

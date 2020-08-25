package snack;

public class Snack {
	private final Double deliveryTime;
	private Double price;
	private Double preparationTime;
	private Double deliveryTax;
	private Double distance;
	
	public Snack(Double price, Double preparationTime) {
		this.price = price;
		this.deliveryTime = 10.0;
		this.preparationTime = preparationTime;
		this.deliveryTax = 0.15;
	}
	
	public Snack(Double price) {
		this.price = price;
		this.deliveryTime = 10.0;
		this.deliveryTax = 0.15;
	}
	
	public Snack() {
		this.deliveryTime = 10.0;
		this.deliveryTax = 0.15;
	}
	
	public Double getPrice() {
		return price + (getTime(distance) * deliveryTax);
	}
	
	public Double getDeliveryTime() {
		return deliveryTime;
	}
	
	public Double getPreparationTime() {
		return preparationTime;
	}
	
	protected void setPrice(Double price) {
		this.price = price;
	}
	
	protected void setPreparationTime(Double preparationTime) {
		this.preparationTime = preparationTime;
	}
	
	public Double getTime(Double distance) {
		this.distance = distance;
		return (distance * deliveryTime) + preparationTime;
	}
}

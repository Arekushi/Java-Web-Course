package snack;

public class Cake extends Snack {
	private String pasta;
	private String filling;
	private String roof;
	
	public Cake(Double price) {
		super(price);
		setPreparationTime(10.0);
	}
	
	public Cake() {
		super();
		setPrice(20.0);
		setPreparationTime(10.0);
	}
	
	public void addIngredients(String pasta, String filling, String roof) {
		this.pasta = pasta;
		this.filling = filling;
		this.roof = roof;
	}
	
	public String getPasta() {
		return pasta;
	}
	
	public String getFilling() {
		return filling;
	}
	
	public String getRoof() {
		return roof;
	}
}

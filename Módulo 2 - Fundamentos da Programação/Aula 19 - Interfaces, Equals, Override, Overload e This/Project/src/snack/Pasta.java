package snack;

public class Pasta extends Snack {
	private String sauce;
	
	public Pasta(Double price) {
		super(price);
		setPreparationTime(30.0);
	}
	
	public Pasta() {
		super();
		setPreparationTime(30.0);
	}
	
	public void addSauce(String sauce) {
		this.sauce = sauce;
	}
	
	public String getSauce() {
		return sauce;
	}
}

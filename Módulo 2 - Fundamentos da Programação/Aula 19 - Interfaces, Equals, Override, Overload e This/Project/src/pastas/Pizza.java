package pastas;

import snack.Pasta;

public class Pizza extends Pasta {

	public Pizza(Double price) {
		super(price);
	}
	
	public Pizza() {
		super();
		setPrice(30.0);
	}

}

package pastas;

import snack.Pasta;

public class Spaghetti extends Pasta {

	public Spaghetti(Double price) {
		super(price);
	}
	
	public Spaghetti() {
		super();
		setPrice(20.0);
	}

}

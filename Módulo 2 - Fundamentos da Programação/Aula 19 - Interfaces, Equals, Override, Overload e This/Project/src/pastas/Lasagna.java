package pastas;

import snack.Pasta;

public class Lasagna extends Pasta {

	public Lasagna(Double price) {
		super(price);
	}
	
	public Lasagna() {
		super();
		setPrice(10.0);
	}
	
}

package snack;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends Snack {

	List<String> ingredients = new ArrayList<>();
	
	public Sandwich(Double price) {
		super(price);
		setPreparationTime(15.0);
	}
	
	public Sandwich() {
		super();
		setPrice(10.0);
		setPreparationTime(15.0);
	}
	
	public void addIngredient(String ingredient) {
		ingredients.add(ingredient);
	}

}

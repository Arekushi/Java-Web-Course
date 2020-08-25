package flying;

import interfaces.Flying;

public class Duck implements Flying {

	private Integer energy;
	
	public Duck(Integer energy) {
		this.energy = energy;
	}
	
	@Override
	public void fly() {
		energy -= 5;
		System.out.println("Estou voando como um pato");
	}

}

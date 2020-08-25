package flying;

import interfaces.Flying;

public class Airplane implements Flying {

	private Integer hours;
	
	public Airplane(Integer hours) {
		this.hours = hours;
	}
	
	@Override
	public void fly() {
		hours += 13;
		System.out.println("Estou voando como um avião");
	}

}

package mammals;

import animals.Mammal;

public class Cow extends Mammal {

	public Cow(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println("Mugindo");
	}

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Double LitersOfWater() {
		// TODO Auto-generated method stub
		return null;
	}

}

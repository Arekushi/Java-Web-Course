package mammals;

import animals.Mammal;

public class Dog extends Mammal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println("Latindo");
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

package birds;

import animals.Bird;

public class Parrot extends Bird {

	public Parrot(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println("Falando");
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

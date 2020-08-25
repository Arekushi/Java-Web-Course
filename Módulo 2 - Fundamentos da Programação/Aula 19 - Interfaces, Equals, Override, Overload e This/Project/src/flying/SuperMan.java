package flying;

import interfaces.Flying;

public class SuperMan implements Flying {

	public Integer experience;
	
	public SuperMan(Integer experience) {
		this.experience = experience;
	}
	
	@Override
	public void fly() {
		experience += 3;
		System.out.println("Estou voando como um campeão");
	}

}

package animals;

public abstract class Animal implements IBeast {
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void speak();
}

package equals;

public class Person {
	private String name;
	private Integer rg;
	
	public Person(String name, Integer rg) {
		this.name = name;
		this.rg = rg;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getRg() {
		return rg;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			return rg == ((Person) obj).rg;
		} catch(Exception e) {
			return false;
		}
	}
}

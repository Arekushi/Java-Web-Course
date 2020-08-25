package equals;

public class Employee {
	private String name;
	private Integer registry;
	
	public Employee(String name, Integer registry) {
		this.name = name;
		this.registry = registry;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getRegistry() {
		return registry;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			return registry == ((Employee) obj).registry;
		} catch(Exception e) {
			return false;
		}
	}
}

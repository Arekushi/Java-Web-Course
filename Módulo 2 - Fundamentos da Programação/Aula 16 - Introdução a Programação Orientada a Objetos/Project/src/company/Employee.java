package company;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void increaseSalary(Double percentage) {
		this.salary += salary * percentage / 100;
	}
	
	@Override
	public String toString() {
		return String.format("Id: %d, Employee: %s, Salary: %.2f%n", id, name, salary);
	}
}

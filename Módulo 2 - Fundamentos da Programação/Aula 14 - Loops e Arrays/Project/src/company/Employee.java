package company;

public class Employee {
	private String name;
	private double grossSalary;
	private double tax;
	
	public Employee(String name, double grossSalary, double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void IncreaseSalary(int percentage) {
		this.grossSalary += grossSalary * percentage / 100;
	}
	
	public String showEmployee() {
		return String.format("Employee: %s, Total: %.2f%n", name, netSalary());
	}
}

package company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Company {
	private List<Employee> employees = new ArrayList<Employee>();
	
	public Company(Employee employees[]) {
		this.employees = Arrays.asList(employees);
	}
	
	public Company(List<Employee> employees) {
		this.employees = employees;
	}
	
	public Company() {}
	
	public List<Employee> getEmployees() {
		return employees;
	}
	
	public Boolean hasExists(Integer id) {
		return employees.stream().anyMatch(x -> x.getId().equals(id));
	}
	
	public String showEmployees() {		
		return Arrays.toString(employees.toArray());
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
}

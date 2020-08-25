package main;

import java.util.ArrayList;
import java.util.List;

import equals.Employee;

public class Example8 {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("A", 01));
		employees.add(new Employee("B", 02));
		employees.add(new Employee("C", 03));
		employees.add(new Employee("D", 04));
		
		Employee newEmployee = new Employee("E", 01);
		System.out.println(employees.contains(newEmployee));
	}
}

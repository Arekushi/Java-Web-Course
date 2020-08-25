package application;

import java.util.ArrayList;
import java.util.List;
import entities.Employee;
import entities.OutsourcedEmployee;
import io.Reader;

public class Program {
	public static void main(String[] args) {
		Reader reader = new Reader();
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = reader.readInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = reader.readString().charAt(0);
			
			System.out.print("Name: ");
			String name = reader.readString();
			
			System.out.print("Hours: ");
			int hours = reader.readInt();
			
			System.out.print("Value per hour: ");
			double valuePerHour = reader.readDouble();
			
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = reader.readDouble();
				employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
				
			} else {
				employees.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println("\nPAYMENTS:");
		for (Employee employee : employees)
			System.out.println(String.format("%s - $ %.2f", employee.getName(), employee.payment()));
	}
}

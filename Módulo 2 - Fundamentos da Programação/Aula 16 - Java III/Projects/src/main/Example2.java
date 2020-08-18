package main;

import company.Company;
import company.Employee;
import io.Reader;
import io.Writer;

public class Example2 {
	public static void main(String[] args) {
		Reader reader = new Reader();
		Writer writer = new Writer();
		Company company = new Company();
		
		int n = reader.readInt();
		
		for(int i = 0; i < n; i++) {
			Integer id;
			
			do id = reader.readInt();
			while(company.hasExists(id));
			
			String name = reader.readString();
			Double salary = reader.readDouble();
			
			company.addEmployee(new Employee(id, name, salary));
		}
		
		int id = reader.readInt();
		Employee employee = company.getEmployees().stream()
				.filter(x -> x.getId().equals(id))
				.findFirst()
				.orElse(null);
		
		if(employee == null)
			writer.write("ID inexistente\n");
		else
			employee.increaseSalary(reader.readDouble());
		
		writer.write(company.showEmployees());
		writer.flush();
	}
}

package oriented;

import company.Employee;
import io.Reader;
import io.Writer;

public class Example3 {
	public static void main(String[] args) {
		Reader reader = new Reader();
		Writer writer = new Writer();
		
		Employee employee = 
				new Employee(reader.readString(), reader.readDouble(), reader.readDouble());
		writer.write(employee.showEmployee());
		
		employee.IncreaseSalary(reader.readInt());
		writer.write(employee.showEmployee());
		
		writer.flush();
	}
	
}

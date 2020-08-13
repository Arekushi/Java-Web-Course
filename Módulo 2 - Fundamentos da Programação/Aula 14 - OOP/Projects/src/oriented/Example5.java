package oriented;

import io.Reader;
import io.Writer;
import school.Student;

public class Example5 {
	public static void main(String[] args) {
		Reader reader = new Reader();
		Writer writer = new Writer();
		
		String name = reader.readString();
		double grades[] = new double[3];
		
		for(int i = 0; i < 3; i++) {
			grades[i] = reader.readDouble();
		}
		
		writer.write(new Student(name, grades).toString());
		writer.flush();
	}
	
}

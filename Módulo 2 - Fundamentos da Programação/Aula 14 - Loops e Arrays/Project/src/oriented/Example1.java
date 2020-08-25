package oriented;

import java.io.IOException;
import geometry.Triangle;
import io.Reader;
import io.Writer;

public class Example1 {
	public static void main(String[] args) throws IOException {
		Reader reader = new Reader();
		Writer writer = new Writer();
		
		Triangle triangles[] = new Triangle[2];
		double vertices[][] = new double[2][3];
		
		for(int i = 0; i < vertices.length; i++) {
			for(int j = 0; j < vertices[0].length; j++)
				vertices[i][j] = reader.readDouble();
			
			triangles[i] = new Triangle(vertices[i]);
		}
		
		writer.writeln(new StringBuilder()
				.append(String.format("Triangle X area: %.4f%n", triangles[0].getArea()))
				.append(String.format("Triangle Y area: %.4f%n", triangles[1].getArea()))
				.append(String.format("Larger Area: %s%n", 
						triangles[0].getArea() > triangles[1].getArea()? "X" : "Y"))
				.toString());
		
		writer.flush();
	}
}

package oriented;

import geometry.Rectangle;
import io.Reader;
import io.Writer;

public class Example4 {
	public static void main(String[] args) {
		Reader reader = new Reader();
		Writer writer = new Writer();
		
		writer.write(new Rectangle(reader.readDouble(), reader.readDouble()).toString());
		writer.flush();
	}
	
}

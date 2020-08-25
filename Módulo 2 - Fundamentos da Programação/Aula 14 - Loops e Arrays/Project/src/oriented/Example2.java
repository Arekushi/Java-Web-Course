package oriented;

import io.Reader;
import io.Writer;
import stock.Product;

public class Example2 {
	public static void main(String[] args) {
		Reader reader = new Reader();
		Writer writer = new Writer();
		
		Product product =
				new Product(reader.readString(), reader.readDouble(), reader.readInt());
		writer.write(product.getStatus());
		
		product.addProducts(reader.readInt());
		writer.write(product.getStatus());
		
		product.removeProducts(reader.readInt());
		writer.write(product.getStatus());
		
		writer.flush();
	}
	
}

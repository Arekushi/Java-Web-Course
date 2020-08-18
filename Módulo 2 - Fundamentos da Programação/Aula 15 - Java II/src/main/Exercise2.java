package main;

import io.Reader;
import io.Writer;
import money.CurrencyConverter;

public class Exercise2 {
	public static void main(String[] args) {
		Reader reader = new Reader();
		Writer writer = new Writer();
		
		writer.write(String.format("Valor convertido: R$ %.2f", 
				CurrencyConverter.DolarToReais(reader.readDouble(), reader.readDouble())));
		writer.flush();
	}
}

package main;

import interfaces.Printable;
import printables.Contract;
import printables.Document;
import printables.Photo;
import printables.Printer;

public class Example3 {
	public static void main(String[] args) {
		Printable printables[] = {
				new Contract("A", "A"),
				new Photo("B", "B"),
				new Document("C", "C")
		};
		
		Printer printer = new Printer(printables);
		printer.printAll();
	}
}

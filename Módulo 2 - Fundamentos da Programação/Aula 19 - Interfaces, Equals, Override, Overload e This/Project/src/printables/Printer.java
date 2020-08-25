package printables;

import java.util.Arrays;
import java.util.List;

import interfaces.Printable;

public class Printer {
	List<Printable> printables;
	
	public Printer(List<Printable> printables) {
		this.printables = printables;
	}
	
	public Printer(Printable printables[]) {
		this.printables = Arrays.asList(printables);
	}
	
	public void printAll() {
		for(Printable printable : printables) {
			printable.printOut();
		}
	}
	
	public void addPrintable(Printable printable) {
		printables.add(printable);
	}
}

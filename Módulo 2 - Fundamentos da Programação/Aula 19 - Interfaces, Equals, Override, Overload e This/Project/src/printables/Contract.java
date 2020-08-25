package printables;

import interfaces.Printable;

public class Contract extends File implements Printable {

	public Contract(String name, String type) {
		super(name, type);
	}

	@Override
	public void printOut() {
		System.out.println(String.format("Sou um contrato muito legal. %s %s", name, type));
	}
	
}

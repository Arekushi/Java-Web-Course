package printables;

import interfaces.Printable;

public class Document extends File implements Printable {

	public Document(String name, String type) {
		super(name, type);
	}

	@Override
	public void printOut() {
		System.out.println(String.format("Sou um documento do Word. %s, %s", name, type));
	}

}

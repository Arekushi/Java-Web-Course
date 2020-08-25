package printables;

import interfaces.Printable;

public class Photo extends File implements Printable {

	public Photo(String name, String type) {
		super(name, type);
	}

	@Override
	public void printOut() {
		System.out.println(String.format("Sou uma Selfie. %s, %s", name, type));
	}

}

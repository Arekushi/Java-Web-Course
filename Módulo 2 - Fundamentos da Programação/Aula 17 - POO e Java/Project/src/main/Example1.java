package main;

import contact.Notebook;
import menu.Menu;

public class Example1 {
	public static void main(String[] args) {
		Notebook notebook = new Notebook();
		Menu menu = new Menu(notebook);
		int enter;
		
		do {
			enter = menu.startMenu();
			menu.chooseOption(enter);
		} while(enter > 0 && enter < 5);
	}
}

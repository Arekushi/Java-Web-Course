package main;

import flying.Airplane;
import flying.ControlTower;
import flying.Duck;
import flying.SuperMan;
import interfaces.Flying;

public class Example4 {
	public static void main(String[] args) {
		Flying flyings[] = {
			new Duck(5),
			new Airplane(10),
			new SuperMan(5)
		};
		
		ControlTower tower = new ControlTower(flyings);
		tower.flyAll();
	}
}

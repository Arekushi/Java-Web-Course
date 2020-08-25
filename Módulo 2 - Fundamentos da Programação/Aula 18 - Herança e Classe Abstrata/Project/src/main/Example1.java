package main;

import java.util.ArrayList;
import java.util.List;

import animals.Animal;
import animals.Bird;
import birds.BemTeVi;
import birds.Parrot;
import mammals.Cow;
import mammals.Dog;

public class Example1 {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		
		Animal cow = new Cow("Caquinha");
		Animal bemtevi = new BemTeVi("Bem-Te-Vi");
		Animal dog = new Dog("Doguinho");
		Parrot parrot = new Parrot("Papagaio");

		animals.add(cow);
		animals.add(bemtevi);
		animals.add(dog);
		animals.add(parrot);
		
		for(Animal animal : animals) {
			System.out.println(String.format("%s - %s", 
					animal.getName(), animal instanceof Bird? "Bird" : "Mammal"));
		}
	}
}

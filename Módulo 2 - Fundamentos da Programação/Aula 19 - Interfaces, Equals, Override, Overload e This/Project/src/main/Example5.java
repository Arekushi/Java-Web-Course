package main;

import equals.Person;

public class Example5 {
	public static void main(String[] args) {
		Person one = new Person("Alex", 123);
		Person two = new Person("Gih", 123);
		
		System.out.println(one.equals(two));
	}
}

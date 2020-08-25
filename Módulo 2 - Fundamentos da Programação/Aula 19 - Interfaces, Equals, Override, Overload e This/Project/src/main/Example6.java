package main;

import equals.Coca;

public class Example6 {
	public static void main(String[] args) {
		Coca one = new Coca(100, 10.0);
		Coca two = new Coca(10, 10.0);
		
		System.out.println(one.equals(two));
	}
}

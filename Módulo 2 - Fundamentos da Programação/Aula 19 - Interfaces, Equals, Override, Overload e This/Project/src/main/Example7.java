package main;

import java.util.ArrayList;
import java.util.List;

import equals.Student;

public class Example7 {
	public static void main(String[] args) {		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Alex", 01));
		students.add(new Student("Gih", 02));
		students.add(new Student("Deru", 03));
		students.add(new Student("Canaro", 04));
		
		Student newStudent = new Student("Melão", 01);
		System.out.println(students.contains(newStudent));
	}
}

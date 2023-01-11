package com.cognixia.jump.inheritanceandcomposition;

public class CollegeClassRunner {
	
	public static void main(String[] args) {
		
		// create class
		CollegeClass psychIntro = new CollegeClass("Psychology", "Intro to Psychology", "Warren", 112);
		
		// print students
		psychIntro.listStudents();
		
		// add students
		psychIntro.addStudent(new Student("James", Standing.FRESHMAN, 3.4));
		psychIntro.addStudent(new Student("Ana", Standing.FRESHMAN, 3.6));
		psychIntro.addStudent(new Student("Nick", Standing.SOPHMORE, 3.7));
		psychIntro.addStudent(new Student("Sam", Standing.JUNIOR, 3.3));
		
		// print again
		psychIntro.listStudents();
		
		// get individual students
		System.out.println("\nStudent with id 2: " + psychIntro.getStudent(2));
		
		// remove a student and then print students
		System.out.println("\nRemoving student: " + psychIntro.removeStudent(3).getName());
		psychIntro.listStudents();
		
	}

}

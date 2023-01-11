package com.cognixia.jump.inheritanceandcomposition;

import java.text.DecimalFormat;

//enum can be placed within same file since will only be used for a Student
enum Standing {
	FRESHMAN, SOPHMORE, JUNIOR, SENIOR
}

public class Student {

	
	private static int idCounter = 1; // keep track of ids for students
	private static DecimalFormat df = new DecimalFormat("#.##"); // used to format gpa to 2 decimal places
	
	private int studentId; // used to identify each student
	private String name;
	private Standing standing;
	private double gpa;
	
	public Student(String name, Standing standing, double gpa) {
		super();
		this.studentId = idCounter++; // don't pass in an id, generate it with the idCounter
		this.name = name;
		this.standing = standing;
		
		setGpa(gpa); // use method so check for proper gpa
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Standing getStanding() {
		return standing;
	}

	public void setStanding(Standing standing) {
		this.standing = standing;
	}

	public double getGpa() {
		// we use the df to format to two decimal places
		return Double.parseDouble(df.format(gpa));
	}

	public void setGpa(double gpa) {
		
		if(gpa > 4) {  // don't want any weird gpa values
			this.gpa = 4;
		}
		else if(gpa < 0) {
			this.gpa = 0;
		}
		else {
			this.gpa = gpa;
		}
		
	}
	// only generate a getter for student ID, don't 
		// want to change value once set
		public int getStudentId() {
			return studentId;
		}

		@Override
		public String toString() {
			return "ID=" + studentId + ", Name=" + name + ", Standing=" + standing + ", GPA=" + gpa;
		}
	
	
	
}

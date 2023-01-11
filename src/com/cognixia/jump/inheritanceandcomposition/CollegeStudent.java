package com.cognixia.jump.inheritanceandcomposition;

import java.text.DecimalFormat;

enum CollegeStanding {
	FRESHMAN, SOPHMORE, JUNIOR, SENIOR
}

public class CollegeStudent {
	
	private static int idCounter = 1; // keep track of ids for students
	private static DecimalFormat df = new DecimalFormat("#.##"); // used to format gpa to 2 decimal places

	private int studentId; // used to identify each student
	private String name;
	private CollegeStanding standing;
	
	private int gradeCount;
	private Grade[] grades;
	
	public CollegeStudent(String name, CollegeStanding standing) {
		super(); // will still work without this
		this.studentId = idCounter++; // don't pass in an id, generate it with the idCounter
		this.name = name;
		this.standing = standing;
		
		this.gradeCount = 0;
		this.grades = new Grade[10];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CollegeStanding getStanding() {
		return standing;
	}

	public void setStanding(CollegeStanding standing) {
		this.standing = standing;
	}

	// calculation for gpa
	public double getGpa() {
		double gpa = 0;
		
		for(Grade g : grades) {
			gpa += g.getNumberGrade();
		}
		
		gpa = gpa / gradeCount;
		
		// we use the df to format to two decimal places
		return Double.parseDouble(df.format(gpa));
	}


	// only generate a getter for student ID, don't 
	// want to change value once set
	public int getStudentId() {
		return studentId;
	}
	
	// only to get all grades
	public Grade[] getGrades() {
		return grades;
	}
	
	// get index of grade
	public int indexOfGrade(String className) {
		
		for(int g = 0; g < grades.length; g++) {
			
			if(grades[g] == null) {
				continue;
			}
			else if(grades[g].getClassName().equals(className)) { // found grade
				return g;
			}
			
		}
		
		return -1; // not found
	}
	
	// get grade
	public Grade getGrade(String className) {
		
		int index = indexOfGrade(className);
		
		if(index != -1) {
			return grades[index];
		}
		
		return null;		
	}
	
	// add grade
	public Grade addGrade(Grade newGrade) {
		
		int index = indexOfGrade(newGrade.getClassName());
		
		if(gradeCount == grades.length) { // grades full
			return null;
		}
		
		if(index == -1) { // if -1, grade for class not there yet
			
			for(int g = 0; g < grades.length; g++) {
				
				if(grades[g] == null) {
					grades[g] = newGrade;
					gradeCount++;
					return newGrade;
				}
			}
		}

		return null;
	}
	
	// delete grade
	public Grade removeGrade(String className) {
		
		int index = indexOfGrade(className);
		
		if(index != -1) {
			
			Grade temp = grades[index];
			grades[index] = null;
			return temp;
		}
		
		return null;
	}
	

	@Override
	public String toString() {
		return "ID=" + studentId + ", Name=" + name + ", Standing=" + standing + ", GPA=" + getGpa();
	}

}

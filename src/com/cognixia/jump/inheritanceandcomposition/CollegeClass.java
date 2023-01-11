package com.cognixia.jump.inheritanceandcomposition;

// start by creating this class with variables: subject, className, building, and roomNumber
// generate constructor, getters/setters, toString
// add array of students at the end once student class is created
public class CollegeClass {

	private String subject;
	private String className;
	private String building;
	private int roomNumber;
	private int classSize; // only generate getter for size

	private Student[] students;
	
	// default constructor
	public CollegeClass() {
		this("N/A", "N/A", "N/A", -1);
	}

	public CollegeClass(String subject, String className, String building, int roomNumber) {
		super();// ?
		this.subject = subject;
		this.className = className;
		this.building = building;
		this.roomNumber = roomNumber;
		this.students = new Student[30]; // assume max size is 30
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}
	
	public int getClassSize() {
		return classSize;
	}
	
	// Get, add, and delete student

	// created so we don't need to keep adding for loops
	// each time we do our get, add, and delete
	private int indexOfStudent(int id) {
		
		for(int s = 0; s < students.length; s++) {
			
			if(students[s] == null) { // check first not null
				continue;
			}
			else if(students[s].getStudentId() == id) {
				return s;
			}
		}
		
		return -1; // default if no student found		
	}
	
	// get student
	public Student getStudent(int id) {
		
		int index = indexOfStudent(id); // finds index where student is
		
		if(index != -1) {
			return students[index]; // returns student
		}
		
		return null; // returns null for not found if index is -1
	}

	// add new student
	public Student addStudent(Student newStudent) {

		if(classSize == students.length) { // reach capacity, don't add
			return null;
		}
		if (getStudent(newStudent.getStudentId()) == null) { // as long as new student isn't in class already...

			for (int s = 0; s < students.length; s++) {

				if (students[s] == null) { // ...add new student where there is a blank spot open
					students[s] = newStudent;
					classSize++;
					return newStudent;
				}
			}
		}
		
		return null;
	}
	
	// delete student
	public Student removeStudent(int id) {
		
		int index = indexOfStudent(id);
		
		if(index != -1) {
			Student temp = students[index];
			students[index] = null; // remove student if found
			classSize--;
			return temp; // return student removed
		}
		
		return null; // return null if not removed
	}
	
	// print students in class
	public void listStudents() {
		
		if(classSize == 0) {
			System.out.println("No students in " + className);
		}
		else {
			for (Student s : students) {

				if (s != null) {
					System.out.println(s);
				}
			}
		}
	}
	
	

	@Override
	public String toString() {
		return "CollegeClass [subject=" + subject + ", className=" + className + ", building=" + building
				+ ", roomNumber=" + roomNumber + "]";
	}
	

}

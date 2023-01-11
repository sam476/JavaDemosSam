package com.cognixia.jump.inheritanceandcomposition;

public class Grade {

	private String className;
	private double numberGrade;

	public Grade(String className, double numberGrade) {
		super();
		this.className = className;
		this.numberGrade = numberGrade;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public double getNumberGrade() {
		return numberGrade;
	}

	public void setNumberGrade(double numberGrade) {
		this.numberGrade = numberGrade;
	}

	@Override
	public String toString() {
		return "Grade [className=" + className + ", numberGrade=" + numberGrade + "]";
	}
}

package com.cognixia.jump.arrays;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class ArraysExample {

	public static void main(String[] args) {
		double[] testScores;
		testScores = new double[5];
		
		// set the value of the array 
		testScores[0] = 89.5;
		testScores[1] = 55.2;
		testScores[2] = 30.9;
		testScores[3] = 92;
		testScores[4] = 80.25;

		System.out.println(testScores[2]);
		System.out.println(testScores); // prints the address of the array 
		
		// find the average score of the test values 
		double sum = 0; 
		
		for(int i = 0; i < testScores.length; i++) {
			sum = sum + testScores[i];
		}
		
		double average = sum / testScores.length;
		
		System.out.println("Average test scores " + average);
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Average test scores " + df.format(average));
		
		Pet[] pets;
		pets = new Pet[4];
		pets[0] = new Pet();
		pets[1] = new Pet("Tiger", LocalDate.of(2015, 4, 12), "cat");
		
		// attribute but can't change the object itself 
		// actual number but can't change the int itself
		
	   
	}
	
	

}

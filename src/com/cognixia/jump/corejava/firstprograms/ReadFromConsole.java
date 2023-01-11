package com.cognixia.jump.corejava.firstprograms;
import java.util.Scanner;
//Simple program to use scanner for user input and print it back to the console
public class ReadFromConsole  {
	 
	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in);
		// prompt the user for input
		System.out.println("Enter values: ");
		// read from the console 
		String storedInput = input.nextLine();
		//output input 
		System.out.println("Your input was: " + storedInput);
		// close scanner 
		input.close();

	}

}

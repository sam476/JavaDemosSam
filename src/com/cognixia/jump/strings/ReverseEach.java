package com.cognixia.jump.strings;

import java.lang.reflect.Array;

public class ReverseEach {

	public static void main(String[] args) {
		
		// Solution by having each character reverse in place
		String str = "Hello World";
		
		String[] arr = str.split("");
		StringBuilder str2 = new StringBuilder("");
		System.out.println("Testing to see if string builder is reversed");
		System.out.println();
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.print(arr[i]);
			str2.append(arr[i]);
		}
		System.out.println("\n" + "\n" + "Solution with each letter reversed in place:");
		
		int y = 1;
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str2.substring(i, arr.length));
			System.out.print(str.substring(y, str.length())); // correct
			y++;
			System.out.println();
		}
	    
		// Actual solution according to what the problem wanted
        // with each character reversed individually
		System.out.println("\n" + "Solution with only the individual letters reversed:");
		
        String strOther = "Hello World";
		
		String[] arrOther = str.split("");
		
		for(int i = strOther.length() - 1; i >= 0; i--) {
			System.out.print(arrOther[i]);
		}
		
	}

}
